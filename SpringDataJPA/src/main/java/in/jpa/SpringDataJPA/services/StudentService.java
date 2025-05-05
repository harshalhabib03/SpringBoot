package in.jpa.SpringDataJPA.services;

import java.util.List;

import in.jpa.SpringDataJPA.entities.Student;

public interface StudentService {
	public boolean addStudentDetails(Student std);
	
	public List<Student> getAllStudents();
	
	public Student getStdDetails(Long id);
	
	public boolean updateStdDetails(Long id, float marks);
	
	public boolean deleteStd(Long id);
}
