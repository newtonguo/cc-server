package com.cc.entity;

import java.sql.Timestamp;
import java.util.List;

/**
 * �˵��� <b>Application describing:</b> <br>
 * <b>Copyright:</b>Copyright &copy; 2014 <br>
 * <b>Company:vvme</b><br>
 * <b>Date:</b>2014-9-12����5:50:11<br>
 * 
 * @author cuicong
 */

public class Menu implements java.io.Serializable {

    // Fields

    /**
     * {�ֶι�������}
     */
    private static final long serialVersionUID = 1L;

    private Integer menuId;

    private String menuName;

    private String menuUrl;

    private Timestamp updateTime;

    private String updatePerson;

    private Integer updatePersonId;

    private Integer level;

    private Integer PId;

    private List<Menu> children;// �����˵�

    private String belongRoleId = "";// ������ɫid

    private String isLocked;// �Ƿ���

    private String enableFlag;// �Ƿ����

    private String menuSort;// ����

    private String pName;

    // Constructors
    private Page page;

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getBelongRoleId() {
        return belongRoleId;
    }

    public String getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(String isLocked) {
        this.isLocked = isLocked;
    }

    public String getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(String enableFlag) {
        this.enableFlag = enableFlag;
    }

    public String getMenuSort() {
        return menuSort;
    }

    public void setMenuSort(String menuSort) {
        this.menuSort = menuSort;
    }

    public void setBelongRoleId(String belongRoleId) {
        this.belongRoleId = belongRoleId;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /** default constructor */
    public Menu() {
    }

    /** full constructor */
    public Menu(String menuName, String menuUrl, Timestamp updateTime, String updatePerson, Integer updatePersonId,
            Integer level, Integer PId) {
        this.menuName = menuName;
        this.menuUrl = menuUrl;
        this.updateTime = updateTime;
        this.updatePerson = updatePerson;
        this.updatePersonId = updatePersonId;
        this.level = level;
        this.PId = PId;
    }

    // Property accessors

    public Integer getMenuId() {
        return this.menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return this.menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return this.menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdatePerson() {
        return this.updatePerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson;
    }

    public Integer getUpdatePersonId() {
        return this.updatePersonId;
    }

    public void setUpdatePersonId(Integer updatePersonId) {
        this.updatePersonId = updatePersonId;
    }

    public Integer getLevel() {
        return this.level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getPId() {
        return this.PId;
    }

    public void setPId(Integer PId) {
        this.PId = PId;
    }

}