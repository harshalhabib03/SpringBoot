package in.jpa.SpringDataJPA.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.jpa.SpringDataJPA.entities.Student;
import in.jpa.SpringDataJPA.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService 
{
	@Autowired
	StudentRepo studentRepo;
	@Override
	public boolean addStudentDetails(Student std) {
		boolean status = false;
		
		try {
			studentRepo.save(std);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
			status=false;
		}
		return false;
	}
	
	@Override
	public List<Student> getAllStudents() {
		
		return studentRepo.findAll();
	}

	@Override
	public Student getStdDetails(Long id) {
		Optional<Student> optional = studentRepo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		else {
			return null;
		}
		
		
	}

	@Override
	public boolean updateStdDetails(Long id, float marks) {
		
		Student std = getStdDetails(id);
		if (std != null) {
			std.setMarks(marks);
			studentRepo.save(std);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteStd(Long id) {
		boolean status = false;
		try {
			studentRepo.deleteById(id);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
			status=false;
		}
		return status;
	}

}
