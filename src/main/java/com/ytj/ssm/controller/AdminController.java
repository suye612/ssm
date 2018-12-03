package com.ytj.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.core.conditions.query.EmptyWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ytj.ssm.model.AdminModel;
import com.ytj.ssm.service.IAdminService;

@Controller
public class AdminController {
	@Autowired
	private IAdminService adminService;
	
	@RequestMapping("/login")
	public void login(AdminModel admin){
		QueryWrapper<AdminModel> wrapper = new EmptyWrapper<AdminModel>();
		wrapper.and(i ->i.eq("username", admin.getUsername()).eq("password", admin.getPassword()));
		List<AdminModel> list = adminService.list(wrapper);
		if(list!=null && list.size()>0){
			
		}else{
			
		}
		
	}
	
	
	
}
