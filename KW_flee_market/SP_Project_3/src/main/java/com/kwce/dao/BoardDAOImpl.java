package com.kwce.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.kwce.domain.BoardVO;
import com.kwce.domain.Criteria;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	private SqlSession session;
	private static String namespace="com.kwce.mapper.BoardMapper";
	
	
	
	
///////////////////////////////////
	@Override
	public List<BoardVO> listAll() throws Exception {
		return session.selectList(namespace+".listAll");
	}

	/////////------------------------
	

//	@Override
	//public List<BoardVO> purchase() throws Exception {
		
//		return session.selectList(namespace+".purchase");
//	}

//	@Override
//	public List<BoardVO> sell() throws Exception {
		
//		return session.selectList(namespace+".sell");
//	}

//	@Override
//	public List<BoardVO> after() throws Exception {
		
//		return session.selectList(namespace+".after");
//	}

//	@Override
//	public List<BoardVO> accuse() throws Exception {
		
//		return session.selectList(namespace+".accuse");
//	}

//	@Override
//	public List<BoardVO> freetalk() throws Exception {
		
//		return session.selectList(namespace+".freetalk");
//	}
	
	
	@Override
	public List<BoardVO> paging() throws Exception {
		return session.selectList(namespace+".paging");
	}
	/////////-----------------

	@Override
	public void create_purchase(BoardVO vo) throws Exception {
		session.insert(namespace+".create_purchase",vo);
		
	}

	@Override
	public void create_sell(BoardVO vo) throws Exception {
		session.insert(namespace+".create_sell",vo);
		
	}

	@Override
	public void create_after(BoardVO vo) throws Exception {
		session.insert(namespace+".create_after",vo);
		
	}

	@Override
	public void create_accuse(BoardVO vo) throws Exception {
		session.insert(namespace+".create_accuse",vo);
		
	}

	@Override
	public void create_freetalk(BoardVO vo) throws Exception {
		session.insert(namespace+".create_freetalk",vo);
		
	}

	@Override
	public BoardVO read_purchase(Integer bno) throws Exception {
		return session.selectOne(namespace+".read_purchase",bno);
	}

	@Override
	public BoardVO read_sell(Integer bno) throws Exception {
		return session.selectOne(namespace+".read_sell",bno);
	}

	@Override
	public BoardVO read_after(Integer bno) throws Exception {
		return session.selectOne(namespace+".read_after",bno);
	}

	@Override
	public BoardVO read_accuse(Integer bno) throws Exception {
		return session.selectOne(namespace+".read_accuse",bno);
	}

	@Override
	public BoardVO read_freetalk(Integer bno) throws Exception {
		return session.selectOne(namespace+".read_freetalk",bno);
	}

	@Override
	public void update_purchase(BoardVO vo) throws Exception {
		session.update(namespace+".update_purchase",vo);
		
	}

	@Override
	public void update_sell(BoardVO vo) throws Exception {
		session.update(namespace+".update_sell",vo);
		
	}

	@Override
	public void update_after(BoardVO vo) throws Exception {
		session.update(namespace+".update_after",vo);
		
	}

	@Override
	public void update_accuse(BoardVO vo) throws Exception {
		session.update(namespace+".update_accuse",vo);
		
	}

	@Override
	public void update_freetalk(BoardVO vo) throws Exception {
		session.update(namespace+".update_freetalk",vo);
		
	}

	@Override
	public void delete_purchase(Integer bno) throws Exception {
		session.delete(namespace+".delete_purchase",bno);
		
	}

	@Override
	public void delete_sell(Integer bno) throws Exception {
		session.delete(namespace+".delete_sell",bno);
		
	}

	@Override
	public void delete_after(Integer bno) throws Exception {
		session.delete(namespace+".delete_after",bno);
		
	}

	@Override
	public void delete_accuse(Integer bno) throws Exception {
		session.delete(namespace+".delete_accuse",bno);
		
	}

	@Override
	public void delete_freetalk(Integer bno) throws Exception {
		session.delete(namespace+".delete_freetalk",bno);
		
	}

	@Override
	public void updateViewCnt_purchase(Integer bno) throws Exception {
		session.update(namespace+".updateViewCnt_purchase",bno);
		
	}

	@Override
	public void updateViewCnt_sell(Integer bno) throws Exception {
		session.update(namespace+".updateViewCnt_sell",bno);
		
	}

	@Override
	public void updateViewCnt_after(Integer bno) throws Exception {
		session.update(namespace+".updateViewCnt_after",bno);
		
	}

	@Override
	public void updateViewCnt_accuse(Integer bno) throws Exception {
		session.update(namespace+".updateViewCnt_accuse",bno);
		
	}

	@Override
	public void updateViewCnt_freetalk(Integer bno) throws Exception {
		session.update(namespace+".updateViewCnt_freetalk",bno);
		
	}

	@Override
	public List<BoardVO> purchase(int page) throws Exception {
		if (page <= 0) {
			page = 1;
		}
		page = (page - 1) * 10;
		return session.selectList(namespace + ".purchase", page);
	}

	@Override
	public List<BoardVO> purchaseCriteria(Criteria cri) throws Exception {
		
		return session.selectList(namespace + ".purchaseCriteria", cri);
	}

	@Override
	public int purchasePaging(Criteria cri) throws Exception {
		return session.selectOne(namespace + ".purchasePaging", cri);
	}

	
	
	
	@Override
	public List<BoardVO> sell(int page) throws Exception {
		if (page <= 0) {
			page = 1;
		}
		page = (page - 1) * 10;
		return session.selectList(namespace + ".sell", page);
	}

	@Override
	public List<BoardVO> sellCriteria(Criteria cri) throws Exception {
		return session.selectList(namespace + ".sellCriteria", cri);
	}

	@Override
	public int sellPaging(Criteria cri) throws Exception {
		return session.selectOne(namespace + ".sellPaging", cri);
	}

	
	
	
	@Override
	public List<BoardVO> after(int page) throws Exception {
		if (page <= 0) {
			page = 1;
		}
		page = (page - 1) * 10;
		return session.selectList(namespace + ".after", page);
	}

	@Override
	public List<BoardVO> afterCriteria(Criteria cri) throws Exception {
		return session.selectList(namespace + ".afterCriteria", cri);
	}

	@Override
	public int afterPaging(Criteria cri) throws Exception {
		return session.selectOne(namespace + ".afterPaging", cri);
	}

	
	
	
	
	@Override
	public List<BoardVO> accuse(int page) throws Exception {
		if (page <= 0) {
			page = 1;
		}
		page = (page - 1) * 10;
		return session.selectList(namespace + ".accuse", page);
	}

	@Override
	public List<BoardVO> accuseCriteria(Criteria cri) throws Exception {
		return session.selectList(namespace + ".accuseCriteria", cri);
	}

	@Override
	public int accusePaging(Criteria cri) throws Exception {
		return session.selectOne(namespace + ".accusePaging", cri);
	}

	
	
	
	
	
	
	@Override
	public List<BoardVO> freetalk(int page) throws Exception {
		if (page <= 0) {
			page = 1;
		}
		page = (page - 1) * 10;
		return session.selectList(namespace + ".freetalk", page);
	}

	@Override
	public List<BoardVO> freetalkCriteria(Criteria cri) throws Exception {
		return session.selectList(namespace + ".freetalkCriteria", cri);
	}

	@Override
	public int freetalkPaging(Criteria cri) throws Exception {
		return session.selectOne(namespace + ".freetalkPaging", cri);
	}


	
	
}
