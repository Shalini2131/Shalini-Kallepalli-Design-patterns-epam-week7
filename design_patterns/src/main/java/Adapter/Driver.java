package Adapter;

public  class  Driver  implements  Car {
  Car c;
  public  Driver(Car c) {
	    this.c=c;
	  }
  public  void  drive () {
    c.drive();
  }
  
}