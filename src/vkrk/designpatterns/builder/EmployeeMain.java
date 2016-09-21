package com.vkrk.designpatterns.builder;

import java.time.LocalDate;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee=new Employee.Builder()
				.firstName("Ravi")
				.lastName("Kiran")
				.dateOfBirth(LocalDate.of(1988, 02, 06))
				.build();
		
		System.out.println(employee);

	}

}
