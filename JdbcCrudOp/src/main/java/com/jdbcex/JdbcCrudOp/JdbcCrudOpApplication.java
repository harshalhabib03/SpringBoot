package com.jdbcex.JdbcCrudOp;

import com.jdbcex.JdbcCrudOp.dao.UserDao;
import com.jdbcex.JdbcCrudOp.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JdbcCrudOpApplication implements CommandLineRunner
{
	@Autowired
	private UserDao userDao;

	public static void main(String[] args) {
		SpringApplication.run(JdbcCrudOpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//---------------Insertion---------------------
		//Users user1 = new Users("harshal", "harshal@gmail.com", "male", "gadag");
//		Users user2 = new Users("praveen", "praveen@gmail.com", "male", "kgf");
//		boolean status = userDao.insertUser(user1);
//		if (status){
//			System.out.println("user inserted successfully");
//		}
//		else {
//			System.out.println("user not inserted due to some error");
//		}

		//---------------Updation------------------------

//		Users users = new Users("harshal","harshal@gmail.com", "male", "bengaluru");
//		boolean status= userDao.updateUser(users);
//		if (status){
//			System.out.println("Updation Success");
//		}
//		else {
//			System.out.println("Updation failed");
//		}


		//------------------Delete-------------------------
		
//		boolean status = userDao.deleteByUserEmail("harshal@gmail.com");
//		if (status){
//			System.out.println("Deletion success");
//		}
//		else {
//			System.out.println("deletion failed");
//		}


		//----------------Select One User--------------------
//		Users users = userDao.getUsersByEmail("harshal@gmail.com");
//		System.out.println("Name: "+users.getName());
//		System.out.println("Email: "+ users.getEmail());
//		System.out.println("Gender: "+users.getGender());
//		System.out.println("City: "+users.getCity());

		//----------------Select All Users-------------------

		List<Users> list = userDao.getAllUser();
		for(Users users : list){
			System.out.println("Name: "+users.getName());
			System.out.println("Email: "+ users.getEmail());
			System.out.println("Gender: "+users.getGender());
			System.out.println("City: "+users.getCity());
			System.out.println("-----------------------------------");
		}
	}
}

















