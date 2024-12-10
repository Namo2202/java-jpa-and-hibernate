package com.in28minutes.learn_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	private Course course1 = new Course(1, "Learn AWS 2", "namo");

	// For JDBC
//	@Autowired
//	private CourseJdbcRepository repository;

	// FOR JPA
//	@Autowired
//	private CourseJpaRepository repository;

	// FOR SPRING DATA JPA
	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// FOR JDBC and JPA
//		repository.insert(new Course(1, "Learn AWS 2", "namo"));
//		repository.insert(new Course(2, "Learn Azure", "namo"));
//		repository.insert(new Course(3, "Learn GCP", "namo"));
//		repository.insert(new Course(4, "Learn JPA", "namo"));
//		repository.deleteById(course1.getId());
//		System.out.println(repository.findById(2));

		// FOR SPRING DATA JPA
		repository.save(new Course(1, "Learn AWS 2", "namo"));
		repository.save(new Course(2, "Learn Azure", "namo"));
		repository.save(new Course(3, "Learn GCP", "namo"));
		repository.save(new Course(4, "Learn JPA", "namo"));
		repository.deleteById(course1.getId());
		System.out.println(repository.findById(2l));

		System.out.println(repository.findAll());
		System.out.println(repository.count());
		System.out.println(repository.findByAuthor("namo"));
		System.out.println(repository.findByName("Learn JPA"));

	}

}
