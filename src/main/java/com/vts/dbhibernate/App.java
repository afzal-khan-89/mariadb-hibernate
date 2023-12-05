package com.vts.dbhibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App 
{
    public static void main (String...args){

        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();

        Users book = new Users();
        book.setUserId(1);
        book.setFullName("bodna chor");
        book.setEmail("bodnachor@bodna.com");
        book.setPassword("asdf");
        session.save(book);
        tx.commit();

        session.close();
        HibernateUtil.shutdown();
    }
}
