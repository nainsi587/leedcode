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
    public ListNode partition(ListNode head, int x) {
        if(head==null ||head.next==null){
           return head;
        }
        ListNode dummy1=new ListNode(0);
        ListNode dummy2=new ListNode(0);
        ListNode dummy1p=dummy1;
        ListNode dummy2p=dummy2;
        while(head!=null){
          if(head.val<x){
            dummy1p.next=head;
            dummy1p=dummy1p.next;
          }else{
            dummy2p.next=head;
            dummy2p=dummy2p.next;
          }
          head=head.next; 
        }
        dummy2p.next=null;
        dummy1p.next=dummy2.next;
        return dummy1.next;
    }
}

