package com.tang.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * jpa 测试类-学生
 * 
 * @author Administrator
 *
 */
@Entity
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class Student implements Serializable {
	private static final long serialVersionUID = 83021029595778784L;
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false, unique = true)
	private String studentNo;
	@Column(nullable = false)
	private String studentName;

	public Student() {
		super();
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentNo=" + studentNo + ", studentName=" + studentName + "]";
	}

}
