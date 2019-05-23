package com.example.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * user数据访问层
 * 
 * @author Administrator
 * @date 2019年5月14日
 */
public interface UserRepository extends JpaRepository<User, Long> {
	/**
	 * 根据userName查找用户
	 * @param userName
	 * @return
	 */
	User findByUserName(String userName);

	/**
	 * 根据userName或者email查找用户
	 * @param username
	 * @param email
	 * @return
	 */
	User findByUserNameOrEmail(String username, String email);
	
}
