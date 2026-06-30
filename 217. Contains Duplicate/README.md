Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true
#code explanation
we can solve contains duplicate by using two pointers approach
two pointers are left and right
 left starts at index 0
right starts at index 1
while right is less than nums.length
if left equals to right(duplicate value is found) then return true
or else increment left and false 
if entire array is checked nd no duplicate element is found then return false
