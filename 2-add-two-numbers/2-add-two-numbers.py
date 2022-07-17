# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        dummy = ListNode(0)
        currNode = dummy
        carry = 0
        
        while l1 or l2 or carry :
            v1 = l1.val if l1 else 0
            v2 = l2.val if l2 else 0
            sum = v1 + v2 + carry
            carry = sum // 10
            newNode = ListNode(sum % 10)
            currNode.next = newNode
            currNode = newNode
            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None
            
        return dummy.next