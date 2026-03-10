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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=  head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow= slow.next;
            fast=fast.next.next;

        }
        ListNode  newhead = reverse(slow.next);
        ListNode  first = head;
        ListNode  second =  newhead;

        while(second!=null){
            if(first.val!=second.val) {
                reverse(newhead);
                return false;
            }
            second=second.next;
            first=first.next;
        }
        reverse(newhead);
        return true;
    }

    public static ListNode reverse(ListNode node){

        ListNode current = node;
        ListNode prev = null;

        while(current!=null){
            ListNode nxtval = current.next;
            current.next=prev;
            prev=current;
            current=nxtval;
        }
       return prev;
    }
}