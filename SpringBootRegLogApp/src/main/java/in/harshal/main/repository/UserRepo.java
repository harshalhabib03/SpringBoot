package in.harshal.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.harshal.main.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>
{
	User findByEmail(String email);
}
