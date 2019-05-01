package com.app.attendanceManager.studentservice.student;


import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


@Document(indexName = "student", type = "student")
public class Student implements Serializable{

	@Id
	String id;

	String fName;
	String mName;
	String lName;
	String gender;
	@Email
	String email;

	@Size(min=10,max=10)
	@Pattern(regexp="(^$|[0-9]{10})")
	String cNo;



	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Student(String id, String fName, String mName, String lName, String gender, @Email String email,
			@Size(min = 10, max = 10) @Pattern(regexp = "(^$|[0-9]{10})") String cNo) {
		super();
		this.id = id;
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.gender = gender;
		this.email = email;
		this.cNo = cNo;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getcNo() {
		return cNo;
	}

	public void setcNo(String cNo) {
		this.cNo = cNo;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", fName=" + fName + ", mName=" + mName + ", lName=" + lName + ", gender=" + gender
				+ ", email=" + email + ", cNo=" + cNo + "]";
	}



}
