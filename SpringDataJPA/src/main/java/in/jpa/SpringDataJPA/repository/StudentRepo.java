package in.jpa.SpringDataJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.jpa.SpringDataJPA.entities.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Long> 
{

}
