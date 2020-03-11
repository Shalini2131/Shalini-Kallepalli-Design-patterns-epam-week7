package Singleton;
public class Singleton{
   private static Singleton dbObject;

   private Singleton() {      
   }

   public static Singleton getInstance() {

      // create object if it's not already created
      if(dbObject == null) {
         dbObject = new Singleton();
      }

       // returns the singleton object
       return dbObject;
   }

   public void getConnection() {
       System.out.println("You are now connected to the database.");
   }
}