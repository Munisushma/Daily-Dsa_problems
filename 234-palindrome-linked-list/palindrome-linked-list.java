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
       ListNode slow = head;
       ListNode fast = head;
       ListNode prev = null;
       while(fast!=null && fast.next!=null){
        prev = slow;
        slow = slow.next;
        fast=fast.next.next;

       }
       ListNode mid = slow;
       ListNode second = null;
       ListNode curr = mid;
       while(curr!=null){
        ListNode next = curr.next;
        curr.next = second;
        second = curr;
        curr = next;
       } 
      ListNode p1 = head;
      ListNode p2 = second;
      while(p1!=null && p2!=null){
        if(p1.val!=p2.val){
            return false;
        }
        p1 = p1.next;
        p2 = p2.next;
      }
       return true;
    }
}