
import java.util.Scanner;


class QueueException extends Exception
{
    public void Error()
    {
         System.out.println("QUEUE IS FULL");
    }
    
}

class Queue{
    public int frount,rear;
    int size;
    int qarray[];
    Queue(int n)
    {
        qarray=new int[n];
    }
    void insert(int ele) throws QueueException
    {
      
        if(rear>=qarray.length)
        {
            throw new QueueException();
        }
        if(frount==-1)
        {
            frount=0;
        }
        qarray[rear++]=ele;
    }
        int delet()
    
        {    
            int elem; 
            if(frount==-1)
            {
               throw new ArrayIndexOutOfBoundsException();
            }
            if(frount==rear)
            {
              elem=qarray[frount];
              rear=frount=-1;
            }
            else
            {
                elem=qarray[frount++];

            }
            return elem;
            }
        void display() throws QueueException 
           {
            if(frount==-1)
            {
                throw new QueueException();
            }
            for(int i=frount;i<=rear;i++)
            {
                System.out.println(i+"\t");
            }
           }
    }
public class prg6 {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of queue : ");
        int size=sc.nextInt();
        Queue que=new Queue(size);
        try{
            while(true)
            {
                System.out.println("QUEUE OPERATIONS \n 1.INSERT \n2.DELETE \n 3. DISPLAY\n 4.EXIT\n");
                System.out.println("Enter your choise\n");
                int choise=sc.nextInt();
                switch(choise)
                {
                  case 1:System.out.println("Enter the eliment tob insert\n");
                       
                      que.insert(sc.nextInt());
                      break;
                  case 2:que.delet();
                  break;
                  case 3: que.display();
                  break;
                  default:System.out.print("wrong choice");
                  return;

                }
                
            }
        }
        catch(QueueException e)
        {
            e.Error();
        } 
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Queue is empty");
        }    
        
    }
}
