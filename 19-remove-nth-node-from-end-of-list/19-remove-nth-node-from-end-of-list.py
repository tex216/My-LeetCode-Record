# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        dummy = ListNode(0, head)
        first = second = dummy
        
        for i in range(1, n+1):
            second = second.next
        
        while second.next:
            first = first.next
            second = second.next
        
        first.next = first.next.next
        
        return dummy.next