package com.edu.uog.services;

import java.util.List;

import com.edu.uog.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);

	public Course addCourse(Course course);

	public Course updateCourse(long courseId, Course course);

	public Course deleteCourse(long courseId);

}
