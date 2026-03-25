import java.util.LinkedList;

public class Collection_ll {
    public static void main(String[] args) {
        // create a linked linked list
        LinkedList<Integer>ll=new LinkedList<>();

        // add elemenet
        ll.addFirst(12);
        ll.addLast(24);
        ll.addFirst(6);
        ll.addLast(49);
        // print linked list
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
    }
}
