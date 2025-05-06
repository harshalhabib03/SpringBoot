package com.example.demo.model;

public class Register {
	private String rName;
	private String rEmailId;
	private Integer rMobileno;
	private Object password;
	public Register(String rName, String rEmailId, Integer rMobileno, Object password) {
		super();
		this.rName = rName;
		this.rEmailId = rEmailId;
		this.rMobileno = rMobileno;
		this.password = password;
	}
	public String getrName() {
		return rName;
	}
	public void setrName(String rName) {
		this.rName = rName;
	}
	public String getrEmailId() {
		return rEmailId;
	}
	public void setrEmailId(String rEmailId) {
		this.rEmailId = rEmailId;
	}
	public Integer getrMobileno() {
		return rMobileno;
	}
	public void setrMobileno(Integer rMobileno) {
		this.rMobileno = rMobileno;
	}
	public Object getPassword() {
		return password;
	}
	public void setPassword(Object password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Register [rName=" + rName + ", rEmailId=" + rEmailId + ", rMobileno=" + rMobileno + ", password="
				+ password + "]";
	}
	
}
