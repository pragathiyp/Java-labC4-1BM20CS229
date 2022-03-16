import java.util.*;
import java.lang.*;
class fatheragexception extends Exception
{
int fa;
fatheragexception(int a)
{
fa = a;
}
public String toString()
{
return("Father's age is invalid " + fa);
}
}
class sonagexception extends Exception
{
int sa;
sonagexception(int a)
{
sa = a;
}
public String toString()
{
return("Son's age is invalid " + sa);
}
}
class father
{
Scanner sc = new Scanner(System.in);
int agef;
father()
{
System.out.println("Enter father's age : ");
agef = sc.nextInt();
}
void wrong_Age() throws fatheragexception
{
if(agef<0)
{
throw new fatheragexception(agef);
}
}
}
class son extends father
{
int ages;
Scanner sc = new Scanner(System.in);
son()
{
System.out.println("Enter son's age : ");
ages = sc.nextInt();
}
void wrong() throws sonagexception
{
if( ages<0 || ages >= agef)
{

throw new sonagexception(ages);
}
}
}
class mainclass
{
public static void main(String args[]) {
son s = new son();
int c = 0;
try {
s.wrong_Age();
s.wrong();

}
catch(sonagexception e) {
System.out.println(e);
c = 1;
}
catch(fatheragexception e){
System.out.println(e);
c = 1;
}
if(c == 0)
{
System.out.println("Ages are entered correctly \n"+"Father's age = "+ s.agef+"\n"+"Son's age = "+s.ages);
}

}
}
