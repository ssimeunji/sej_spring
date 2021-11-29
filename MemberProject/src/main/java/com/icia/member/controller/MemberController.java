package com.icia.member.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.icia.member.Service.MemberService;
import com.icia.member.dto.MemberDTO;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService ms;
	
	
	// 회원가입 페이지 출력
	@RequestMapping(value="/save", method=RequestMethod.GET)
	public String save() {
		return "save";
	}
	
	// 회원가입 처리
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(@ModelAttribute MemberDTO member) {
		System.out.println("MemberController.save(): "+member);
		int result = ms.save(member);
		if(result > 0) {
			return "index";
		} else {
			return "save";
		}
	}
	
	// 로그인 페이지 출력
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginForm() {
		return "login";
	}
	// 로그인 처리
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute MemberDTO member) {
		System.out.println("MemberController.login(): "+member);
		String resultPage = ms.login(member);

		return resultPage;

	}
	
	// 로그아웃 처리
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(HttpSession session) {
		// 세션에 저장된 데이터를 지움
		session.invalidate();
		return "index";
	}
	
	// 회원목록 처리
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public String findAll(Model model) {

		List<MemberDTO> mList = ms.findAll();
		
		model.addAttribute("mList",mList);
		
		return "findAll";
	}
	
	// 상세조회 처리
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public String findById(@RequestParam("m_number") long m_number, Model model) {
		MemberDTO member = ms.findById(m_number);
		model.addAttribute("member", member);
		
		return "detail";
	}
}
