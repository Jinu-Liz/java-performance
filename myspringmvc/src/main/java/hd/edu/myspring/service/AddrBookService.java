package hd.edu.myspring.service;

import java.util.List;

import hd.edu.myspring.vo.AddrBookVO;

public interface AddrBookService {

	void insert(AddrBookVO vo);

	List<AddrBookVO> getList();

	AddrBookVO getById(int abId);

}
