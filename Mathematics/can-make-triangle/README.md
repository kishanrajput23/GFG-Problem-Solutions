## [Adjacent 3 and Triangle](https://www.geeksforgeeks.org/problems/can-make-triangle--170637/1)

**Difficulty:** Easy  
**Topics:** Mathematics, Geometric  

**Problem Description:**

<p><span style="font-size: 14pt;">Given an integer array <strong data-start="178" data-end="187">arr[]</strong> of integers, consider every group of three consecutive (adjacent) elements in the array. For each triplet (arr[i], arr[i + 1], arr[i + 2]), determine whether these three values can represent the sides of a valid triangle. </span></p>
<p><span style="font-size: 14pt;">Return an array of length <strong>n - 2</strong> where the ith element is <strong>1 </strong>if arr[i], arr[i+1], and arr[i+2] can form a triangle, otherwise <strong>0</strong>.</span></p>
<p class="PDq2pG_selectionAnchorContainer" data-start="607" data-end="740"><span style="font-size: 14pt;"><strong data-start="607" data-end="616">Note:</strong> Three sides <strong data-start="629" data-end="634">a</strong>, <strong data-start="636" data-end="641">b</strong>, and <strong data-start="647" data-end="652">c</strong> can form a valid triangle if and only if all of the following conditions are satisfied:</span></p>
<p><span style="font-size: 14pt;"> </span></p>
<ul data-start="742" data-end="789">
<li data-section-id="6t35r1" data-start="742" data-end="757"><span style="font-size: 14pt;"> a + b &gt; c </span></li>
<li data-section-id="1lqiva5" data-start="758" data-end="773"><span style="font-size: 14pt;"> a + c &gt; b </span></li>
<li data-section-id="13c02jh" data-start="774" data-end="789"><span style="font-size: 14pt;"> b + c &gt; a</span></li>
</ul>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> arr[] = [1, 2, 2, 4]
<strong>Output:</strong> [1, 0]
<strong>Explanation:</strong> The consecutive triplets are [1, 2, 2] and [2, 2, 4]. The first triplet satisfies all the triangle inequalities, so it forms a valid triangle. The second triplet does not, because 2 + 2 = 4 is not greater than 4. Therefore, the output is [1, 0].
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> arr[] = [2, 10, 2, 10, 2]  <br><strong>Output:</strong> [0, 1, 0]<br><strong>Explanation: </strong>The array contains three consecutive triplets: [2, 10, 2], [10, 2, 10], and [2, 10, 2]. The first and third triplets cannot form a triangle because 2 + 2 &lt; 10. The middle triplet satisfies all the triangle inequalities and forms a valid triangle. Hence, the output is [0, 1, 0].</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>3 ≤ n ≤ 10<sup>5&nbsp;</sup><br>1 ≤ arr[i] ≤ 10<sup>9</sup></span></p>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(n)
