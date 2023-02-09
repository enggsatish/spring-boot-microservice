package com.satish.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.satish.userservice.entity.UserVo;

@Repository
public interface UserRepository extends JpaRepository<UserVo, Long>{

	UserVo findByUserId(Long userId);

}
