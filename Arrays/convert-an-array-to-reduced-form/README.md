## [Replace Elements by Ranks](https://www.geeksforgeeks.org/problems/convert-an-array-to-reduced-form1101/1)

**Difficulty:** Easy  
**Topics:** Arrays, Sorting  

**Problem Description:**

<p><span style="font-size: 18px;">Given an array<strong> arr[]</strong> of <strong>n</strong> integers, convert it into its <strong>reduced form</strong>. In the reduced form, each element is replaced by its rank.&nbsp;</span><span style="font-size: 18px;">The smallest should be replaced with <strong>0</strong>, the second smallest with <strong>1</strong>, and the largest is replaced with <strong>n - 1</strong>.</span></p>
<ul>
<li><span style="font-size: 18px;">The <strong>relative positions</strong> of the elements in the array must remain unchanged.</span></li>
<li><span style="font-size: 18px;">For repeating elements, the element appearing earlier in the original array must be of smaller rank than the one appearing later.</span></li>
<li><span style="font-size: 18px;">You need to modify the array in-place and do not return anything.</span></li>
</ul>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [10, 40, 20]
<strong>Output:</strong> [0, 2, 1]
<strong>Explanation:</strong> The elements in sorted order are 10, 20, 40 and assigned ranks 0, 1, and 2 respectively.
</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [0, 2, 1]
<strong>Output:</strong> [0, 2, 1]
<strong>Explanation:</strong> The array is already in reduced form..</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [1, 5, 3, 4, 3]<strong>
Output: </strong>[0, 4, 1, 3, 2]<strong>
Explanation: </strong>1 gets rank 0<strong>. </strong>The first 3 gets rank 1, the second 3 as rank 2, 4 as rank 3 and 5 as rank 4.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n ≤ 10<sup>5</sup><br>1 ≤ arr[i] ≤ 10<sup>6</sup></span></p>

**Expected Complexities:**

Time Complexity: O(n*logn)  
Auxiliary Space: O(n)
