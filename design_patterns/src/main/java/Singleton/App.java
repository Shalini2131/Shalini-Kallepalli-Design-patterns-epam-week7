package Singleton;

class App{
   public static void main(String[] args) {
      Singleton db1;
      db1= Singleton.getInstance();      
      db1.getConnection();
   }
}