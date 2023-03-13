package com.tenco.blog.dao;

public interface IBlogDAO {
	int save(String title, String content, int UserId);

	void select();

	void update();

	void delete(int boardId);
}
