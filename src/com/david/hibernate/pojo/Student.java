package com.david.hibernate.pojo;

import java.util.Date;

public class Student
{
	// 学号
	private Integer sid;

	// 姓名
	private String sname;

	// 性别
	private String gender;

	// 生日
	private Date brithday;

	// 地址
	private String address;

	public Student()
	{

	}

	public Student(String sname, String gender, Date brithday,
			String address)
	{
		this.sname = sname;
		this.gender = gender;
		this.brithday = brithday;
		this.address = address;
	}

	@Override
	public String toString()
	{
		return "Student [sid=" + sid + ", sname=" + sname + ", gender="
				+ gender + ", brithday=" + brithday + ", address=" + address
				+ "]";
	}

	public Integer getSid()
	{
		return sid;
	}

	public void setSid(Integer sid)
	{
		this.sid = sid;
	}

	public String getSname()
	{
		return sname;
	}

	public void setSname(String sname)
	{
		this.sname = sname;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	public Date getBrithday()
	{
		return brithday;
	}

	public void setBrithday(Date brithday)
	{
		this.brithday = brithday;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

}
