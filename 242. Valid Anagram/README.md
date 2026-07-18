# 242. Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 


## Input
s = "anagram", t = "nagaram"

## Output
true



## Input
s = "rat", t = "car"

## Output
false

## code explanation
Strings in Java cannot be sorted directly, so we first convert them into character arrays.
Arrays.sort() will sort the string in alphabetical order.
then check if string length and characters are same btw s and t. return Arrays.equals(a,b)-> if equals then returns true or else false.
