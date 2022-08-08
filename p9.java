package programe9;

public class p9{
    public static void main(String[] args) 
    {
        SimpleStack si;
    fixedStack fs=new fixedStack(10);
    DynamicStack ds=new DynamicStack(5);
    si=fs;
    si=ds;
    System.out.println("The operations are for Fixed Stack push");
    for(int i=0;i<11;i++)
    {
        si.push((char) ('B'+i));
    }
    System.out.println("\nThe operations are for Fixed Stack for pop");
    for(int i=0;i<12;i++)
    {
        System.out.print(" "+si.pop());
    }  
    System.out.println("\nThe operations are for Dynamic Stack");
    for(int i=0;i<26;i++)
    {
        si.push((char) ('A'+i));
    }
    for(int i=0;i<27;i++)
    {
        System.out.print(" "+si.pop());
    }      
    }
    
}
