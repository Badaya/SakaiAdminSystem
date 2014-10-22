package com.sakai.system.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sakai.system.service.TeacherService;

@Controller
@RequestMapping(value="/faculty")
public class FacultyController {
	
	@Autowired
	private TeacherService facultyService;
	

}
