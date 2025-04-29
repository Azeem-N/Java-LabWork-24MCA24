package lab2cycle;

interface Shape{
 double calculatearea();
}

class Triangle implements Shape{
 double base;
 double height;

 public Triangle(double base,double height){
     this.base=base;
     this.height=height;
 }

 
 public double calculatearea(){
     return 0.5*base*height;
 }
}

class Rectangle implements Shape{
 double length;
 double width;

 public Rectangle(double length,double width){
     this.length=length;
     this.width=width;
 }

 public double calculatearea(){
     return length*width;
 }
}

public class Shapes{
 public static void main(String[] args){
     Shape shape1=new Triangle(10,5);  
     Shape shape2=new Rectangle(4,6);  
     System.out.println("Area of Triangle: " +shape1.calculatearea());  
     System.out.println("Area of Rectangle: " +shape2.calculatearea());  
 }
}

