package p1;


public class A
{

  public A()
 {

    System.out.println("A");
 }

    public void dispA()
  {

     System.out.println("Display A");
   }
}
package p1;


public class B
{

  public B()
 {

    System.out.println("B");
 }

    public void dispB()
  {

     System.out.println("Display B");
   }
}

package p1.p11;


public class C
{

  public C()
 {

    System.out.println("C");
 }

    public void dispC()
  {

     System.out.println("Display C");
   }
}

package p2;


public class D
{

  public D()
 {

    System.out.println("D");
 }

    public void dispD()
  {

     System.out.println("Display D");
   }
}

package pack;
import p1.A;
import p1.B;
import p1.p11.C;
import p2.D;


 public class packtest{


    public static void main(String args[])
    {


          A a1=new A();
          B b1=new B();
          D d1=new D();
          C c1=new C();

           a1.dispA();
           b1.dispB();
           c1.dispC();
           d1.dispD();
      
    }
 } 
