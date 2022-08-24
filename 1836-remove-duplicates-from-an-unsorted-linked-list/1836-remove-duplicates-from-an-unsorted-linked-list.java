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
    public ListNode deleteDuplicatesUnsorted(ListNode head) {
        Map<Integer, Integer> map = new HashMap<>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy, curr = head;
        
        while (curr != null) {
            map.put(curr.val, map.getOrDefault(curr.val, 0)+1);
            curr = curr.next;
        }
        
        while (head != null) {
            if (map.get(head.val) == 1) {
                prev.next = head;
                prev = prev.next;
            }
            head = head.next;
        }
        
        prev.next = null;
        return dummy.next;
    }
}