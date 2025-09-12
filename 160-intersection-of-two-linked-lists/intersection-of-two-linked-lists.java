/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode , Integer> map = new LinkedHashMap<>();
        if(headA==null||headB==null) return null;
        ListNode temp1 =  headA;
        while(temp1!=null){
            map.put(temp1,map.getOrDefault(temp1,0)+1);
            temp1=temp1.next;
        }

        ListNode temp2= headB;
        while(temp2!=null){
            if(map.containsKey(temp2)){
                return temp2;
            }
            temp2=temp2.next;
        }
        return null;
    }
}