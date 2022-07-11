class outer
{
     int out=100;
     class inner
     {
        int inn=200;
        void imethod()
        {
             System.out.println(out);
             System.out.println(inn);
        }
     }
     void outmethod()
     {
         inner in=new inner();
         System.out.println(in.inn);
         System.out.println(out);
        
     }
}

public class access {
    public static void main(String[] args) {
        outer ot=new outer();
        ot.outmethod();
        outer.inner ob1=ot.new inner();
        ob1.imethod();
    }
}
