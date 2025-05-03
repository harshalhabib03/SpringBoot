package in.harshal.main;

import in.harshal.main.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWithHibernate1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithHibernate1Application.class, args);
		
		Configuration cfg = new Configuration();
		//cfg.configure("/in/harshal/config/hibernate.cfg.xml");
		cfg.configure("/in/harshal/main/config/hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		//Transaction transaction = session.beginTransaction();

		User user = session.get(User.class, 1L);
		System.out.println(user.getName());
		System.out.println(user.getEmail());

	}

}
