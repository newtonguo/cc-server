package com.cc.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cc.entity.Location;
import com.cc.service.LocationService;

@RestController
@RequestMapping(value = "/location")
public class LocationController {

	@Autowired
	private LocationService locationService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(format,
				true));
	}

	/**
	 * 显示列表
	 * 
	 * @param location
	 * @return
	 */
	@RequestMapping("list")
	public List<Location> list(Location location) {
		List<Location> locationList = locationService
				.listPageLocation(location);
		return locationList;
	}

	/**
	 * 请求编辑页面
	 * 
	 * @param locationId
	 * @return
	 */
	@RequestMapping(value = "/load")
	public String load(Location location, ModelMap modelMap) {
		location = locationService.getLocationById(location.getId());
		modelMap.addAttribute("location", location);
		return "location/LocationInfo";
	}

	/**
	 * 保存店铺信息
	 * 
	 * @param Equipment
	 * @return
	 */
	@RequestMapping(value = "/save")
	public Location save(Location location, ModelMap modelMap) {
		try {
			if (location.getId() == null || location.getId().intValue() == 0) {
				locationService.insert(location);
			} else {
				locationService.updateLocation(location);
			}
			modelMap.addAttribute("success", "success");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return location;
	}

	/**
	 * 查看详情
	 * 
	 * @param locationId
	 */
	@RequestMapping(value = "/delete")
	@ResponseBody
	public String delete(Location location, ModelMap modelMap) {
		locationService.deleteLocation(location);
		return "删除成功";
	}
}
