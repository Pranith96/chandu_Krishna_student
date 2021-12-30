package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface StudentService {

	String addStudent(Student student);

	List<Student> getAllStudents();

	Student getStudentById(Integer studentId);

	Student getStudentByStudentName(String studentName);

	String updateStudent(Student student);

	String deleteStudentById(Integer studentId);

}
