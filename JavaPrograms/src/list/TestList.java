package list;

import java.util.Random;

/**
 * Created by abhinay on 8/7/18.
 */
public class TestList {

    public static void test(MyList myList, int n){

        Random r = new Random();
        for (int i = 1 ; i <= n ; i++) {
            int x = r.nextInt(100) ;
            myList.add(x);
        }
        myList.display();
        myList.removeFirst();
        myList.display();
        myList.removeLast();
        myList.display();
        myList.add(r.nextInt(100));
        myList.display();
        myList.addLast(r.nextInt(100));
        myList.display();
    }
    public static void testStack(MyStack stack, int n){

        Random r = new Random();
        for (int i = 1 ; i <= n ; i++) {
            int x = r.nextInt(100) ;
            stack.push(x);
        }
        stack.display();
    }
    public static void main(String [] args){

        int n = Integer.parseInt(args[0]);
        //System.out.println("Singly Linked List");
        //test(new MyLinkedList(),n);
        //System.out.println("Doubly Linked List");
        //test(new MyDoublyLinkedList(),n);
        System.out.println("Stack ");
        testStack(new MyStack(),n);
    }
}
