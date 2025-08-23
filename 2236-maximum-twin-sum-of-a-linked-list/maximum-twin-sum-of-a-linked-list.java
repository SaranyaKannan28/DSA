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
    public int pairSum(ListNode head) {
       ListNode temp = head;
       List<Integer> list = new ArrayList<>(); 
       while(temp!=null){
          list.add(temp.val);
          temp=temp.next; 
       }
       int r=list.size()-1 , max=0, l=0;
       while(l<=r){
         int sum = list.get(l)+list.get(r);
         max=Math.max(max,sum);
         r--;
         l++;
       }
       return max;
    }
}