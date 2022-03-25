import java.util.*;
class SimpInt{
double P,T,R;
double SI()
{
return (P*T*R)/100;
}
public static void main(String args[])
{
SimpInt s1=new SimpInt();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the values of principle, time and rate");
s1.P=sc.nextDouble();
s1.T=sc.nextDouble();
s1.R=sc.nextDouble();
System.out.println("The simple interest is:"+s1.SI());
}}
