class method_over{
    float l,b,h;
    double are(double l,double b)
    {
        return l*b;
    }
    float are(float l,float h)
    {
     
         return l*h/2;
    }
    double are(double l)
    {
        return 2*l;
    }

}
public class area {
public static void main(String[] args) {
    method_over m1=new method_over();
    float l=10,h=30;
    double a=20,b=20,c=20;
     System.out.println("method over lod are\n");
     float triangle=m1.are(l,h);
     double square=m1.are(a);
     double recangle=m1.are(b,c);
     System.out.println("AREA OF TRIANGLE="+triangle);
     System.out.println("AREA OF SQUARE="+square);
     System.out.println("AREA OF RECTANGLE="+recangle);
}    
}
