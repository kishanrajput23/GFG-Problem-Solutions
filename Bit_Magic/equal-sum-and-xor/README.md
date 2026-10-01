## [Equal Sum and XOR](https://www.geeksforgeeks.org/problems/equal-sum-and-xor/1)

**Difficulty:** Basic  
**Topics:** Bit Magic  

**Problem Description:**

<p><span style="font-size: 20px;">Given a positive integer <strong>n</strong>, count the number of integers <strong>i</strong> such that: </span><span style="font-size: 20px;"><strong>0 ≤ i ≤ n</strong> </span><span style="font-size: 20px;">and </span><span style="font-size: 20px;"><strong>n + i = n ^ i</strong>, </span><span style="font-size: 20px;">where <strong>^</strong> denotes the bitwise<strong> XOR</strong> operation.</span></p>
<p><span style="font-size: 20px;">Return the count of all such values of <strong>i</strong>.</span></p>
<p><strong><span style="font-size: 20px;">Examples:</span></strong></p>
<pre><span style="font-size: 20px;"><strong>Input:</strong> n = 7</span><br><span style="font-size: 20px;"><strong>Output:</strong> 1</span><br><span style="font-size: 20px;"><strong>Explanation:</strong> </span><span style="font-size: 20px;">The condition holds only for i = 0.</span><br><span style="font-size: 20px;">7 + 0 = </span><span style="font-size: 20px;">7 ^ 0 = 7</span><br><span style="font-size: 20px;">Therefore, the answer is 1.</span></pre>
<pre><span style="font-size: 20px;"><strong>Input:</strong> n = 12</span><br><span style="font-size: 20px;"><strong>Output:</strong> 4</span><br><span style="font-size: 20px;"><strong>Explanation:</strong> </span><span style="font-size: 20px;">The condition holds for: </span><span style="font-size: 20px;">i = 0, 1, 2, 3</span><br><span style="font-size: 20px;">12 + 0 = 12 ^ 0 = 12</span><br><span style="font-size: 20px;">12 + 1 = 12 ^ 1 = 13</span><br><span style="font-size: 20px;">12 + 2 = 12 ^ 2 = 14</span><br><span style="font-size: 20px;">12 + 3 = 12 ^ 3 = 15</span><br><span style="font-size: 20px;">Therefore, the answer is 4.</span></pre>
<p><span style="font-size: 20px;"><strong>Constraints:</strong><br>1 ≤ n ≤ 10<sup>3</sup><br></span></p>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(1)
