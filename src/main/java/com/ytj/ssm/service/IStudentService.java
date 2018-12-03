package com.ytj.ssm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ytj.ssm.model.StudentModel;

public interface IStudentService extends IService<StudentModel>{
	public StudentModel studentByName(String name);
}
