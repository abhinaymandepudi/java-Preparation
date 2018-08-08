package list;

/**
 * Created by abhinay on 8/7/18.
 */

class Node {

    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
    }

}
public class MyLinkedList  implements MyList{

        private Node head;
        private int size;
        private Node tail;

        public MyLinkedList(){
        }

        public MyLinkedList(int value){

            head = new Node(value);
            this.tail = this.head;
        }

        public int peek(){
            if (head == null){
                return -1;
            }
            return head.value;
        }
        @Override
        public void display() {
            Node temp = this.head;
            while(temp != null){
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        @Override
        public void add(int value) {
            if (this.head == null) {
                this.head = new Node(value);
                this.tail = this.head;
                this.size += 1;

            } else {
                Node temp = new Node(value);
                temp.next = this.head;
                this.head = temp;
                this.size += 1;

            }
        }
        public int getSize(){
            return this.size;
        }
        public void getTailValue(){
            System.out.println(this.tail.value);
        }
        @Override
        public void addLast(int value) {
            if (this.tail == null) {
                this.head = new Node(value);
                this.tail = this.head;
                this.size += 1;

            } else {
                Node temp = new Node(value);
                this.tail.next = temp;
                this.tail = temp;
                this.size += 1;

            }
        }

        @Override
        public void removeLast() {
            if (this.tail == null){
                System.out.println("List Empty: Cannot remove ");
            }
            else if(this.head.next == null){
                this.head = null;
                this.tail = null;
            }
            else{
                Node temp = this.head;
                while (temp.next != null && temp.next.next != null){
                    temp = temp.next;
                }

                temp.next = null;
                this.tail = temp;
                this.size -= 1;
            }
        }

        public void removeFirst(){
            if (this.head == null){
                System.out.println("List Empty: Cannot remove ");
            }
            else{
                this.head = this.head.next;
                this.size -= 1;
            }
        }
    }