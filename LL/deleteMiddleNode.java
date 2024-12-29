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
    // approach2
    // public ListNode delete(ListNode head,ListNode node){
    //     ListNode prev = head;
    //     while(prev.next!=node){
    //         prev = prev.next;
    //     }
    //     if(node.next==null){
    //         prev.next=null;
    //     }
    //     else{
    //     prev.next = node.next;
    //     }
    //     return head;
    // }

    // public ListNode deleteMiddle(ListNode head) {
    //     if(head==null||head.next==null){
    //         return null;
    //     }
    //     ListNode fast = head;
    //     ListNode slow = head;
    //     while(fast!=null&&fast.next!=null){
    //         fast = fast.next.next;
    //         slow = slow.next;
    //     }
    //    return delete(head,slow);
    // }
    // approach1
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(slow.next==null){
            head.next = null;
            return head; 
        }
       slow.val = slow.next.val;
       slow.next=slow.next.next;
        return head;
    }
}
