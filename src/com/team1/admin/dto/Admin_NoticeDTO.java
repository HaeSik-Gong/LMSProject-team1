package com.team1.admin.dto;


public class Admin_NoticeDTO {
	private int idx, hit;
	private String username, title, memo, curdate, curtime;

	public Admin_NoticeDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getCurdate() {
		return curdate;
	}

	public void setCurdate(String curdate) {
		this.curdate = curdate;
	}

	public String getCurtime() {
		return curtime;
	}

	public void setCurtime(String curtime) {
		this.curtime = curtime;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}
}
