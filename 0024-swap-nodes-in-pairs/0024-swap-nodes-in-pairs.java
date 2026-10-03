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
    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return head;
        }
        if(head.next==null){
            return head;
        }
        ListNode dummy=new ListNode(0);
        ListNode point=dummy;
        dummy.next=head;
        
        while(point.next!=null && point.next.next!=null){
            ListNode swap1=point.next;
            ListNode swap2=point.next.next;
            swap1.next=swap2.next;
            swap2.next=swap1;
            point.next=swap2;
            point=swap1;
        }
        return dummy.next;
    }
}