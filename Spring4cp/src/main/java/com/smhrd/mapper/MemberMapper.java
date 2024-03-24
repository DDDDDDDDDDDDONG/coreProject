package com.smhrd.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.smhrd.entity.Member;

@Mapper
public interface MemberMapper {

	void join(Member vo);

	

}
