package shape;

public class sevenb {
    public static void main(String[] args) {
        
    
    circle cr=new circle();
    square sr=new square();
    triangle tr=new triangle();
    cr.getData(5.0);
    System.out.println("the value of Circle="+cr.area());
    tr.getData(3.0, 5.0);
    System.out.println("the value of Triangle="+tr.ar());
    sr.getData(7.00);
    System.out.println("the value of Square="+sr.area());


 }
}