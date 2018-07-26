package com.cffex.auctionsystem.bean;

public class User {
	
	private Integer id;
	
	private String  sex;
	
	private Integer age;
	
	private String name;
	
	private String aa;
	
	private String bb;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAa() {
		return aa;
	}

	public void setAa(String aa) {
		this.aa = aa;
	}

	public String getBb() {
		return bb;
	}

	public void setBb(String bb) {
		this.bb = bb;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", sex=" + sex + ", age=" + age + ", name=" + name + ", aa=" + aa + ", bb=" + bb
				+ "]";
	}
	
	
}
