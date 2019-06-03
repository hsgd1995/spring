package com.tang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tang.entity.Student;
import com.tang.service.IStudentService;

/**
 * jpa测试-学生
 * 
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private IStudentService studentService;

	/**
	 * 根据id获取学生
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("getStudentById")
	public Object getStudentById(Long id) {
		Student s = studentService.getStudentById(id);
		return s;
	}

	@RequestMapping("findAll")
	public Object findAll(){
		return studentService.findAll();
	}
	
	/**
	 * 添加学生
	 * @param student
	 * @return
	 */
	@RequestMapping("addStudent")
	public Object addStudent(Student student) {
		studentService.addStudent(student);
		return "success";
	}
}
