package Adapter;

import Adapter.BusAdapter;
import Adapter.Driver;

public class App 
{
    public static void main( String[] args )
    {
    	Driver d=new Driver(new BusAdapter());
    	d.drive();
    }
}
