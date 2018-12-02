package com.ytj.ssm.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ytj.ssm.model.StudentModel;

public interface StudentDao extends BaseMapper{
	public StudentModel studentByName(String name);
}
