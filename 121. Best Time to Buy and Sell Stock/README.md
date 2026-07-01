You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

#code explanation
we can use kadane algorithm for implementing
Initialize buy with the first day's price since it is the only buying option initially.
Initialize profit as 0 because if no profit is possible, the answer should be 0.
Traverse the array from the second day onward:
If the current price is lower than buy, update buy because we've found a better buying price.
Otherwise, calculate the profit by selling today (prices[i] - buy).
If this profit is greater than the current maximum profit, update profit.
After traversing all prices, return profit.
