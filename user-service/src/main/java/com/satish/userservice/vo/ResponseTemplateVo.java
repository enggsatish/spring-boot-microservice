package com.satish.userservice.vo;

import com.satish.userservice.entity.UserVo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVo {

	private UserVo user;
	private Department department;
}
