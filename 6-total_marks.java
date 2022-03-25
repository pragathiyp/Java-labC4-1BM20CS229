
package CIE;
import java.util.*;
public class Students
{
Scanner sc = new Scanner(System.in);
public int USN;
public String name;
public int sem;
public void accept()
{
System.out.println("ENTER STUDENT NAME");
name = sc.nextLine();
System.out.println("ENTER STUDENT USN");
USN = sc.nextInt();
System.out.println("ENTER STUDENT SEM");
sem = sc.nextInt();
}
public void display()
{
System.out.println("NAME = "+name);
System.out.println("USN = "+USN);
System.out.println("SEM = "+sem);
}
}

package SEE;
import CIE.*;
import java.util.*;
public class externals extends Students
{
Scanner sc = new Scanner(System.in);
public int seem[] = new int[5];
public void get_markss()
{
System.out.println("ENTER SEE MARKS OF STUDENTS:");
for(int i = 0;i<5;i++)
{
System.out.println("SUBJECT"+(i+1));
seem[i] = sc.nextInt();
}
}
}

package CIE;
import CIE.Students;
import java.util.*;
public class internals extends Students
{
Scanner sc = new Scanner(System.in);
public int ciem[] = new int[5];
public void get_marksc()
{
System.out.println("ENTER CIE MARKS OF STUDENTS:");
for(int i = 0;i<5;i++)
{
System.out.println("SUBJECT"+(i+1));
ciem[i] = sc.nextInt();
}
}
}

import SEE.externals;
import CIE.internals;
import CIE.Students;
import java.util.*;
class totalMarks
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int i,j,n;
System.out.println("ENTER NUMBER OF STUDENTS ");
n = sc.nextInt();
Students s[] = new Students[n];
internals cie[] = new internals[n];
externals see[] = new externals[n];
for(i = 0;i<n;i++)
{
System.out.println("ENTER DETAILS OF "+(i+1)+" STUDENT");
s[i] = new Students();
cie[i] = new internals();
see[i] = new externals();
s[i].accept();
cie[i].get_marksc();
see[i].get_markss();
}
System.out.println("STUDENT DETAILS");
for(i = 0;i<n;i++)
{
s[i].display();
for(j=0;j<5;j++)
{
System.out.println("The total marks in "+(j+1)+" course is "+(cie[i].ciem[j]+see[i].seem[j]));
}
}
}
}
