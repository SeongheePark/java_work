package com.tenco.blog.service;

import com.tenco.blog.dao.BlogDAO;
import com.tenco.blog.dto.BlogDTO;

public class BlogService {

	BlogDAO blogDAO;

	public BlogService() {
		blogDAO = new BlogDAO();
	}

	// 블로그 저장 기능 로직 구현
	public int saveBoard(String title, String content, int userId) {
		int resultRowCount = 0;
		if (title.equals("") || title.length() < 2) {
			return resultRowCount;
		}
		resultRowCount = blogDAO.save(title, content, userId);
		return resultRowCount;
	}

	// 게시글 삭제 기능 로직 구현
	public void deleteByBoardId(int boardId, int userId) {

		// 삭제하려는 content가 사용자가 쓴 글이 맞는지 확인하는 과정 필요
		BlogDTO blogDTO = selectByBoardID(boardId);
		if (userId == blogDTO.getUserId()) {
			blogDAO.delete(boardId);
		}
	}

	// 하나의 게시글을 찾는 로직 구현
	public BlogDTO selectByBoardID(int boardId) {
		BlogDTO blogDTO = null;
		// blogDAO.select(); 호출 예정 --> 응답 resultset --> 클래스화 처리
		return blogDTO;
	}
}
