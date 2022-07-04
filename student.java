import javax.xml.crypto.dsig.SignatureMethod;


public class student
{
   public static void main(String[] args) {
    std s=new std();
    s.getdata(10, "akash");
    s.printdata();
   }
}
class std
{
    private int usn;
    private String name;
    void getdata(int v,String n)
    {
         this.usn=v;
         this.name=n;
    }
    void printdata(){
        System.out.println("USN=\t"+usn+"\nNAME=\t"+name);
    }

}