package com.ytj.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ytj.ssm.model.StudentModel;
import com.ytj.ssm.service.IStudentService;

@Controller
public class StudentController {

	@Resource
	private IStudentService studentService;
	
	@RequestMapping(value = "login",method = RequestMethod.POST)
	public String login(HttpServletRequest request,Model model) {
		String name = request.getParameter("name");
		StudentModel student = studentService.studentByName(name);
		model.addAttribute("student",student);
		return "login";
	}
}
