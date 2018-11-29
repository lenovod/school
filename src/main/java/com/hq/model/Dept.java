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
@Table(name="crm_dept")
public class Dept {

	// 对象oid 对应数据库表主键字段
	@Id//没有指定注解生成策略  默认assigned
	@GeneratedValue(strategy=GenerationType.IDENTITY)//主键值
	@Column(name="de_id")
	private Integer did;
	@Column(name="de_name",length=30,nullable=false)
	private String dname;

	
	
	
}
