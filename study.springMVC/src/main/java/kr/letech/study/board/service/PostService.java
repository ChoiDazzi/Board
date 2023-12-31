package kr.letech.study.board.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kr.letech.study.board.vo.PostVO;

public interface PostService {
	/* select */
	String getNavNm(String boardId);
	PostVO getPost(String postId);
	String getCurrentTime();
	
	/* insert */
	void insertPost(PostVO postVO, String userId, List<MultipartFile> files);
	
    /* update */
    void modifyPost(PostVO postVO, List<MultipartFile> files, String userId);
    void deletePost(String postId);
}

