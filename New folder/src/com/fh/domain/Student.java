package com.fh.domain;
// Generated Mar 25, 2016 11:08:13 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Student generated by hbm2java
 */
public class Student implements java.io.Serializable {

	private Integer stuId;
	private Classes classes;
	private String password;
	private String name;
	private String gender;
	private Date birthday;
	private String hobbies;
	private String email;
	private Set courses = new HashSet(0);
	private Set courses_1 = new HashSet(0);

	public Student() {
	}

	public Student(String password, String name, String gender) {
		this.password = password;
		this.name = name;
		this.gender = gender;
	}

	public Student(Classes classes, String password, String name, String gender, Date birthday, String hobbies,
			String email, Set courses, Set courses_1) {
		this.classes = classes;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.hobbies = hobbies;
		this.email = email;
		this.courses = courses;
		this.courses_1 = courses_1;
	}

	public Integer getStuId() {
		return this.stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public Classes getClasses() {
		return this.classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getHobbies() {
		return this.hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set getCourses() {
		return this.courses;
	}

	public void setCourses(Set courses) {
		this.courses = courses;
	}

	public Set getCourses_1() {
		return this.courses_1;
	}

	public void setCourses_1(Set courses_1) {
		this.courses_1 = courses_1;
	}

}