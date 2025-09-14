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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head ;
        ListNode prevnode =  null ;

        while(temp!=null){
            ListNode kNode = findknode(temp,k);
            if(kNode==null){
                if (prevnode != null) prevnode.next = temp;
                break;
            }
            ListNode nextnode = kNode.next;
            kNode.next=null;

            reverse(temp);

            if(head==temp){
                head = kNode;
            }
            else{
                prevnode.next = kNode;
            }

            prevnode = temp;
            temp = nextnode;
        }
        return head;
    }

    public static ListNode findknode(ListNode node , int k){
        ListNode temp = node;
        int count=1;
        while(temp!=null && count<k){
            temp=temp.next;
            count++;
        }
        return temp;
    }

    public static ListNode reverse(ListNode node){
        ListNode current =  node;
        ListNode prev = null,nextnode = null;

        while(current!=null){
            nextnode = current.next;
            current.next = prev;
            prev=current;
            current = nextnode; 
        }
        return prev;
    }
}