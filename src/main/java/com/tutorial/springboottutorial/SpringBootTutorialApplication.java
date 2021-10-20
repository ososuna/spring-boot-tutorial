package com.tutorial.springboottutorial;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import com.tutorial.springboottutorial.student.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTutorialApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
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
