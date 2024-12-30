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
    public ListNode reverse(ListNode head){
        if(head==null||head.next==null){
            return head;
        }

        ListNode p = null;
        ListNode q = head;
        ListNode r = head.next;
        while(q!=null){
            q.next = p;
            p=q;
            q=r;
            if(r!=null){
                r=r.next;
            }
        }
        return p;
    }
    public void reorderList(ListNode head) {
        ListNode p = head;
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null&&fast.next!=null){
                fast = fast.next.next;
            slow = slow.next;
        }
        ListNode q = reverse(slow.next);
        slow.next = null;
        while(q!=null&&p!=null){
            ListNode temp1;
            ListNode temp2;

            temp1 =  p.next;
              temp2 = q.next;

            p.next = q;
            q.next=temp1;
            p=temp1;
            q=temp2;
        }
    }
}
