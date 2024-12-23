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
    // public ListNode Reverse(ListNode head){
    //     if(head==null || head.next==null){
    //         return head;
    //     }
    //     ListNode temp = head;
    //     ListNode prev = null;
    //     ListNode curr= head;
    //     ListNode future= head.next;
    //     while(curr!=null){
    //         curr.next=prev;
    //         prev=curr;
    //         curr=future;
    //         if(future.next!=null){
    //             future=future.next;
    //         }
    //     }

    //     return temp;
    // }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    //   ListNode h1=  Reverse(l1);
    //   ListNode h2=  Reverse(l2);
    ListNode p1 = l1;
    ListNode p2 = l2;
    ListNode res = new ListNode(-1);
    ListNode curr = res;
    int carry=0;

      while(p1!=null||p2!=null){
        int sum = carry;
        if(p1!=null) {
            sum+=p1.val;
        }
          if(p2!=null) {
            sum+=p2.val;
        }
        ListNode ans=new ListNode(sum%10);
        carry = sum/10;
        if(p1!=null) p1=p1.next;
        if(p2!=null) p2=p2.next;
        curr.next = ans;
        curr=curr.next;
      }
      if(carry!=0){
        ListNode ans1 = new ListNode(carry);
        curr.next= ans1;

      }
        ListNode result = res.next;
        res.next = null;
        return result;
    }
}
