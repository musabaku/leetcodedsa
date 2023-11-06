public class LL {

    public Node head;
    public Node tail;
    public int size;

    public LL (){
        this.size = 0;
    }
    public void InsertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size ++;
    }
    public void DeleteFirst(){
        head = head.next;

        size --;
    }


    public void insertRec(int value,int index){
        head = insertRec(value,index,head);
    }

    private Node insertRec(int value,int index,Node node){
        if(index==0){
            Node temp = new Node(value,node);
            size++;
            return temp;
        }
        node.next = insertRec(value,index-1,node.next);
        return node;
    }
    public void InsertLast(int value){
        Node node = new Node(value);
        if(tail==null){
            InsertFirst(value);
            return;
        }
        tail.next = node;
        tail = node;
        size ++;

    }
    public void InsertBetween(int index,int value){

        while(index==0){
            InsertFirst(value);
        }
        while(index==size){
            InsertLast(value);
        }

        Node temp = head;
        for(int i =1;i<index;i++){
            temp=temp.next;
        }
        Node node = new Node(value,temp.next);

        temp.next=node;
    }
    public void Display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val + " -> ");

            temp = temp.next;

        }
        System.out.print("End");

    }

    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next){
            this.val = val;
            this.next=next;
        }
    }
}
