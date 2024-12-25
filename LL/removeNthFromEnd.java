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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return head;
        }
        if(head.next==null){
            return null;
        }
        ListNode p = head;
        ListNode q = head;
        int count = 0;
        while(p!=null){
            p=p.next;
            count++;
        }
        int ans = count -n;
        if(ans==0){
            return head.next;

        }
        int res = 1;
        while(res<ans){
            q=q.next;
            res++;
        }
        q.next = q.next.next;
        return head;
    }
}
