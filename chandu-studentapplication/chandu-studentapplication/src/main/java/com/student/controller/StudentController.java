package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping("/add")
	@ApiOperation(value = "Student account Creation API",
    notes = "Please provide all the info for Student account creation",
    response = Student.class)
	public ResponseEntity<String> addStudent(@RequestBody Student student) {
		String response = studentService.addStudent(student);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping("/get/all")
	@ApiOperation(value = "Students Details fetch API",
    notes = "All the student details will be fetched",
    response = Student.class)
	public ResponseEntity<List<Student>> getStudents() {
		List<Student> response = studentService.getAllStudents();
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/{studentId}")
	@ApiOperation(value = "Students Details fetch API",
    notes = "Please provide all the info for fetching student details",
    response = Student.class)
	public ResponseEntity<Student> getStudentById(@PathVariable("studentId") Integer studentId) {
		Student response = studentService.getStudentById(studentId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/name/{studentName}")
	public ResponseEntity<Student> getStudentByStudentName(@PathVariable("studentName") String studentName) {
		Student response = studentService.getStudentByStudentName(studentName);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/id")
	public ResponseEntity<Student> getStudentByStudentId(@RequestParam("studentId") Integer studentId) {
		Student response = studentService.getStudentById(studentId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateStudent(@RequestBody Student student){
		String response = studentService.updateStudent(student);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	@DeleteMapping("/delete/{studentId}")
	public ResponseEntity<String> deleteStudentById(@PathVariable("studentId") Integer studentId) {
		String response = studentService.deleteStudentById(studentId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
