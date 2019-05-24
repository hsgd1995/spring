package com.tang.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tang.entity.Student;

/**
 * jpa接口-学生
 * @author Administrator
 *
 */
public interface StudentRepository extends JpaRepository<Student, Long>{

}
