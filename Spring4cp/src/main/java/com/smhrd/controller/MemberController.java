package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
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
	public String join(HttpServletRequest request) {
		
		MultipartRequest multi = null;
		
		int fileMaxSize = 10 * 1024 * 10000;
		String savePath = request.getRealPath("resources/board");
		System.out.println(savePath);
		
		try {
			multi = new MultipartRequest(request, savePath, fileMaxSize, "UTF-8", new DefaultFileRenamePolicy());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String id = multi.getParameter("id");
		String pw = multi.getParameter("pw");
		String nick= multi.getParameter("nick");
		String name= multi.getParameter("name");
		String email= multi.getParameter("email");
		String birth= multi.getParameter("birth");
		String phone= multi.getParameter("phone");
		String grade= multi.getParameter("grade");
		String scname= multi.getParameter("scname");
		String scid= multi.getParameter("scid");
		String status= multi.getParameter("status");
		String imgpath= multi.getParameter("imgpath");
		
		Member vo = new Member();
		vo.setId(id);
		vo.setPw(pw);
		vo.setNick(nick);
		vo.setName(name);
		vo.setEmail(email);
		vo.setBirth(birth);
		vo.setPhone(phone);
		vo.setGrade(grade);
		vo.setScname(scname);
		vo.setScid(scid);
		vo.setStatus(status);
		vo.setImgpath(imgpath);
		
		
		mapper.join(vo);
		
		return "wait";
	}
}
