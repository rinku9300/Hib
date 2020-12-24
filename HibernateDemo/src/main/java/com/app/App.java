package com.app;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.entity.Address;
import com.app.entity.Student;

/**
 * @author Rakesh Soni
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
       SessionFactory factory=new Configuration().configure().buildSessionFactory();    
       System.out.println(factory);
     //factory.getCurrentSession();
       
              //create Student
       		   Student std=new Student();
    		   std.setId(104);
    		   std.setName("Keeran");
    		   std.setCity("Hyderabad");
    		   
    		   System.out.println("------------Student--------------- ");
    		   //Create Address 
    		   Address address=new Address();
    		   address.setStreet("Ameerpet Rood");
    		   address.setCity("Hyderabad");
    		   address.setOpen(true);
    		   address.setAddedDate(new Date());
    		   address.setX(2.2);
    		   
    		   //Reading image		   
    		   FileInputStream fis=new FileInputStream("src/main/java/Rinku-Rinky.jpg");
    		   byte[] data=new byte[fis.available()];
    		   fis.read(data);
    		   address.setImage(data);
    		   
    		   Session session = factory.openSession();
    		
    		   /*
    		   System.out.println("------------Address----------------- ");
       		
    		      System.out.println("------------Save Method----------------- ");
         		
    		   Transaction tx = session.beginTransaction();
    		  session.save(std);
    		   session.save(address);
    		   System.out.println("------------Save Method----------------- ");
          		
    		   
    		   tx.commit();*/
    		   
    		  Student student= (Student)session.load(Student.class, 103);
    		  // It will create proxy object when you use then it fire query
    		   System.out.println(student);
    		   
    		   Address  addr=session.get(Address.class,1);
    		   // it will put object in cache 
    		   System.out.println(addr);
    		   
    		//   session.delete(102);
    		   session.close();
     //  System.out.println(factory.isClosed());
    }
}




