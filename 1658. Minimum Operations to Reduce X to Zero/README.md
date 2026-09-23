# 1658. Minimum Operations to Reduce X to Zero
You are given an integer array nums and an integer x. In one operation, you can either remove the leftmost or the rightmost element from the array nums and subtract its value from x. Note that this modifies the array for future operations.

Return the minimum number of operations to reduce x to exactly 0 if it is possible, otherwise, return -1.

 



## Input
nums = [1,1,4,2,3], x = 5
## Output
2
Explanation: The optimal solution is to remove the last two elements to reduce x to zero.


## Input
nums = [5,6,7,8,9], x = 4
## Output
-1
