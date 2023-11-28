package hd.edu.myspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hd.edu.myspring.dao.AddrBookDAO;
import hd.edu.myspring.vo.AddrBookVO;

@Service
public class AddrBookServiceImpl implements AddrBookService{

	@Autowired
	private AddrBookDAO dao;

	public void insert(AddrBookVO vo) {
		int result = dao.insert(vo);
	}
	
	@Override
	public List<AddrBookVO> getList() {
		return dao.getList();
	}
	
	@Override
	public AddrBookVO getById(int abId) {
		return dao.getById(abId);
	}

}
