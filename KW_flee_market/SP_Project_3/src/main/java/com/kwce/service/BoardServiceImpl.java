package com.kwce.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kwce.dao.BoardDAO;
import com.kwce.domain.BoardVO;
import com.kwce.domain.Criteria;


@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO dao;
		
	@Override
	public List<BoardVO> listAll() throws Exception {
		return dao.listAll();
	}
//////////////////////////////////////////////////////////
	

//	@Override
//	public List<BoardVO> purchase() throws Exception {
		
//		return dao.purchase();
//	}

//	@Override
//	public List<BoardVO> sell() throws Exception {
		
//		return dao.sell();
//	}

//	@Override
//	public List<BoardVO> after() throws Exception {
		
//		return dao.after();
//	}

//	@Override
//	public List<BoardVO> accuse() throws Exception {
		
//		return dao.accuse();
//	}

//	@Override
//	public List<BoardVO> freetalk() throws Exception {
//		
//		return dao.freetalk();
//	}
	
	
	@Override
	public List<BoardVO> paging() throws Exception {
		
		return  dao.paging();
	}

	@Override
	public void regist_purchase(BoardVO board) throws Exception {
		dao.create_purchase(board);
		
	}

	@Override
	public void regist_sell(BoardVO board) throws Exception {
		dao.create_sell(board);
		
	}

	@Override
	public void regist_after(BoardVO board) throws Exception {
		dao.create_after(board);
		
	}

	@Override
	public void regist_accuse(BoardVO board) throws Exception {
		dao.create_accuse(board);
		
	}

	@Override
	public void regist_freetalk(BoardVO board) throws Exception {
		dao.create_freetalk(board);
		
	}

	@Override
	public BoardVO read_purchase(Integer bno) throws Exception {
		dao.updateViewCnt_purchase(bno); /////////////////////////////////////
		return dao.read_purchase(bno);
	}

	@Override
	public BoardVO read_sell(Integer bno) throws Exception {
		dao.updateViewCnt_sell(bno); /////////////////////////////////////
		return dao.read_sell(bno);
	}

	@Override
	public BoardVO read_after(Integer bno) throws Exception {
		dao.updateViewCnt_after(bno); /////////////////////////////////////
		return dao.read_after(bno);
	}

	@Override
	public BoardVO read_accuse(Integer bno) throws Exception {
		dao.updateViewCnt_accuse(bno); /////////////////////////////////////
		return dao.read_accuse(bno);
	}

	@Override
	public BoardVO read_freetalk(Integer bno) throws Exception {
		dao.updateViewCnt_freetalk(bno); /////////////////////////////////////
		return dao.read_freetalk(bno);
	}

	@Override
	public void modify_purchase(BoardVO board) throws Exception {
		dao.update_purchase(board);
		
	}

	@Override
	public void modify_sell(BoardVO board) throws Exception {
		dao.update_sell(board);
		
	}

	@Override
	public void modify_after(BoardVO board) throws Exception {
		dao.update_after(board);
		
	}

	@Override
	public void modify_accuse(BoardVO board) throws Exception {
		dao.update_after(board);
		
	}

	@Override
	public void modify_freetalk(BoardVO board) throws Exception {
		dao.update_after(board);
		
	}

	@Override
	public void remove_purchase(Integer bno) throws Exception {
		dao.delete_purchase(bno);
		
	}

	@Override
	public void remove_sell(Integer bno) throws Exception {
		dao.delete_sell(bno);
		
	}

	@Override
	public void remove_after(Integer bno) throws Exception {
		dao.delete_after(bno);
		
	}

	@Override
	public void remove_accuse(Integer bno) throws Exception {
		dao.delete_accuse(bno);
		
	}

	@Override
	public void remove_freetalk(Integer bno) throws Exception {
		dao.delete_freetalk(bno);
		
	}


	@Override
	public List<BoardVO> purchaseCriteria(Criteria cri) throws Exception {
		return dao.purchaseCriteria(cri);
	}


	@Override
	public int purchaseCountCriteria(Criteria cri) throws Exception {
		return dao.purchasePaging(cri);
	}


	@Override
	public List<BoardVO> sellCriteria(Criteria cri) throws Exception {
		return dao.sellCriteria(cri);
	}


	@Override
	public int sellCountCriteria(Criteria cri) throws Exception {
		return dao.sellPaging(cri);
	}


	@Override
	public List<BoardVO> afterCriteria(Criteria cri) throws Exception {
		return dao.afterCriteria(cri);
	}


	@Override
	public int afterCountCriteria(Criteria cri) throws Exception {
		return dao.afterPaging(cri);
	}


	@Override
	public List<BoardVO> accuseCriteria(Criteria cri) throws Exception {
		return dao.accuseCriteria(cri);
	}


	@Override
	public int accuseCountCriteria(Criteria cri) throws Exception {
		return dao.accusePaging(cri);
	}


	@Override
	public List<BoardVO> freetalkCriteria(Criteria cri) throws Exception {
		return dao.freetalkCriteria(cri);
	}


	@Override
	public int freetalkCountCriteria(Criteria cri) throws Exception {
		return dao.freetalkPaging(cri);
	}

}
