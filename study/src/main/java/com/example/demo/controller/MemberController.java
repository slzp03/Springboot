package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Member;
import com.example.demo.repository.MemberRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MemberController {
	
	
	private MemberRepository member;
	
	
	public MemberController(MemberRepository member) {
		this.member = member;
	}

	@RequestMapping("/")
	public String login() {
		return "login/login";
	}
	@RequestMapping("/ok")
	public String loginok() {
		return "redirect:/emp";
	}
	@RequestMapping("/fail")
	public String loginfail() {
		return "login/fail";
	}
	
	@PostMapping("/signIn")
	public String signIn(String id, String password) {
		
		Member S = this.member.findMember(id, password);
		if(S == null) {
			return "redirect:/fail";
		}else return "redirect:/ok";
	}
	
	@RequestMapping("/signUp")
	public String signUp() {
		return "login/signup";
	}
	
	
	@RequestMapping("/signUp/create")
	public String create(Member member) {
		
		this.member.save(member);
		return "redirect:/";
	}
}