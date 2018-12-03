package com.ytj.ssm.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ytj.ssm.dao.StudentDao;
import com.ytj.ssm.model.StudentModel;
import com.ytj.ssm.service.IStudentService;

@Service("studentService")
public class StudentServiceImpl implements IStudentService{
	@Resource
	private StudentDao studentDao;

	public StudentModel studentByName(String name) {
		StudentModel studentModel = studentDao.studentByName(name);
		return studentModel;
	}

}
