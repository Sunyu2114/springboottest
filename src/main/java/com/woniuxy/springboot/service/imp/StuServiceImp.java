package com.woniuxy.springboot.service.imp;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.springboot.entity.Stu;
import com.woniuxy.springboot.mapper.StuMapper;
import com.woniuxy.springboot.service.StuService;

@Service
public class StuServiceImp implements StuService{

	@Autowired
	StuMapper stuMapper;

	@Transactional
	@Override
	public void stuTransaction() {
		stuMapper.insertStu(new Stu(3, "ww", 13, new Date()));
		if (true) {
			throw new RuntimeException("myexception");
		}
		stuMapper.insertStu(new Stu(4, "ww", 13, new Date()));
	}

	@Override
	public List<Stu> getAllStus() {
		return stuMapper.selectAllStus();
	}
	
	
}
