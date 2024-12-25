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
    public ListNode oddEvenList(ListNode head) {
                if (head == null || head.next == null || head.next.next == null) {
            return head; // Handle edge cases: empty list or less than 3 nodes
        }

        ListNode p = head;
        ListNode q = head.next;
        ListNode r = head.next.next;
        ListNode evenNode = q;
        while(r!=null){
            p.next = q.next;
            p = p.next;            
              q.next = r.next;
            q = q.next;
            if(q!=null){
                r = q.next;
            }
            else{
                r = null;
            }
           p.next = evenNode;


        }
        return head;
    }
}
