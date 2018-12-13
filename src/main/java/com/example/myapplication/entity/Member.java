package com.example.myapplication.entity;

import java.io.Serializable;

public class Member implements Serializable {
	
	private Long id;
	private String nickname;
	private String username;
	private String password;
	private String email;
	private String mobile;
	private Long update_time;
	private Long create_time;
	private Boolean status;
	private Long leader_id;
	private Boolean is_share_member;
	private Boolean is_inside;

	public Member() {
		super();
	}

	public Member(String username) {
		super();
		this.username = username;
	}

	public Member(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public Long getLeader_id() {
		return leader_id;
	}

	public void setLeader_id(Long leader_id) {
		this.leader_id = leader_id;
	}

	public Boolean getIs_share_member() {
		return is_share_member;
	}

	public void setIs_share_member(Boolean is_share_member) {
		this.is_share_member = is_share_member;
	}

	public Boolean getIs_inside() {
		return is_inside;
	}

	public void setIs_inside(Boolean is_inside) {
		this.is_inside = is_inside;
	}
	
}
