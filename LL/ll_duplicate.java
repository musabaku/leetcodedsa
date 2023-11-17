  public void duplicate(){
        Node node = head;
        while(node.next!=null) {
            if (node.val == node.next.val) {
                node.next= node.next.next;
            }
            else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.InsertFirst(1);
        list.InsertFirst(1);
        list.InsertFirst(2);
        list.InsertFirst(3);
        list.InsertFirst(3);
        list.Display();
        list.duplicate();
        list.Display();
    }