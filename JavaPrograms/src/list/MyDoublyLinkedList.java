package list;

/**
 * Created by abhinay on 8/7/18.
 */

class DNode{
    DNode next;
    DNode previous;
    int value;

    public DNode(){
    }
    public DNode(int value){
        this.value = value;
    }

}

public class MyDoublyLinkedList implements MyList{

    DNode head;
    DNode tail;
    int size;
    @Override
    public void display() {
        if (head != null){
            DNode temp = head;
            while(temp != null){
                System.out.print(temp.value+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    @Override
    public void add(int value) {
        if(head == null){
            head = new DNode(value);
            tail = head;
            size += 1;
        }
        else{
            DNode temp = new DNode(value);
            temp.next = head;
            head.previous = temp;
            head = temp;
            size += 1;
        }
    }

    @Override
    public void addLast(int value) {
        if(tail == null){
            head = new DNode(value);
            tail = head;
            size += 1;
        }
        else{
            DNode temp = new DNode(value);
            tail.next = temp;
            temp.previous = tail;
            tail = temp;
            size += 1;
        }
    }

    @Override
    public void removeLast() {
        if (tail == null){
            System.out.println("List Empty; Cannot remove");
        }
        else{

            DNode temp = tail.previous;
            temp.next = null;
            tail = temp;
            size -= 1;
        }
    }

    @Override
    public void removeFirst() {
          if (head == null) {
              System.out.println("List Empty; Cannot remove");
          }
          else{
              DNode temp = head.next;
              temp.previous = null;
              head = temp;
              size -= 1;
          }
    }

    @Override
    public int getSize() {
        return size;
    }
}
