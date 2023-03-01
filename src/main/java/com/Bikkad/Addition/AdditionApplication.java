package com.Bikkad.Addition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdditionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdditionApplication.class, args);
		
		Addition a=new Addition();
		int sum = a.sum(10, 20);
		System.out.println("Addition of a & b is "+sum);
		
		AdditionOf3Nos a1=new AdditionOf3Nos();
		int add = a1.add(1, 2, 3);
		System.out.println("Addition of a & b & c is "+add);
		
		Substraction s= new Substraction();
		int sub = s.sub(2, 1);
		System.out.println(sub);
		
	}

}
