package com.spring.Spring_JDBC_DATASOURCE;

public class Student {
	private int sid;
	private String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public void display() {
		System.out.println(sid+" "+sname);
	}

}
