package com.kh.mybatis.board.model.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.kh.mybatis.board.model.vo.Board;
import com.kh.mybatis.board.model.vo.Reply;
import com.kh.mybatis.common.model.vo.PageInfo;

public interface BoardService {

	//게시판 리스트 조회
	int selectListCount();
	
	ArrayList<Board> selectList(PageInfo pi);
	
	//게시글 상세 조회
	int increaseCount(int boardNo);
	Board selectBoard(int boardNo);
	ArrayList<Reply> selectReplyList(int boardNo);	//댓글조회
	
	//게시글 검색
	int selectSearchCount(HashMap<String, String> map);
	//진짜검색
	ArrayList<Board> selectSearchList(HashMap<String, String> map, PageInfo pi);
}
