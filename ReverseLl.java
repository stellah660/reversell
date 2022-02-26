import java.util.*;
public class ReverseLl {
    static LinkedList<Integer> ll=new LinkedList<>();
  static  Stack<Integer> stack=new Stack<>();
    private static int index;

    public static void main(String[]args){
        input();
        while(!ll.isEmpty()){
            stack.push(ll.get(0));
            ll.remove(0);
        }
        while(!stack.isEmpty()){
            ll.add(stack.pop());
        }
        System.out.println("reversed linked list is");
        for(int item:ll){
            System.out.print(item+"\t");
        }
    }
    static void input() {
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
    }
}
