package Prototype;
import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
public abstract class Prototype implements Cloneable{
	protected String Shape; 
    abstract void drawShape(); 
    public Object clone() 
    { 
        Object obj=null; 
        try 
        { 
            obj=super.clone(); 
        }  
        catch(CloneNotSupportedException e)  
        { 
            e.printStackTrace(); 
        } 
        return obj; 
    } 
}
	class Circle extends Prototype{
    public Circle() 
    { 
        this.Shape="Circle"; 
    } 
   
    @Override
    void drawShape()  
    { 
        System.out.println("Circle drawn"); 
    }
}
	class Rectangle extends Prototype{
    public Rectangle() 
    { 
        this.Shape="Rectangle"; 
    } 
   
    @Override
    void drawShape()  
    { 
        System.out.println("Rectangle drawn"); 
    }
}
    class Draw {
	private static Map<String,Prototype> shapes= new HashMap<String,Prototype>();  
    static 
    { 
        shapes.put("Circle", new Circle()); 
        shapes.put("Rectangle", new Rectangle()); 
    } 
    public static Prototype getShape(String shape) 
    { 
        return (Prototype)shapes.get(shape).clone(); 
    } 
}