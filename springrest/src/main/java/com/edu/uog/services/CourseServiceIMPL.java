package com.edu.uog.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.edu.uog.entities.Course;

@Service
public class CourseServiceIMPL implements CourseService {
	
	List<Course> list;
	
	public CourseServiceIMPL() {
		list = new ArrayList<>();
		list.add(new Course(145, "OOP", "Programming"));
		list.add(new Course(144, "DLD", "Circuits"));
		
	}
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		for(Course course:list) {
			if(course.getId()== courseId) {
				c=course;
				break;
			}
		}
		return c;
	}
	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}
	@Override
	public Course updateCourse(long courseId, Course uCourse) {
		for(Course course:list) {
			if(course.getId()== courseId) {
				course.setId(uCourse.getId());
				course.setTitle(uCourse.getTitle());
				course.setDesc(uCourse.getDesc());
				break;
			}
		}
		return uCourse;
	}
	@Override
	public Course deleteCourse(long courseId) {
		for(Course course:list) {
			if(course.getId()== courseId) {
				list.remove(course);
				break;
			}
		}
		return null;
	}
}
