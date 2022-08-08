package programe9;
public class fixedStack implements SimpleStack
{
    private char[]data;
    private int tos;
    fixedStack(int size)
    {
        data=new char[size];
        tos=0;
    }
    public void push(char ch)
    {
        if(isFull())
        {
            System.out.println("Stack is full");
            return;
        }
        data[tos]=ch;
        tos++;
    }
    public char pop()    
    {
       if(isEmpty())
       {
        System.out.println("Empty Stack");
        return(char)0;
       }
       tos--;
       return data[tos];
    }
    public boolean isEmpty()
    {
         return tos==0;
    }
    public boolean isFull()
    {
        return tos==data.length;
    }
  
}
