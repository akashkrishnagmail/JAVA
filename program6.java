class Q{
    int n;
    boolean valueSet=false;
    synchronized int get()
    {
        while(!valueSet)
        try
        {
            wait();
        }
        catch(InterruptedException e)
        {
            System.out.println("Interupted Exception");
        }
        System.out.println("Got:"+n);
        valueSet=false;
        notify();
        return n;
    }

synchronized void put(int n)
{
    while(valueSet)
    try {
        wait();
    }
    catch(InterruptedException e){
        System.out.println("Interupted Exc cought");
    }
     this.n=n;
    valueSet=true;
    System.out.println("put:"+n);
    notify();
}
}
class producer implements Runnable{
    Q q;
    producer(Q q){
        this.q=q;
        new Thread(this,"producer").start();
    }
    public void run(){
  int i;
        for(i=0;i<10;i++){
            q.put(i++);
        }
    }
}
class Consumer implements Runnable{
    Q q;
    Consumer(Q q){
        this.q=q;
        new Thread(this,"consumer").start();
    }
    public void run(){

        while(true){
            q.get();
        }
    }
}
public class program6 {
    public static void main(String[] args){
        Q q=new Q();
        new producer(q);
        new Consumer(q);

 }

}
    

