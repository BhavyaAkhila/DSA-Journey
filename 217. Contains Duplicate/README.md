# 217. Contains Duplicate

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



 ## Input: nums = [1,2,3,1]

## Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.


## Input
nums = [1,2,3,4]

## Output
false


## Input
nums = [1,1,1,3,3,4,3,2,4,2]

## Output
true
## code explanation
we can solve contains duplicate by using two pointers approach
first sort the array // Arrays.sort(nums)
two pointers are left and right
 left starts at index 0 // int left=0;
right starts at index 1 // int right=1;
while right is less than nums.length // while(right<nums.length){
if left equals to right(duplicate value is found) then return true // if(nums[left] == nums[right]){ 
// return true;
or else increment left and false // left++; 
// right++;
if entire array is checked nd no duplicate element is found then return false // return false;
