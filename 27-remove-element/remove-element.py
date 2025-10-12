class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        count=0
        for n in nums:
            if n!=val:
                nums[count]=n
                count+=1
        return count

        