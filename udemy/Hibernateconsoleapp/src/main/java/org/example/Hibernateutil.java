package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernateutil {
   private static final SessionFactory sf=buildSessionFactory();
  private static SessionFactory buildSessionFactory(){
      try{
          return new Configuration().configure().buildSessionFactory();
      }
      catch(Exception ex){
          throw new ExceptionInInitializerError(ex);
      }
  }
  public static SessionFactory getSessionFactory(){
      return sf;
  }
public static void shutdown(){
     getSessionFactory().close();
}
}
