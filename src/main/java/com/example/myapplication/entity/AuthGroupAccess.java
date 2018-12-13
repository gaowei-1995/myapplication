package com.example.myapplication.entity;

public class AuthGroupAccess {

	private Long member_id;
	private Long group_id;
	private Long update_time;
	private Long create_time;
	private Boolean status;
	
	public Long getMember_id() {
		return member_id;
	}
	
	public void setMember_id(Long member_id) {
		this.member_id = member_id;
	}
	
	public Long getGroup_id() {
		return group_id;
	}
	
	public void setGroup_id(Long group_id) {
		this.group_id = group_id;
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
	
	public Boolean getStatus() {
		return status;
	}
	
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
}
