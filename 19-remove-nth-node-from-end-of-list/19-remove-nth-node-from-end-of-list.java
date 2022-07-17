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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        
        int counter = 1;
        while (counter <= n) {
            second = second.next;
            counter++;
        }
            
        while (second.next != null) {
            first = first.next;
            second = second.next;
        }
        
        first.next = first.next.next;
        return dummy.next;
    }
}