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
    public ListNode insertionSortList(ListNode head) {
        if(head==null  || head.next==null){
            return head;
        }
        ListNode temp=head.next;
        ListNode sortedtail=head;
        while(temp!=null){
            if(sortedtail.val<temp.val){
                sortedtail=temp;
                temp=temp.next;
                continue;

            }
            //temp ko sorted part se emove kro
            sortedtail.next=temp.next;
            ListNode prev=null;
            ListNode t1=head;
            //currect position find kro
            while(t1!=sortedtail){
                if(temp.val<t1.val){
                    break;
                }
                prev=t1;
                t1=t1.next;
            }
                //insertion at head
            if(prev==null){
                  temp.next=head;
                  head=temp;
            }else{
                    temp.next=t1;//insert at specific position
                    prev.next=temp;
            }
            //temp at currect position
            temp=sortedtail.next;
            
        }
        return head;
    }
}