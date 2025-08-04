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
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prevnode = null;

        while(current!=null){
            ListNode NextNode=current.next;
            current.next=prevnode;
            prevnode=current;
            current=NextNode;
        }
        return prevnode;
        
    }
}