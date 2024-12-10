package com.in28minutes.learn_jpa_and_hibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.in28minutes.learn_jpa_and_hibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {

	@PersistenceContext
	private EntityManager entiyManager;

	public void insert(Course course) {
		entiyManager.merge(course);
	}

	public Course findById(long id) {
		return entiyManager.find(Course.class, id);
	}

	public void deleteById(long id) {
		Course course = entiyManager.find(Course.class, id);
		entiyManager.remove(course);
	}
}
