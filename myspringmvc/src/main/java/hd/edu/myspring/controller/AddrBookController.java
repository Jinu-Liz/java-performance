package hd.edu.myspring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import hd.edu.myspring.service.AddrBookService;
import hd.edu.myspring.vo.AddrBookVO;

@Controller
public class AddrBookController {

	@Autowired
	private AddrBookService abservice;

	@RequestMapping("/list.do")
	public String getList(HttpServletRequest req) {
		//db의 방명록 목록을 jsp로 전송해야 한다. => request에 넣어야 한다.
		List<AddrBookVO> list = abservice.getList();
		req.setAttribute("list", list);
		return "/addrbook/addrbook_list";
	}
	
	@RequestMapping("/registerForm.do")
	public String registerForm() {
		return "/addrbook/addrbook_form";
	}
	
	@RequestMapping("/register.do")
	public String register(HttpSession session, AddrBookVO vo) {
		System.out.println(vo);
		//vo로 데이터베이스에 저장한다.
		abservice.insert(vo);
		return "redirect:list.do";
	}
	
	@RequestMapping("/delete.do")
	public String delete(int abId) {
		//abservice.delete(abId);
		return "redirect:list.do";
	}
	
	//http://localhost:8080/myspring/editForm.do?abId=1&upasswd=1111
	@RequestMapping("/editForm.do")
	public String editForm(int abId, HttpServletRequest req) {
		AddrBookVO vo = abservice.getById(abId);
		req.setAttribute("ab", vo);
		return "/addrbook/addrbook_edit_form";
	}
}










