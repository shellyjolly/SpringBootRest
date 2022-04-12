package com.example;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentResource {
	
	@Autowired
	StudentRepository repo;
	
	@RequestMapping("students")  //can use @GetMapping or @RequestMApping('students',get)
	public List<Student> getStudents()
	{
		 List<Student> students = (List<Student>) repo.findAll();
		 return students;
		
		/*
		 * List<Student> studentlist = new ArrayList<>();
		 * 
		 * Student stud1 = new Student(); stud1.setId(101); stud1.setName("Shelly");
		 * stud1.setPoints(70);
		 * 
		 * Student stud2 = new Student(); stud2.setId(102); stud2.setName("Vikas");
		 * stud2.setPoints(80);
		 * 
		 * studentlist.add(stud1); studentlist.add(stud2);
		 * 
		 * 
		 * return studentlist;
		 */
		
	}

}
