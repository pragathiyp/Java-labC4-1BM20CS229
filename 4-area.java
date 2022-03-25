
import java.util.*;
abstract class Shape {
    int l, h;

    Shape(int a, int b) {
        l = a;
        h = b;
    }

    abstract void printArea();
}
class Rectangle extends Shape{
    Rectangle(int a,int b)
    {
        super(a,b);
    }
    void printArea(){
        System.out.println("Area of rectangle:"+(l*h));
    }}

class Triangle extends Shape{
    Triangle(int a,int b)
    {
        super(a,b);
    }
    void printArea(){
        System.out.println("Area of rectangle:"+(0.5*l*h));
    }}

class Circle extends Shape{
    Circle(int r)
    {
        super(r,0);
    }
    void printArea(){
        System.out.println("Area of rectangle:"+(3.14*l*l));
    }}
 class Abs{
    public static void main(String[] args) {
	Circle c =new Circle(5);
    Triangle t=new Triangle(3,4);
    Rectangle r=new Rectangle(3,4);
    c.printArea();
        t.printArea();
        r.printArea();
    }
}
