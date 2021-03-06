package com.kwce.controller;


import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.slf4j.LoggerFactory;
import com.kwce.dao.BoardDAO;
import com.kwce.domain.BoardVO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class BoardDAOTest {
	@Autowired
	private BoardDAO dao;
	private static final Logger Logger = LoggerFactory.getLogger(BoardDAOTest.class);

	@Test 
	public void testCreate() throws Exception {
		
		BoardVO board = new BoardVO();
		board.setTitle("새로운 글을 넣습니다.");
		board.setContent("새로운 글을 넣습니다.");
		board.setWriter("2015722032");
		dao.create_purchase(board);
		
	}

	@Test @Ignore
	public void testRead() throws Exception{
		
		Logger.info(dao.read_purchase(1).toString());
	}
	
	@Test @Ignore
	public void testUpdate() throws Exception{

		BoardVO board = new BoardVO();
		board.setBno(1);
		board.setTitle("수정된 글입니다.");
		board.setContent("수정 테스트");
		dao.update_purchase(board);
		
	}
	
	@Test  @Ignore
	public void testDelete() throws Exception{
		
		dao.delete_purchase(1);
	}
	
	
	
	@Test @Ignore
	public void testTenCreate() throws Exception {
		BoardVO board = new BoardVO();
		for(int i=0;i<30;i++) {
			board.setTitle(i+"번째 글을 넣었습니다.");
			board.setContent("새로운 글을 넣습니다.");
			board.setWriter("2015722032");
			dao.create_freetalk(board);
		}
		
	}
	
	@Test @Ignore
	public void testListAll() throws Exception {
		List<BoardVO> list = dao.listAll();
		for(BoardVO boardVO : list) {
			
			Logger.info(boardVO.getBno()+":"+boardVO.getTitle());
		}
	}

	
}
