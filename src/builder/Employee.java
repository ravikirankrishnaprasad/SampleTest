package com.vkrk.designpatterns.builder;

import java.time.LocalDate;

public class Employee {
	
	private final String firstName;
	private final String lastName;
	private final LocalDate dateOfBirth;
	
	public static class Builder {
		private String firstName;
		private String lastName;
		private LocalDate dateOfBirth;
		
		public Builder firstName(String firstName){
			this.firstName=firstName;
			return this;
		}
		
		public Builder lastName(String lastName){
			this.lastName=lastName;
			return this;
		}
		
		public Builder dateOfBirth(LocalDate dateOfBirth){
			this.dateOfBirth=dateOfBirth;
			return this;
		}
		
		public Employee build(){
			return new Employee(this);
		}
	}
	
	private Employee(Builder builder){
		this.firstName=builder.firstName;
		this.lastName=builder.lastName;
		this.dateOfBirth=builder.dateOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	

}
