/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         ListNode head= list1;
         if(list1==null) return list2;
         if(list2==null) return list1;
       if( list1.val>list2.val){
         head= list2;
         list2 = list2.next;
        }
        else{
  head= list1;
         list1 = list1.next;
        }
        ListNode current = head;
        ListNode p1 = list1;
        ListNode q1 = list2;
        while(p1!=null&&q1!=null){
        if( p1.val < q1.val){
          current.next = p1;
            p1=p1.next;
        }
     
        else {
                current.next = q1;
            q1=q1.next;
        }
        current = current.next;
        }
        if(p1!=null){
            current.next = p1;
        }
        if(q1!=null){
            current.next = q1;
        }
        return head;
    }
}
