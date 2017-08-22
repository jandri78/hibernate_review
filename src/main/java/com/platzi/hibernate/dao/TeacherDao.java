package com.platzi.hibernate.dao;

import java.util.List;

import com.platzi.hibernate.model.Teacher;

public interface TeacherDao {

	public void saveTeacher(Teacher teacher);
	
	public void deleteTeacherById(Long idTecher);
	
	public void updateTeacher(Teacher teacher);
	
	
	List<Teacher> findAllTeachers();
	
	public Teacher findById(Long idTeacher);
	
	public Teacher findByName(String name);
}
