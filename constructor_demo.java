class constructor{
   
        int l;
        int b;
        int h;
        constructor(int len,int bre,int hig)
        {
             l=len;
             b=bre;
             h=hig;
        }
        constructor(int len)
    
        {
            h=b=l=len;
        }
        int volume()
        {
            int vol=l*b*h;
           return(vol);
        }
        void print()
        {
             System.out.println("METHOD OVERLOADING");
        }
        void print(int v)
        {
            System.out.println("VOLUME OF BOX ARE="+v);
        }
}
public class constructor_demo{ 
public static void main(String[] args) {
    constructor quboid=new constructor(10,20, 40);
    constructor qube=new constructor(30);
    /*System.out.println("THE VOLUME OF QUBOID IS="+quboid.volume());
    System.out.println("THE VOLUME OF QUBe IS=" + qube.volume());
*/
int v1=quboid.volume();
int v2=qube.volume();
quboid.print();
quboid.print(v1);
qube.print();
qube.print(v2);
}

    
}
