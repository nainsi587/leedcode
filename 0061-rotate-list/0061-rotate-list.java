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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null ||k==0){
            return head;
        }
        ListNode temp=head;
        ListNode tail=null;
        int n=0;
        while(temp!=null){
            tail=temp;
            temp=temp.next;
            n++;
        }
        k=k%n;
        //make list circuler
        tail.next=head;
        int step=n-k;
        ListNode newtail=head;
        for(int i=1;i<step;i++){
            newtail=newtail.next;
        }
        ListNode newhead=newtail.next;
        newtail.next=null;
        return newhead;

    }
}