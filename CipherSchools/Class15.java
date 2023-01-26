public class Class15 {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
 
        }
    }
    
        public static Node createClone(Node head){
            if(head==null){
                return null;
            }
            Node original = head;
           while(original!=null && original.next!=null){
            Node clone = new Node(5);
            Node next = original.next;
            original.next = clone;
            clone.next=next;
            original=original.next.next;
           }
           original.next = new Node(original.Data);
           original = head;
           while(original!=null && original.next!=null){
            if(original.random!=null){
                original.next.randomm=original.random.next;
            }
            original=original.next.next;
           }
           original = head;
           Node copy = head.next;
           Node newHead = head.next;
           while(original.next!=null && copy.next!=null){
            original.next=original.next.getNext();
            copy.next=copy.next.next;
            original = original.next;
            copy=copy.next;
           }
           original.next=null;
           return newHead;




        }
    
    
}
