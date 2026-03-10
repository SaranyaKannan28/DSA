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
        if(head==null || head.next==null) return head;
        ListNode temp = head;
        int length=1;

        while(temp.next!=null){
            length++;
            temp=temp.next;
        }
        
        k=k%length;
        if(k==0) return head;
        temp.next=head;
        
        ListNode newtail = head;
        int move =  length -k;
        for(int i=0;i<move-1;i++){
            newtail = newtail.next;
        }
        
        ListNode newhead = newtail.next;
        newtail.next=null;

        return newhead;
    }
}