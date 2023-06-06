package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


import lombok.Data;

@Data
@Document (collection = "student_details")
public class Student {
		
	@Id
	    private String id;
		private String First_Name;
		private String Last_Name;
		private int age;
		
		@Field("id")
		public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
			
		}


		public String getFirst_Name() {
			return First_Name;
		}


		public void setFirst_Name(String First_Name) {
			this.First_Name = First_Name;
		}


		public String getLast_Name() {
			return Last_Name;
		}


		public void setLast_Name(String Last_Name) {
			this.Last_Name = Last_Name;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		@Override
		public String toString() {
			return "Student [id=" + id + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name + ", age=" + age
					+ ", getId()=" + getId() + ", getFirst_Name()=" + getFirst_Name() + ", getLast_Name()="
					+ getLast_Name() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + ", toString()=" + super.toString() + "]";
		}
		
		
	
		
		
	}


