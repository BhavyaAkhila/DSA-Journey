Given an integer array nums, find the subarray with the largest sum, and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

 #code explanation
 Initialize bestEnding and ans with the first element.
Traverse the array from the second element.
For each element, compute:
Start a new subarray with the current element.
Extend the previous subarray by adding the current element.
Store the larger of the two in bestEnding.
Update ans with the maximum value of bestEnding seen so far.
Return ans.
