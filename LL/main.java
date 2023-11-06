public class Main {
    public static void main(String[] args) {

        LL list = new LL();
        list.InsertFirst(5);
        list.InsertFirst(6);
        list.InsertFirst(7);
        list.InsertFirst(8);
        list.InsertFirst(9);
        list.InsertLast(94);
        list.InsertBetween(3,22);
        list.DeleteFirst();
        list.insertRec(6699,2);
        list.Display();

    }
}