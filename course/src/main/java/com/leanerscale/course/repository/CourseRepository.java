package com.leanerscale.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leanerscale.course.model.Course;

public interface CourseRepository extends JpaRepository<Course,Long> {

}
