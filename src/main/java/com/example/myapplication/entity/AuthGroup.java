package com.example.myapplication.entity;

import java.io.Serializable;

public class AuthGroup implements Serializable {
	
	private Long id;
	private String module;
	private String name;
	private String describe;
	private Boolean status;
	private String rules;
	private Long member_id;
	private Long update_time;
	private Long create_time;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getModule() {
		return module;
	}
	
	public void setModule(String module) {
		this.module = module;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescribe() {
		return describe;
	}
	
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	
	public Boolean getStatus() {
		return status;
	}
	
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	public String getRules() {
		return rules;
	}
	
	public void setRules(String rules) {
		this.rules = rules;
	}
	
	public Long getMember_id() {
		return member_id;
	}
	
	public void setMember_id(Long member_id) {
		this.member_id = member_id;
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
