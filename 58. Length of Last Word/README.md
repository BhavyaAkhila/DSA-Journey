# 58. Length of Last Word
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

 



## Input
s = "Hello World"
## Output
5
Explanation: The last word is "World" with length 5.


## Input
s = "   fly me   to   the moon  "
## Output
4
Explanation: The last word is "moon" with length 4.


Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
# code explanation
to find the length of last word of the string,first we have to trim the spaces.next run a reverse for loop nd check for space.if space is not found then increment the count or else break at the end return count
