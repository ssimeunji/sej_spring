package com.sej.ex.service;

import org.springframework.stereotype.Service;

import com.sej.ex.dto.TraineeDTO;

@Service
public class TraineeService {

	public void insert(TraineeDTO trainee) {
		System.out.println("TraineeService.insert() 메서드 호출");
		System.out.println("객체값: "+trainee);
		
	}

}
