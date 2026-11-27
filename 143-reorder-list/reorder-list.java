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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode slow =head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast!=null && fast.next!=null){
            prev =slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;
        prev.next = null;
        ListNode second = null;
        ListNode curr = mid;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = second;
            second = curr;
            curr= next;
        }
        ListNode p1 = head;
        ListNode p2 = second;
        while(p2!=null){
            ListNode p1next =(p1!=null)? p1.next:null;
            ListNode p2next = p2.next;
            if(p1!=null){
                p1.next = p2;
            } 
            if(p1next!=null){
                p2.next = p1next;
            }
            p1 = p1next;
            p2 = p2next;
        }
    }
}