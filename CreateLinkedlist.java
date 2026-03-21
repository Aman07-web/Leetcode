public class CreateLinkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
    // add element at first position

    public void addFirst(int data) {
        // create a new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void addMiddle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while( i < idx-1 ){
        temp=temp.next;
        i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void print(){
      Node temp=head;
      while (temp!=null) {
        System.out.print(temp.data + " -> ");
        temp=temp.next;
      }
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("linked list is empty");
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
 // remove last node
  public int removeLast(){
       if(size==0){
            System.out.println("linked list is empty");
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        // traverse to the second last node
        Node temp=head;
        for(int i=0; i<size-2; i++){
            temp=temp.next;
        }
        int val=temp.data;
        temp.next=null;
        size--;
        tail=temp;
        return val;
  }
    public static void main(String[] args) {
        CreateLinkedlist ll = new CreateLinkedlist();
        ll.addFirst(10);
        ll.addFirst(30);
        ll.addLast(60);
        ll.addFirst(5);
        ll.addMiddle(2,45);
        ll.print();
        ll.removeFirst();
        System.out.println();
        ll.print();
        ll.removeLast();
        System.out.println();
        ll.print();
        System.out.println();
        System.out.print("size of linked list : "+size);
       // ll.removeFirst(); 
    }
}
