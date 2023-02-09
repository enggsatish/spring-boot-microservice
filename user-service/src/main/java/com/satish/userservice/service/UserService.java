package com.satish.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.satish.userservice.entity.UserVo;
import com.satish.userservice.repository.UserRepository;
import com.satish.userservice.vo.Department;
import com.satish.userservice.vo.ResponseTemplateVo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public UserVo saveUser(UserVo user) {
		log.info("Inside UserService : saveUser");
		return userRepository.save(user);
	}

	public ResponseTemplateVo getUserWithDepartment(Long userId) {
		log.info("Inside UserService : getUserWithDepartment");
		ResponseTemplateVo vo = new ResponseTemplateVo();
		UserVo user = userRepository.findByUserId(userId);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), Department.class);
		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
	}
}
