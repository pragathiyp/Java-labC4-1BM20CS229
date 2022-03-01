import java.util.*;

class shape
{
int a,b;

shape(int x, int y){
a=x;
b=y;
}

double Area(){

System.out.println(" area here is not defined");

return 0;
}
}

class circle extends shape{

circle(int n, int m){
super(n,m);
}

double Area(){
double c;
c=a*a*2*3.142;
return c;
}
}

class rect extends shape{

rect(int n, int m){
super(n,m);
}

double Area(){
double c;
c=a*b;
return c;
}
}

class tri extends shape{

tri(int n, int m){
super(n,m);
}

double Area(){
double i;
i=0.5*a*b;
return i;

}

}



class dynamic{
public static void main(String [] args)
{
shape a1= new shape(0,0);
rect r1 = new rect(15,25);
tri t1 = new tri(2,6);
circle s1 = new circle(5,10);

shape r;
r= a1;
System.out.println("area of area"+r.Area());

r= r1;
System.out.println("area of rectangle"+r.Area());

r= t1;
System.out.println("area of triangle" +r.Area());

r= s1;
System.out.println("area of circle" +r.Area());
}
}
