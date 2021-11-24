package com.sej.ex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sej.ex.dto.TraineeDTO;
import com.sej.ex.repository.TraineeRepository;

@Service
public class TraineeService {
	
	@Autowired
	private TraineeRepository tr;

	public void insert(TraineeDTO trainee) {
		System.out.println("TraineeService.insert() 메서드 호출");
		System.out.println("객체값: "+trainee);
		
		tr.insert(trainee);
		
	}

}
