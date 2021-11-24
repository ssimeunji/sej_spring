package com.sej.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sej.ex.dto.TraineeDTO;
import com.sej.ex.service.TraineeService;

@Controller
public class HomeController {
	//스프링이 관리하는 객체를 사용하기
	//의존성 주입(DI, Dependency Injection)
	@Autowired
	private TraineeService ts;
	
	//TraineeService ts = new TraineeService();
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {

		return "index";
	}
	
	@RequestMapping(value = "/insertform", method = RequestMethod.GET)
	public String insertForm() {

		return "insert";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insert(@ModelAttribute TraineeDTO trainee) {
		
		System.out.println("insertTrainee: " +trainee);
		
		// TraineeService에 있는 insert메서드 호출하면서 trainee 객체를 넘긴다면
		ts.insert(trainee);
		

		return "success";
	}
	
}
