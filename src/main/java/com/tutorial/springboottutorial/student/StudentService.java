package com.tutorial.springboottutorial.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
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
