import java.util.LinkedList;
import java.util.List;

public class program11 {
    public static void main(String[] args) {
    LinkedList<Character> ll=new LinkedList<Character>();
    ll.add('B');
    ll.add('E');
    ll.add('F');
    System.out.println("Original contents are"+11);
    ll.addLast('G');
    ll.addFirst('A');
    System.out.println("\n after ading to first and last");
    System.out.println("contents are"+ll);
    ll.add(2, 'D');
    ll.add(2,'C');
    System.out.println("Afretr inserting in the 2 position are");
    System.out.println("contents are"+ll);
    System.out.println("displaying the fist and last elments are\n"+ll.getFirst() +" "+"\n"+ll.getLast());
    System.out.println("Afretr polling in the");
    ll.pollFirst();
    System.out.println("contents are"+ll);
    System.out.println("peek letter is");
    ll.peek();
    List<Character> sub =ll.subList(2, 5);
    System.out.println("the sub list items are"+sub);
    LinkedList<Character> ll2=new LinkedList<Character>(sub);
    ll.removeAll(ll2);
    System.out.println("after removing the content of ll2 in ll\n"+ll);
    ll.set(0,Character.toLowerCase(ll.get(0)));
    System.out.println("lower case letters are"+ll);
}
    }
