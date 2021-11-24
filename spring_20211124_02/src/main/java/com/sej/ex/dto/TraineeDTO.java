package com.sej.ex.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class TraineeDTO {
	private long tnumber;
	private String name;
	private int age;
	private String phone;
	private String gender;
	private Date birth;
	private String address;
}
