package com.smhrd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member {
	private String id;
	private String pw;
	private String nick;
	private String name;
	private String email;
	private String birth;
	private String phone;
	private String grade;
	private String scname;
	private String scid;
	private String status;
	private String imgpath;
	
}
