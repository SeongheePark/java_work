package com.tenco.blog.controller;

import com.tenco.blog.service.BlogService;

public class BlogController {
	private BlogService blogService;

	public BlogController() {
		blogService = new BlogService();
	}

	// 블로그 글쓰기 기능 요청
	public int reqSaveBoard(String title, String content, int userId) {
		int resultRowCount = 0;
		// 방어적 코드 작성
		if (userId != 0) {
			resultRowCount = blogService.saveBoard(title, content, userId);
			return resultRowCount;
		}
		return 0;
	}

	// 게시글 삭제 요청
	public void reqDeleteBoard(int boardId, int userId) {
		blogService.deleteByBoardId(boardId, userId);
	}
}
