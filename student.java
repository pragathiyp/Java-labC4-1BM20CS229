import java.util.*;
class student{

 String usn, name;
 int i;
 float sgpa;
 int cred[] = new int[5];
int marks[] = new int[5];

 void input(){

System.out.println ("enter the name of student:");
Scanner str = new Scanner(System.in);
name = str.nextLine();

System.out.println ("enter the usn of student:");
usn = str.nextLine();

System.out.println ("enter the credits of student:");
for(i=0; i<5; i++) {
System.out.println ("credits"+(i+1)+":");
cred[i]=str.nextInt();
}


System.out.println ("enter the marks of student:");
for(i=0; i<5; i++) {
System.out.println ("marks"+(i+1));
marks[i]=str.nextInt();
}
}

void sgpacalc()
  {
    sgpa=0;
    int sum=0;
    for(int i=0;i<5;i++)
    {
         int s=marks[i],c;
         if(s>=90)
           c=10;
           
         else if((s>=80)&&(s<=90))
           c=9;
           
         else if((s>=70)&&(s<=80))
           c=8;
           
         else if((s>=60)&&(s<=70))
           c=7;
           
         else if((s>=50)&&(s<=60))
           c=6;
           
         else if((s>=40)&&(s<=50))
           c=5;
           
         else 
           c=0;
           
         sgpa+=(c*cred[i]);
         sum=sum+cred[i];
      }
      sgpa/=sum;    
  }

  void display(){

    System.out.println ("name of student:"+name);
    System.out.println ("usn of student:"+usn);
    System.out.println("Subjects\tCredits\tMarks");
         for(int i = 0; i<5; i++)
         {  
           System.out.println("   "+(i+1)+"    \t"+"   "+ cred[i]+"   \t  "+marks[i]);
         }
         System.out.println("SGPA: "+sgpa);
      }  
    
public static void main(String[] args) 
{
student b1 =new student();

System.out.println ("details:");
b1.input();

b1.sgpacalc(); 

System.out.println ("verify:");
b1.display();





}
}


