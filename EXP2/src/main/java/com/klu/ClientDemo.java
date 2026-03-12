package com.klu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {

public static void main(String[] args) {

Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session session = sf.openSession();

/* INSERT */

Transaction tx = session.beginTransaction();

Product p1 = new Product("Laptop","Gaming Laptop",75000,10);
Product p2 = new Product("Mobile","Android Phone",20000,20);

session.save(p1);
session.save(p2);

tx.commit();

System.out.println("Products Inserted");

/* RETRIEVE */

session = sf.openSession();

Product p = session.get(Product.class,1);

System.out.println("Product Name : "+p.getName());
System.out.println("Price : "+p.getPrice());

session.close();

/* UPDATE */

session = sf.openSession();
tx = session.beginTransaction();

Product pupdate = session.get(Product.class,1);
pupdate.setPrice(80000);

session.update(pupdate);

tx.commit();

System.out.println("Product Updated");

/* DELETE */

session = sf.openSession();
tx = session.beginTransaction();

Product pdelete = session.get(Product.class,2);

session.delete(pdelete);

tx.commit();

System.out.println("Product Deleted");

session.close();
sf.close();

}

}