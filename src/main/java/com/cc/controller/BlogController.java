package com.cc.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cc.entity.Blog;
import com.cc.service.BlogService;

@RestController
@RequestMapping(value = "/blog")
public class BlogController {
    @Value("${my.secret}")
    private String a;

    @Autowired
    private BlogService blogService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(format, true));
    }

    /**
     * 显示列表
     * 
     * @param blog
     * @return
     */
    @RequestMapping("list")
    public Map<String, Object> list(Blog blog, ModelMap modelMap) {
        List<Blog> blogList = blogService.listPageBlog(blog);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("list", blogList);
        map.put("page", blog.getPage());
        return map;
    }

    /**
     * 请求编辑页面
     * 
     * @param blogId
     * @return
     */
    @RequestMapping(value = "/load")
    public String load(Blog blog, ModelMap modelMap) {

        blog = blogService.getBlogById(blog.getBlogId());
        modelMap.addAttribute("blog", blog);
        return "blog/BlogInfo";
    }

    /**
     * 保存店铺信息
     * 
     * @param Equipment
     * @return
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Blog save(@RequestBody Blog blog) {
        try {
            if (blog.getBlogId() == null || blog.getBlogId().intValue() == 0) {
                if (blog.getBlogContent() != null && !blog.getBlogContent().equals("")) {
                    if (blog.getBlogContent().length() > 100) {
                        blog.setBlogDescription(blog.getBlogContent().substring(0, blog.getBlogContent().length() / 2));
                    }
                    blog.setBlogger(1);
                    blog.setBlogType(1);
                    blog.setCreateTime(new Date());
                    blog.setCreateUser(1);
                    blog.setUpdateTime(new Date());
                    blog.setUpdateUser(1);

                    blogService.insert(blog);
                }
            }
            else {
                blogService.updateBlog(blog);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return blog;
    }

    /**
     * 查看详情
     * 
     * @param blogId
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public String delete(Blog blog, ModelMap modelMap) {
        blogService.deleteBlog(blog);
        return "删除成功";
    }
}
