package com.hq.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="crm_employee")
public class Emp {

	// 对象oid 对应数据库表主键字段
	@Id//没有指定注解生成策略  默认assigned
	@GeneratedValue(strategy=GenerationType.IDENTITY)//主键值
	@Column(name="emp_id")
	private Integer eid;
	@Column(name="e_name",length=30,nullable=false)
	private String ename;
	@Column(name="sex",length=6)
	private String sex;
	@Transient//不产生列
	private Date hiredate;
	@Column(length=11)
	private String mobile;
	@Column(length=30)
	private String job;
	@Column(length=20)
	private String  salary;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(Integer eid, String ename, String sex, Date hiredate, String mobile, String job, String salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sex = sex;
		this.hiredate = hiredate;
		this.mobile = mobile;
		this.job = job;
		this.salary = salary;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
}
