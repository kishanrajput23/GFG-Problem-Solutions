## [0 - 1 Knapsack Problem](https://www.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1?page=1&category=Dynamic%20Programming,Graph&difficulty=Medium&status=solved)

**Difficulty:** Medium  
**Topics:** Dynamic Programming  

**Problem Description:**

<p data-start="172" data-end="388"><span style="font-size: 14pt;">Given two arrays,&nbsp;<strong>val[]</strong> and <strong>wt[]</strong>, where each element represents the value and weight of an item respectively, and an integer&nbsp;<strong>W</strong> representing the maximum capacity of the knapsack (the total weight it can hold).</span></p>
<p data-start="390" data-end="520"><span style="font-size: 14pt;">Put the items into the knapsack such that the total value obtained is maximum without exceeding the capacity W.</span></p>
<p data-start="522" data-end="680"><span style="font-size: 14pt;"><strong data-start="522" data-end="531">Note: </strong>You can either include an item completely or exclude it entirely — fractional selection of items is not allowed. Each item is available only once.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>W = 4, val[] = [1, 2, 3], wt[] = [4, 5, 1]<br><strong>Output: </strong>3<br><strong>Explanation: </strong>Choose the last item, which weighs 1 unit and has a value of 3.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> W = 3, val[] = [1, 2, 3], wt[] = [4, 5, 6] <br><strong>Output: </strong>0<br><strong>Explanation: </strong>Every item has a weight exceeding the knapsack's capacity (3).</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> W = 5, val[] = [10, 40, 30, 50], wt[] = [5, 4, 2, 3] <br><strong>Output: </strong>80<br><strong>Explanation: </strong>Choose the third item (value 30, weight 2) and the last item (value 50, weight 3) for a total value of 80.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong></span><br><span style="font-size: 14pt;">1 ≤ val.size() = wt.size() ≤ 10<sup>3</sup></span><br><span style="font-size: 14pt;">1 ≤ W ≤ 10<sup>3</sup></span><br><span style="font-size: 14pt;">1 ≤ val[i] ≤ 10<sup>3</sup></span><br><span style="font-size: 14pt;">1 ≤ wt[i] ≤ 10<sup>3</sup></span></p>
