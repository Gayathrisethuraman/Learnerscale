package com.leanerscale.course.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leanerscale.course.model.Course;
import com.leanerscale.course.repository.CourseRepository;

@Service
public class CourseServiceimpl implements CourseService {
	@Autowired
	private final CourseRepository courseRepository;
	public CourseServiceimpl(CourseRepository courseRepository)
    {
        this.courseRepository = courseRepository;
    }
	@Override
	public Course saveCourse(Course course)
    {
        course.setCreateTime(LocalDateTime.now());

        return courseRepository.save(course);
    }
	@Override
    public void deleteCourse(Long courseId)
    {
        courseRepository.deleteById(courseId);
    }

    @Override
    public List<Course> findAllCourses()
    {
        return courseRepository.findAll();
    }

	
    
}
