public static LL Merge(LL list,LL list2) {
    Node head1 = list.head;
    Node head2 = list2.head;
    LL list3 = new LL();

    Node head3 = list3.head;
    while (head1 != null && head2 != null) {


        if (head1.val < head2.val) {
            list3.InsertLast(head1.val);
            head1 = head1.next;

        }

        else if (head1.val > head2.val) {
            list3.InsertLast(head2.val);
            head2 = head2.next;
        } else {
            list3.InsertLast(head1.val);
            head1 = head1.next;
        }
    }
        while (head2 != null) {
            list3.InsertLast(head2.val);
            head2 = head2.next;


            while (head1 != null) {
                list3.InsertLast(head1.val);
                head1 = head1.next;

            }
    }
    return list3;

}



public static void main(String[] args) {
    LL list = new LL();
    LL list2 = new LL();

    list.InsertLast(1);
    list.InsertLast(2);
    list.InsertLast(6);

    list2.InsertLast(1);
    list2.InsertLast(4);
    list2.InsertLast(5);
    list2.InsertLast(8);
    list2.InsertLast(9);

    LL ans = LL.Merge(list,list2);
ans.Display();

}