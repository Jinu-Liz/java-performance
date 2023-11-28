package hd.edu.myspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hd.edu.myspring.service.AddrBookService;
import hd.edu.myspring.vo.AddrBookVO;

@RestController
public class AddrBookRESTController {
	
	@Autowired
	AddrBookService abService;
	
	@RequestMapping("/addrbook/{id}")
	public AddrBookVO getById(@PathVariable("id") int id) {
		return abService.getById(id);
	}

}
