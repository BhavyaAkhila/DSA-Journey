Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]

#code explanation or approach.
we use implement two pointers for this problem.
implement left at index 0 of the array nums.
implement right at the end of the array(nums.length).
if right is not equal to 0 then use temp.
swap from right to left by using temp.
increment the left till zeroes are moved to the end.
