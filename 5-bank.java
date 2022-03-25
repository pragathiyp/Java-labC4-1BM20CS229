
import java.util.*;

class Bank{
    String name;
    int acc_no;
    float bal,si;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of account holder");
        name=sc.nextLine();
        System.out.println("Enter account number");
        acc_no=sc.nextInt();
        System.out.println("Enter balance:");
        bal=sc.nextFloat();
    }
    void display()
    {
        System.out.println("Details:");
        System.out.println("Name:"+name+"\nAccount number"+acc_no+"\nbalance"+bal);
    }
    void deposit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you want to deposit");
        int d=sc.nextInt();
        if(d==1)
        {
            System.out.println("Enter amount to be deposited");
            int amt=sc.nextInt();
            bal+=amt;
            System.out.println("Available balance:"+bal);
        }
    }
    class Current extends Bank{
        float service_charge=100;
        void cheque()
        {
            System.out.println("No cheque service");
        }
        void withdraw()
        {
            float amount;
            Scanner sc=new Scanner(System.in);
            System.out.println("Min balance: Rs 10000");
            System.out.println("Enter amount to be withdrawn");
            amount=sc.nextFloat();
            if(amount>bal)
                System.out.println("Balance is insufficient");
            else
                bal=bal-amount;
            if(bal<10000){
                bal=bal-service_charge;
            System.out.println("Service charge added:"+service_charge);
            System.out.println("Available balance:"+bal);
        }
            else
            {
                System.out.println("Withdrawal: "+amount);
                System.out.println("Availble balance:"+bal);
            }
    }}
}
class Savings extends Bank{
    void cheque()
    {
        System.out.println("No cheque service");
    }
    void interest()
    {
        System.out.println("Enter rate of interest");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        System.out.println("Enter number of times interest was applied");
        int n=sc.nextInt();
        System.out.println("Enter time");
        int t=sc.nextInt();
        double ci=bal*(1+(r/n));
        System.out.println("Compound interest is:"+(Math.pow(ci,n*t)));
    }
    void withdraw()
    {
        float amount;
        Scanner sc=new Scanner(System.in);
        System.out.println("Minimum balance not required");
        System.out.println("Enter amount to withdraw");
        amount=sc.nextFloat();
        if(amount>bal)
            System.out.println("Balance not sufficient");
        else
            bal=bal-amount;
        System.out.println("Withdrawal:"+amount);
        System.out.println("Available balance:"+bal);
    }
}
public class Main {

    public static void main(String[] args) {
Savings obj1=new Savings();
 Current obj2=new Current();
 System.out.println("1.Savings\n 2.Current\n");
 System.out.println("Enter choice");
 Scanner sc=new Scanner(System.in);
 int ch=sc.nextInt();
 switch (ch)
 {
     case 1: obj1=new Savings();
     obj1.accept();
     obj1.display();
     obj1.cheque();
     obj1.deposit();
     obj1.withdraw();
     obj1.interest();
     break;
     case 2: obj2=new Current();
         obj2.accept();
         obj2.display();
         obj2.cheque();
         obj2.deposit();
         obj2.withdraw();
         obj2.interest();
         break;
 }
    }
}
