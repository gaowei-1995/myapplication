package com.example.myapplication.entity;

import java.io.Serializable;

public class Menu implements Serializable {

	private Long id;
	private String name;
	private Long pid;
	private Long sort;
	private String module;
	private String url;
	private Boolean is_hide;
	private String icon;
	private Boolean status;
	private Long update_time;
	private Long create_time;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Long getPid() {
		return pid;
	}
	
	public void setPid(Long pid) {
		this.pid = pid;
	}
	
	public Long getSort() {
		return sort;
	}
	
	public void setSort(Long sort) {
		this.sort = sort;
	}
	
	public String getModule() {
		return module;
	}
	
	public void setModule(String module) {
		this.module = module;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public Boolean getIs_hide() {
		return is_hide;
	}
	
	public void setIs_hide(Boolean is_hide) {
		this.is_hide = is_hide;
	}
	
	public String getIcon() {
		return icon;
	}
	
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	public Boolean getStatus() {
		return status;
	}
	
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	public Long getUpdate_time() {
		return update_time;
	}
	
	public void setUpdate_time(Long update_time) {
		this.update_time = update_time;
	}
	
	public Long getCreate_time() {
		return create_time;
	}
	
	public void setCreate_time(Long create_time) {
		this.create_time = create_time;
	}
	
}
