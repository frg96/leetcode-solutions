class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        hashmap : dict[int, int] = {}
        for i, num in enumerate(nums):
            operand = target - num
            if operand in hashmap:
                return [hashmap[operand], i]
            hashmap[num] = i

        return None

