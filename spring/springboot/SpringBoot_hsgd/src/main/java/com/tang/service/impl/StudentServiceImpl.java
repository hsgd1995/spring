package com.tang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tang.entity.Student;
import com.tang.repository.StudentRepository;
import com.tang.service.IStudentService;
/**
 * jpa测试-学生
 * @author Administrator
 *
 */
@Service
public class StudentServiceImpl implements IStudentService{
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.getOne(id);
	}

	@Override
	public List<Student> findAll(){
		return studentRepository.findAll();
	}
	
	@Override
	public void addStudent(Student student) {
		studentRepository.save(student);
	}
	
	
}
