package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.exception.StudentNotFoundException;
import com.student.repository.StudentRepository;

@Service
@Profile(value = { "local", "dev", "prod", "qa" })
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public String addStudent(Student student) {
		student.getAddress().setStudent(student);
		Student studentResponse = studentRepository.save(student);
		if (studentResponse == null) {
			return "data not saved";
		}
		return "data saved successfully";
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> studentReposne = studentRepository.findAll();
		if (studentReposne == null || studentReposne.isEmpty()) {
			throw new StudentNotFoundException("Student data is empty");
		}
		return studentReposne;
	}

	@Override
	public Student getStudentById(Integer studentId) {
		Optional<Student> studentResponse = studentRepository.findById(studentId);
		if (!studentResponse.isPresent()) {
			throw new StudentNotFoundException("Student data not found for ID");
		}
		return studentResponse.get();
	}

	@Override
	public Student getStudentByStudentName(String studentName) {
		Optional<Student> studentResponse = studentRepository.findByStudentName(studentName);
		if (!studentResponse.isPresent()) {
			throw new StudentNotFoundException("Student name not exists");
		}
		return studentResponse.get();
	}

	@Override
	public String updateStudent(Student student) {
		Optional<Student> studentResponse = studentRepository.findById(student.getStudentId());
		if (!studentResponse.isPresent()) {
			throw new StudentNotFoundException("Student data not found for ID");
		}

		if (student.getStudentName() != null) {
			studentResponse.get().setStudentName(student.getStudentName());
		}
		if (student.getEmailId() != null) {
			studentResponse.get().setEmailId(student.getEmailId());
		}
		if (student.getLoginId() != null) {
			studentResponse.get().setLoginId(student.getLoginId());
		}
		if (student.getMobileNumber() != null) {
			studentResponse.get().setMobileNumber(student.getMobileNumber());
		}
		if (student.getPassword() != null) {
			studentResponse.get().setPassword(student.getPassword());
		}
		studentRepository.save(studentResponse.get());
		return "updated successfully";
	}

	@Override
	public String deleteStudentById(Integer studentId) {
		Optional<Student> studentResponse = studentRepository.findById(studentId);
		if (!studentResponse.isPresent()) {
			throw new StudentNotFoundException("Student data not found for ID");
		}
		studentRepository.deleteById(studentId);
		return "Deleted Successfully";
	}

}
