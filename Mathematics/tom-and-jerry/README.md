## [Tom and Jerry](https://www.geeksforgeeks.org/problems/tom-and-jerry1325/1)

**Difficulty:** Easy  
**Topics:** Mathematics  

**Problem Description:**

<p><span style="font-size: 18px;">Given an integer <strong>n</strong>, Tom and Jerry play a game. On each turn, a player chooses a divisor of the current value of n that is less than n and subtracts it from n.</span></p><p><span style="font-size: 18px;"> The resulting value becomes the n for the next turn. </span><span style="font-size: 18px;">A player who has no valid divisor to subtract loses the game. </span><span style="font-size: 18px;">Tom makes the first move, and both players play optimally.&nbsp;</span></p><p><span style="font-size: 18px;"> </span><span style="font-size: 18px;">Return true if Tom wins; otherwise, return false.</span></p><p><span style="font-size: 18px;"><strong>Note:</strong> When n = 1, there is no divisor less than n, so the player whose turn it is, loses.</span></p><p><strong><span style="font-size: 18px;">Examples:</span></strong></p><pre><span style="font-size: 18px;"><strong>Input: </strong>n = 2<strong>
Output: </strong>true<strong>
Explanation: </strong>Tom subtracts 1 from 2, making n = 1. Jerry has no valid move, so Tom wins.</span></pre><pre><span style="font-size: 18px;"><strong>Input: </strong>n = 3<strong>
Output: </strong>false<strong>
Explanation: </strong></span><span style="font-size: 18px;">Tom can only subtract 1 from 3, making n = 2. Jerry then subtracts 1 from 2, making n = 1. Tom has no valid move, so Tom loses.</span></pre>

**Expected Complexities:**

Time Complexity: O(1)  
Auxiliary Space: O(1)
