package com.satish.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satish.department.entity.Department;
import com.satish.department.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}
	
	public Department findDepartmentById(Long departmentId) {
		return departmentRepository.findByDepartmentId(departmentId);
	}
}
