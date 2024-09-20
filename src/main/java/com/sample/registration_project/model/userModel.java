package com.sample.registration_project.model;

public class userModel {
	private String id;
	private String name;
	private int age;
	private String gender;
	private String country;
	
	public userModel(String id,String name,int age,String gender,String country) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.country=country;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
