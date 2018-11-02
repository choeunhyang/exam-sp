package com.exam.sp.vo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Exam {
	private Integer num;
	private String name;
	private Integer age;
	/*
	public static void main(String[] args){
		Exam e = new Exam();
		e.setAge(20);
		log.info("ExamVO =>{}",e);
		System.out.println(e.getAge());
	}*/
}
