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
    public void reorderList(ListNode head) {
       
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        ListNode curr=slow.next;
        slow.next=null;
        
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode lefthead=head;
        ListNode righthead=prev;
        ListNode nextleft;
        ListNode nextright;
        while(lefthead!=null && righthead!=null){
            nextleft=lefthead.next;
            lefthead.next=righthead;
            nextright=righthead.next;
            righthead.next=nextleft;
            lefthead=nextleft;
            righthead=nextright;
        }
        
    }
}