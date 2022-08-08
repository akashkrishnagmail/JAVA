import java.util.Scanner;
class LessBalanceException extends Exception{
    LessBalanceException(double amt){
        System.out.println("Withdrawing"+amt+"is invalid");
    }
}
class User
{
    String name;
    User(String name)
    {
        this.name=name;
    }
    class Account
    {
       int acc_no;
       Double Balance;
       Account(int acc_no,Double Balance)
       {
        this.acc_no=acc_no;
        this.Balance=Balance;
       }
    }
   Account [] a= new Account[2];
   void deposit(Double amount,int a_no)
   {
    int found=0,k=-1;
    for(int i=0;i<2;i++)
    if(a[i].acc_no==a_no)
    {
          a[i].Balance+=amount;
          found=1;
          k=i;
          break;       
    }
    if(found==1)
    {
        System.out.println("Balance Updated");
        display(a[k].acc_no);
    }
    else
    System.out.println("Account number dose not exist");
   }
   void withdraval(Double amount,int acc_no) //throws LessBalanceException{
  {
    int k=-1;
    int found=0;
    for(int i=0;i<2;i++)
    if(a[i].acc_no==acc_no)
    {
        k=i;
        found=1;
        break;
    }
    if(found==1)
    {
        if((a[k].Balance<500)||(a[k].Balance<amount))
        System.out.println("cannot withdraw money");
        else
        {
            a[k].Balance=amount;
            display(a[k].acc_no);
        }
    }
    else
    System.out.println("");
   }
   void create_account()
   {
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<2;i++)
    {
        System.out.println("Enter the Account number");
        int acc_no=sc.nextInt();
        System.out.println("Enter Balance");
        Double Bal=sc.nextDouble();
        a[i]=new Account(acc_no, Bal);
    }
   }
   void display(int acc_no)
   {
    int k=-1,found=0;
    for(int i=0;i<2;i++)
    if(a[i].acc_no==acc_no)
    {
        k=i;
        found=1;
        break;
    }
    if(found==1)
    {
        System.out.println(name+"\t"+a[k].acc_no+"\t"+a[k].Balance);
    }
   }
}
public class bank1 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Create account with muinimum balanc");
        System.out.println("Enter the owner name");
        String name=sc.next();
        int acc_no;
        User u=new User(name);
        u.create_account();
        System.out.println("Account created successfully");
        Boolean opt=true;
        while(opt)
        {
            System.out.println("1.DEPOSIT 2.WITHDRAW 3.BALANCE ENQUIRY");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("Enter account number");
                acc_no=sc.nextInt();
                u.display(acc_no);
                break;
                case 2:System.out.println("Enter the account number");
                acc_no=sc.nextInt();
                System.out.println("Enetr the amount");
                Double amt=sc.nextDouble();
                u.deposit(amt, acc_no);
                break;
                case 3: //try {
                    System.out.println("Enter account number");
                    acc_no=sc.nextInt();
                    System.out.println("Enter amount to withdrawal");
                    Double amount=sc.nextDouble();
                    u.withdraval(amount, acc_no);
                    // catch ("LessBalanceException e") { }
            break;

            }
        }
    }
}

