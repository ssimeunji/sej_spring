package com.icia.member.Service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icia.member.dto.MemberDTO;
import com.icia.member.repository.MemberRepository;

@Service
public class MemberService {

	@Autowired
	private MemberRepository mr;
	
	@Autowired
	private HttpSession session;
	
	public int save(MemberDTO member) {
		System.out.println("MemberService.save():"+member);
		int result = mr.save(member);
		return result;
	}
	
	public String login(MemberDTO member) {
		System.out.println("MemberService.login():"+member);
		MemberDTO loginMember = mr.login(member);
		if(loginMember != null) {
			// 로그인 성공(로그인 정보(아이디)를 세션에 저장)
			session.setAttribute("loginId", member.getM_id());
			session.setAttribute("loginNumber", loginMember.getM_number());
			return "main";
		} else {
			// 로그인 실패
			return "login";
		}
	}

	public List<MemberDTO> findAll() {
		List<MemberDTO> mList = mr.findAll();
		
		return mList;
	}

	public MemberDTO findById(long m_number) {
		MemberDTO member = mr.findById(m_number);
		return member;
	}
	

}
