package com.ytj.ssm.dao;

import com.ytj.ssm.model.StudentModel;

public interface StudentDao {
	public StudentModel studentByName(String name);
}
