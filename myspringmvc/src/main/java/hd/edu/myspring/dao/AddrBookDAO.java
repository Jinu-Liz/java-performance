package hd.edu.myspring.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hd.edu.myspring.vo.AddrBookVO;

@Repository
public class AddrBookDAO {

	
	@Autowired
	SqlSession session;
	
	//방명록 목록을 리턴한다.
	public List<AddrBookVO> getList() {
		return session.selectList("getList");
	}

	public int insert(AddrBookVO vo) {
		int result = session.insert("insert", vo);
		System.out.println("result="+result);
		return result;
		
	}

	public AddrBookVO getById(int abId) {
		return session.selectOne("getById", abId);
	}
}
