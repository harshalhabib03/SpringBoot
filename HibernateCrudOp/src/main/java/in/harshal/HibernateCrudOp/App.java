package in.harshal.HibernateCrudOp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.harshal.entity.User;

public class App 
{
    public static void main( String[] args )
    {
//        User user1 = new User();
//    	  user1.setName("harshal");
//        user1.setEmail("harshal@gmail.com");
//        user1.setPassword("harshal@123");
//        user1.setGender("male");
//        user1.setCity("gadag");
        
        User user1 = new User();
 	    user1.setName("praveen");
        user1.setEmail("praveen@gmail.com");
        user1.setPassword("praveen@123");
        user1.setGender("male");
        user1.setCity("kolar");
        
        User user2 = new User();
        user2.setName("ravi");
        user2.setEmail("ravi@gmail.com");
        user2.setPassword("ravi@123");
        user2.setGender("male");
        user2.setCity("raichur");
        
    	Configuration cfg = new Configuration();
        cfg.configure("/in/harshal/config/hibernate.cfg.xml");
        
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        
        //---------------------Insertion Operation--------------------
//        try {
//        	session.save(user1);
//        	session.save(user2);
//            transaction.commit();
//            
//            System.out.println("User details added Successfull");
//		}
//        catch (Exception e) {
//        	transaction.rollback();
//			e.printStackTrace();
//			
//			System.out.println("User details not added due to some error");
//		}

    
        //---------------------Select Operation--------------------------
        
//        try {
//        	User user = session.get(User.class, 4L);
//        	
//        	if (user != null ) {
//        		System.out.println(user.getId());
//            	System.out.println(user.getName());
//            	System.out.println(user.getEmail());
//            	System.out.println(user.getPassword());
//            	System.out.println(user.getGender());
//            	System.out.println(user.getCity());
//			}
//        	else {
//        		System.out.println("User not Found");
//			}
//        } 
//        catch (Exception e) {
//			e.printStackTrace();
//		}
        
        
        //---------------------Update Operation----------------------------
        
//        try {
//        	User user = session.get(User.class, 2L);
//        	user.setCity("kgf");
//        	
//        	session.saveOrUpdate(user);
//        	transaction.commit();
//        	
//        	System.out.println("User details updated successfully");
//		} catch (Exception e) {
//			transaction.rollback();
//			e.printStackTrace();
//			
//			System.out.println("User details not updated due to some error");
//		}
        
        
        //----------------------Delete Operation----------------------------
        
        try {
			User user = new User();
			user.setId(3L);
			
			session.delete(user);
			transaction.commit();
			
			System.out.println("User details deleted successfully");
		} 
        catch (Exception e) {
        	transaction.rollback();
			e.printStackTrace();
			
			System.out.println("User details not deleted due to some error");
		}
        
    }
}
