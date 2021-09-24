package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import repository.StudentRepository;

public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	

}
