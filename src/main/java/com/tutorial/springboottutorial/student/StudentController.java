package com.tutorial.springboottutorial.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path =  "api/v1/student")
public class StudentController {
    
    @GetMapping
	public List<Student> getStudents() {
		return List.of(
			new Student(
							1L,
							"Vally",
							"vally@test.com",
							LocalDate.of(2002, Month.DECEMBER, 9),
							18
						)
		);
	}

}
