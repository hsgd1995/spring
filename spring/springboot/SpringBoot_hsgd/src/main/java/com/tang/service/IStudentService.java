package com.tang.service;

import com.tang.entity.Student;

/**
 * jpa测试-学生
 * 
 * @author Administrator
 *
 */
public interface IStudentService {

	/**
	 * 根据id获取学生
	 * 
	 * @param id
	 * @return
	 */
	Student getStudentById(Long id);

	/**
	 * 添加学生
	 * @param student
	 */
	void addStudent(Student student);

}
