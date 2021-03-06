package com.kwce.dao;
import java.util.List;
import com.kwce.domain.BoardVO;
import com.kwce.domain.Criteria;




public interface BoardDAO {
	public void create_purchase(BoardVO vo) throws Exception;
	
	public void create_sell(BoardVO vo) throws Exception;
	
	public void create_after(BoardVO vo) throws Exception;
	
	public void create_accuse(BoardVO vo) throws Exception;
	
	public void create_freetalk(BoardVO vo) throws Exception;
	
	public BoardVO read_purchase(Integer bno) throws Exception;
	
	public BoardVO read_sell(Integer bno) throws Exception;
	
	public BoardVO read_after(Integer bno) throws Exception;
	
	public BoardVO read_accuse(Integer bno) throws Exception;
	
	public BoardVO read_freetalk(Integer bno) throws Exception;
		
	public void update_purchase(BoardVO vo) throws Exception;
	
	public void update_sell(BoardVO vo) throws Exception;
	
	public void update_after(BoardVO vo) throws Exception;
	
	public void update_accuse(BoardVO vo) throws Exception;
	
	public void update_freetalk(BoardVO vo) throws Exception;
	
	public void delete_purchase(Integer bno) throws Exception;	
	
	public void delete_sell(Integer bno) throws Exception;
	
	public void delete_after(Integer bno) throws Exception;
	
	public void delete_accuse(Integer bno) throws Exception;
	
	public void delete_freetalk(Integer bno) throws Exception;
	
	/////////////////////////////////////////////////////////////
	public void updateViewCnt_purchase(Integer bno) throws Exception;
	
	public void updateViewCnt_sell(Integer bno) throws Exception;

	public void updateViewCnt_after(Integer bno) throws Exception;
	
	public void updateViewCnt_accuse(Integer bno) throws Exception;
	
	public void updateViewCnt_freetalk(Integer bno) throws Exception;
	
	
	public List<BoardVO> listAll() throws Exception;
////////////-----------------------------
	
	//public List<BoardVO> purchase() throws Exception;
	
	//public List<BoardVO> sell() throws Exception;
	
	//public List<BoardVO> after() throws Exception;
	
	//public List<BoardVO> accuse() throws Exception;
	
	//public List<BoardVO> freetalk() throws Exception;
	
	
	
	public List<BoardVO> paging() throws Exception;
	/////////////////---------------------
	
	public List<BoardVO> purchase(int page) throws Exception;
	
	public List<BoardVO> purchaseCriteria(Criteria cri) throws Exception;
	
	public int purchasePaging(Criteria cri) throws Exception;
	
	
	
	public List<BoardVO> sell(int page) throws Exception;
	
	public List<BoardVO> sellCriteria(Criteria cri) throws Exception;
	
	public int sellPaging(Criteria cri) throws Exception;
	
	
	
	public List<BoardVO> after(int page) throws Exception;
	
	public List<BoardVO> afterCriteria(Criteria cri) throws Exception;
	
	public int afterPaging(Criteria cri) throws Exception;
	
	
	
	public List<BoardVO> accuse(int page) throws Exception;
	
	public List<BoardVO> accuseCriteria(Criteria cri) throws Exception;
	
	public int accusePaging(Criteria cri) throws Exception;
	
	
	
	public List<BoardVO> freetalk(int page) throws Exception;
	
	public List<BoardVO> freetalkCriteria(Criteria cri) throws Exception;
	
	public int freetalkPaging(Criteria cri) throws Exception;
	
	
	
	
	////////////////////////////////////////////
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
