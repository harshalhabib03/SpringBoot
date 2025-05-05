package in.jpa.SpringDataJPA;

import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.jpa.SpringDataJPA.entities.Student;
import in.jpa.SpringDataJPA.services.StudentService;
import in.jpa.SpringDataJPA.services.StudentServiceImpl;

@SpringBootApplication
public class SpringDataJpaApplication 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		StudentService stdService = context.getBean(StudentServiceImpl.class);
		
		//-------------------Insert Operation--------------------------
//		Student std = new Student();
//		std.setName("ram");
//		std.setRollno(22);
//		std.setMarks(80.55f);
//		
//		boolean status = stdService.addStudentDetails(std);
//		if (status = true) {
//			System.out.println("Student inserted successfully");
//		} else {
//			System.out.println("Student not inserted due to some error");
//		}
		
		
		//--------------------SelectALL Operation----------------------------
		
//		List<Student> stdList = stdService.getAllStudents();
//		
//		for (Student std : stdList) {
//			System.out.println("Id: "+ std.getId());
//			System.out.println("Name: "+ std.getName());
//			System.out.println("Rollno: "+ std.getRollno());
//			System.out.println("Marks: " +std.getMarks());
//			
//			System.out.println("--------------------------");
//		}
		
		
		//-------------------Select By id Operation----------------------------
		
//		Student std = stdService.getStdDetails(10L);
//		if (std != null) {
//			System.out.println("Id: "+ std.getId());
//			System.out.println("Name: "+ std.getName());
//			System.out.println("Rollno: "+ std.getRollno());
//			System.out.println("Marks: " +std.getMarks());
//
//		} else {
//			System.out.println("Student Not Found");
//		}
	
	
		//--------------------Update Operation-------------------------------
		
//		boolean status = stdService.updateStdDetails(3L, 91.75f);
//		if (status) {
//			System.out.println("Student updation successfull");
//		} else {
//			System.out.println("Student updation failed due to some error");
//		}
		
		//---------------------Delete Operation-------------------------------
		
		boolean status = stdService.deleteStd(5L);
		if (status) {
			System.out.println("Student deletion successfull");
		} else {
			System.out.println("Student deletion failed due to some error");
		}
	
	}

}
