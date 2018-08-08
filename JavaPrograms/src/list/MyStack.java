package list;

import java.util.Random;

/**
 * Created by abhinay on 8/7/18.
 */
public class MyStack  {

    MyLinkedList stack;

    public  MyStack() {
        stack = new MyLinkedList();
    }
    public void display() {
        stack.display();
    }

    public void pop() {
        stack.removeFirst();
    }

    public void push(int value) {
        stack.add(value);
    }

    public int peek(){
        return stack.peek();
    }
    public int getSize() {
        return stack.getSize();
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
        System.out.println("Stack ");
        Random r = new Random();
        MyStack stack = new MyStack();
        for (int i = 1 ; i <= n ; i++) {
            int x = r.nextInt(100) ;
            stack.push(x);
        }
        stack.display();
        stack.pop();
        stack.display();
    }
}
