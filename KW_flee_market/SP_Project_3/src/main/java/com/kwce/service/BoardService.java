package com.kwce.service;
import java.util.List;
import com.kwce.domain.BoardVO;
import com.kwce.domain.Criteria;





public interface BoardService {

	
	public void regist_purchase(BoardVO board) throws Exception;
	
	public void regist_sell(BoardVO board) throws Exception;
	
	public void regist_after(BoardVO board) throws Exception;
	
	public void regist_accuse(BoardVO board) throws Exception;
	
	public void regist_freetalk(BoardVO board) throws Exception;
	
	public BoardVO read_purchase(Integer bno) throws Exception;
	
	public BoardVO read_sell(Integer bno) throws Exception;
	
	public BoardVO read_after(Integer bno) throws Exception;
	
	public BoardVO read_accuse(Integer bno) throws Exception;
	
	public BoardVO read_freetalk(Integer bno) throws Exception;
	
	public void modify_purchase(BoardVO board) throws Exception;	
	
	public void modify_sell(BoardVO board) throws Exception;
	
	public void modify_after(BoardVO board) throws Exception;
	
	public void modify_accuse(BoardVO board) throws Exception;
	
	public void modify_freetalk(BoardVO board) throws Exception;
	
	public void remove_purchase(Integer bno) throws Exception;	
	
	public void remove_sell(Integer bno) throws Exception;
	
	public void remove_after(Integer bno) throws Exception;
	
	public void remove_accuse(Integer bno) throws Exception;
	
	public void remove_freetalk(Integer bno) throws Exception;
	
	public List<BoardVO> listAll() throws Exception;

//	public List<BoardVO> purchase() throws Exception;
	
//	public List<BoardVO> sell() throws Exception;
	
//	public List<BoardVO> after() throws Exception;
	
//	public List<BoardVO> accuse() throws Exception;
	
//	public List<BoardVO> freetalk() throws Exception;
	
	
	
	public List<BoardVO> paging() throws Exception;
	
	public List<BoardVO> purchaseCriteria(Criteria cri) throws Exception; // 페이징 계산용

	public int purchaseCountCriteria(Criteria cri) throws Exception; // DB의 데이터 카운팅을 위한 메소드
	
	
	
	
	
	
	public List<BoardVO> sellCriteria(Criteria cri) throws Exception; // 페이징 계산용

	public int sellCountCriteria(Criteria cri) throws Exception; // DB의 데이터 카운팅을 위한 메소드
	
	
	
	
	
	
	public List<BoardVO> afterCriteria(Criteria cri) throws Exception; // 페이징 계산용

	public int afterCountCriteria(Criteria cri) throws Exception; // DB의 데이터 카운팅을 위한 메소드
	
	
	
	
	
	
	public List<BoardVO> accuseCriteria(Criteria cri) throws Exception; // 페이징 계산용

	public int accuseCountCriteria(Criteria cri) throws Exception; // DB의 데이터 카운팅을 위한 메소드
	
	
	
	
	
	
	public List<BoardVO> freetalkCriteria(Criteria cri) throws Exception; // 페이징 계산용

	public int freetalkCountCriteria(Criteria cri) throws Exception; // DB의 데이터 카운팅을 위한 메소드
	
	
	
	
}
