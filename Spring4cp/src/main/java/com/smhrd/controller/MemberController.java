package com.smhrd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smhrd.entity.Member;
import com.smhrd.mapper.BoardMapper;
import com.smhrd.mapper.MemberMapper;

@Controller

public class MemberController {
	
	@Autowired
	private MemberMapper mapper;
	
	@Autowired
	private PasswordEncoder pwEnc;

	
	@RequestMapping
	public String join() {
		mapper.join(vo);
		
		return "wait";
	}
}
