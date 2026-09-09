## [Smallest Repeating K Times](https://www.geeksforgeeks.org/problems/smallest-number-repeating-k-times3239/1)

**Difficulty:** Basic  
**Topics:** Arrays, Hash  

**Problem Description:**

<p><span style="font-size: 18px;">Given an array <strong>arr</strong>, the goal is to find out the smallest number that is repeated exactly ‘<strong>k</strong>’ times.</span></p>
<p><span style="font-size: 18px;"><strong>Note:</strong>&nbsp;If there is no such element then return&nbsp;<strong>-1</strong>.</span></p>
<p><span style="font-size: 18px;"><strong>Example:</strong></span></p>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input: </strong><span style="font-size: 18px;">arr[] = [2, 2, 1, 3, 1], k = 2
</span><strong style="font-size: 18px;">Output:</strong><span style="font-size: 18px;"> 1
</span><strong style="font-size: 18px;">Explanation</strong><span style="font-size: 18px;">: 2 and 1 both appear exactly 2 times. Since we need to find the smallest, output is 1.</span></span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [3, 5, 3, 2], k = 1
<strong>Output:</strong>  2 
<strong>Explanation:</strong> 5 and 2 each appear exactly 1 time. Since we need the smallest, the output is 2.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ arr.size() ≤ 10<sup>6</sup><br>1 ≤ arr[i] ≤ 10<sup>4</sup></span></p>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(n)
