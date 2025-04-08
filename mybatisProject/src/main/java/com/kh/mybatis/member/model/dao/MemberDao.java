package com.kh.mybatis.member.model.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.member.model.vo.Member;

public class MemberDao {

	public int insertMember(SqlSession sqlSession, Member m) {
		
		/*
		 * sqlSession에서 제공하는 메소드를 통해서 sql문을 찾아서 실행하고 결과를 바로 받음
		 * 
		 * sqlSession.sql종류에맞는메소드("매퍼의 별칭.해당sql문의 고유한 id", [그 sql문을 완성시킬 객체])
		 */
		
		int result = sqlSession.insert("memberMapper.insertMember", m);
		return result;
	}
	
	public Member loginMember(SqlSession sqlSession, Member m) {
		
		Member loginUser = sqlSession.selectOne("memberMapper.loginMember", m);
		
		return loginUser;
	}
}
