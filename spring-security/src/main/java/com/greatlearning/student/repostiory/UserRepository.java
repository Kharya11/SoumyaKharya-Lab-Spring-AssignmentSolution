package com.greatlearning.student.repostiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.greatlearning.student.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query("select u from User u where u.username=?1")
	public User findByUserName(String username);
	
}
