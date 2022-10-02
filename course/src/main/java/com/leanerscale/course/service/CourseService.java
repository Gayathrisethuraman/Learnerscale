package com.leanerscale.course.service;

import java.util.List;

import com.leanerscale.course.model.Course;

public interface CourseService {

	Course saveCourse(Course course);

	void deleteCourse(Long courseId);

	List<Course> findAllCourses();

}
