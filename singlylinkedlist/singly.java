package singlylinkedlist;
public class singly<T> {
    private Node<T> head;
    private Node<T> tail;
    private Node<T> temp;
    private int size;

    public singly() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addLast(T elem) {
        if(head == null){
            head = new Node<T>();
            head.element = elem;
            tail = head;
            size++;
        } else  {
            temp = new Node<T>();
            temp.element = elem;
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
            size++;
        }  

    }
    void print(){
        temp = head;
        while(temp  != null){
            System.out.println(temp.element);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        singly<Integer> list = new singly<Integer>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.print();

    }
}