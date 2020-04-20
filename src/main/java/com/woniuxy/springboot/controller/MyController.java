package com.woniuxy.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniuxy.springboot.entity.Stu;
import com.woniuxy.springboot.service.StuService;

//相当于在每个方法上加@ResponseBody，返回都是json
@RestController
@Controller
public class MyController {

	@Autowired
	StuService stuService;
	
	@RequestMapping("/getAll")
	public List<Stu> getAll() {
		return stuService.getAllStus();
	}
}
