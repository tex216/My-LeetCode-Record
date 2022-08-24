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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy, cur = head;
        
        while (cur != null) {
            //locate the last duplicate node, now cur is the last one
            while (cur.next != null && cur.val == cur.next.val) cur = cur.next;
            //deletion by skiping duplicates
            if (pre.next != cur) pre.next = cur.next;
            else pre = pre.next;
            //move forward
            cur = cur.next;
        }
        
        return dummy.next;
    }
}