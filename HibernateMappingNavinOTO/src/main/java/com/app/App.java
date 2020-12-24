package com.app;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory= new Configuration().configure().buildSessionFactory();
        Laptop lap=new Laptop();
        lap.setlId(102);
        lap.setlName("DellP");
        
        Student stud=new Student();
        stud.setRollNo(102);
        stud.setName("Sunil");
        stud.setMarks(50);
        stud.setLaptop(lap);
        
        
        
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        
        session.save(lap);
        session.save(stud);
        
        tx.commit();
        session.close();
        
    }
}
