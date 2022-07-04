import java.util.Scanner;

public class employe_demo {
    public static void main(String[] args) {
        employe [] e=new employe[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER EMPLOYE DETAILS");
        for(int i=0;i<2;i++)
        {
            System.out.println("ENTER EMPLOYE SSN");
            int s=sc.nextInt();
            System.out.println("ENTER EMPLOYE NAME");
            String name=sc.next();
            System.out.println("ENTER EMPLOYE SALARY");
            int sal=sc.nextInt();
            System.out.println("ENTER EMPLOYE DATE OF BIRTH");
            String DOB=sc.next();
            e[i]=new employe(s, name, sal,DOB);
        }
        System.out.println("ARRAY of data is");
        for(int i=0;i<6;i++)
        {
             e[i].printdata();
        }
    }
}
class employe{
    private int ssn,esal;
    private String ename,dob;
    employe(int ssn,String ename,int esal,String dob)
    {
        this.ssn=ssn;
        this.ename=ename;
        this.esal=esal;
        this.dob=dob;
    }
    void printdata()
    {
         System.out.println("SSN=\t"+ssn +"\tNAME=\t"+ename+"\tSALARY=\t"+esal+"\tDOB=\t"+dob);
    }
}
