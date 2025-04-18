package com.kh.mybatis.board.model.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.board.model.vo.Board;
import com.kh.mybatis.board.model.vo.Reply;
import com.kh.mybatis.common.model.vo.PageInfo;

public class BoardDao {

	public int selectListCount(SqlSession sqlSession) {
		return sqlSession.selectOne("boardMapper.selectListCount");
	}
//====================================================================================
	public ArrayList<Board> selectList(SqlSession sqlSession, PageInfo pi){
	
//		마이바티스에서는 페이징 처리를 위해 RowBounds라는 클래스 제공
		//*offset : 몇개의 게시글 건너 뛰고 조회할 건지에 대한 값
		
		/*
		 * ex) boardLimit : 5
		 * 
		 * 								offset(건너뛸 숫자)	limit(조회할/가져올 숫자)
		 * currentPage : 1	 1~5				0				    5
		 * currentPage : 2	 6~10				5					5
		 * currentPage : 3	 11~15				10					5
		 * ...
		 */
		
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		int limit = pi.getBoardLimit();
		
		RowBounds rowBounds = new RowBounds(offset, limit);
		
		ArrayList<Board> list = (ArrayList)sqlSession.selectList("boardMapper.selectList", null, rowBounds);
		return list;

	}
//==============================상세조회==========================================
	
	public int increaseCount(SqlSession sqlSession, int boardNo) {
		return sqlSession.update("boardMapper.increaseCount",boardNo);
	}
//====================================================================================

	public Board selectBoard(SqlSession sqlSession, int boardNo) {
		return sqlSession.selectOne("boardMapper.selectBoard", boardNo);
	}
//====================================================================================

	public ArrayList<Reply> selectReplyList(SqlSession sqlSession, int boardNo){
		return (ArrayList)sqlSession.selectList("boardMapper.selectReplyList", boardNo);
	}
//============================검색기능====================================================

	public int selectSearchCount(SqlSession sqlSession,HashMap<String, String> map) {
		return sqlSession.selectOne("boardMapper.selectSearchCount", map);
	}
//============================검색기능2====================================================
	
	public ArrayList<Board> selectSearchList(SqlSession sqlSession,HashMap<String, String> map, PageInfo pi){
		
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		int limit = pi.getBoardLimit(); // 하나 누르면 몇개씩 보여줄까
		
		RowBounds rowBounds = new RowBounds(offset, limit);
		
		return (ArrayList)sqlSession.selectList("boardMapper.selectSearchList", map, rowBounds); 
		
		//키워드, 컨디션을 맵에 담아와여 여기에 넣을수 있다 왜
	}

}
