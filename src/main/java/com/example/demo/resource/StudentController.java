package com.example.demo.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@RestController
public class StudentController {
	@Autowired
	public StudentRepository repository;

//	public StudentController(StudentRepository repository) {
//		super();
//		this.repository = repository;
//	}


	@PostMapping("/addStudent")
	public String saveStudent(@RequestBody Student student)
	{
		repository.save(student);
		return "Added successfully";
		
	}
	
	@PutMapping("/updateStudent/{id}")
	public String updateStudent(String id, String First_Name)
	{
		Optional<Student> optionalModel = repository.findById(id);
		if(optionalModel.isPresent())
		{
			Student st = optionalModel.get();
			st.setFirst_Name("Ammu");
			repository.save(st);
		}
		return "updated successfully";
		
	}
	
	@GetMapping ("/findallStudent")
	public List<Student> getStudents()
	{
		
		return repository.findAll();
		
	}
	@GetMapping("/findallStudentbyId/{id}")
	public Optional<Student> getStudents(@PathVariable String id)
	{
		return repository.findById(id);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable String id)
	{
		repository.deleteById(id);
		return "student deleted with id" +id;
		
	}
}
