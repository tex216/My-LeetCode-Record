class Solution:
    def mySqrt(self, x):
        if x < 2:
            return x
        
        left, right = 2, x // 2
        
        while left <= right:
            pivot = (right + left) // 2
            num = pivot * pivot
            if num > x:
                right = pivot -1
            elif num < x:
                left = pivot + 1
            else:
                return pivot
            
        return right