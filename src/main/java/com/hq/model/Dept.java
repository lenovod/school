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

	// ����oid ��Ӧ���ݿ�������ֶ�
	@Id//û��ָ��ע�����ɲ���  Ĭ��assigned
	@GeneratedValue(strategy=GenerationType.IDENTITY)//����ֵ
	@Column(name="de_id")
	private Integer did;
	@Column(name="de_name",length=30,nullable=false)
	private String dname;

	
	
	
}
