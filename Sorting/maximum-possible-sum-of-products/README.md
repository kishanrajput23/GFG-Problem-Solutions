## [Max Sum of Products from Two Arrays](https://www.geeksforgeeks.org/problems/maximum-possible-sum-of-products3637/1)

**Difficulty:** Easy  
**Topics:** Mathematics, Sorting  

**Problem Description:**

<p><span style="font-size: 14pt;">Given two arrays<strong> a[]</strong> and <strong>b[]</strong> of size <strong>n</strong> containing positive integers. Rearrange the elements of both arrays so that the value of: a[0] * b[0] + a[1] * b[1] + ... + a[n-1] * b[n-1] becomes maximum. Each element of a[] and b[] must be used exactly once. </span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input</strong>: a[] = [1, 2, 3], b[] = [4, 5, 1]
<strong>Output</strong>: 24
<strong>Explanation</strong>: After rearranging: a[] = [1, 2, 3] and b[] = [1, 4, 5]. Maximum sum = (1 * 1) + (2 * 4) + (3 * 5) = 1 + 8 + 15 = 24.
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input</strong>: a[] = [3, 1, 1], b[] = [6, 5, 4]
<strong>Output</strong>: 27
<strong>Explanation</strong>: After rearranging: a[] = [1, 1, 3] and b[] = [4, 5, 6]. Maximum sum = (1 * 4) + (1 * 5) + (3 * 6) = 4 + 5 + 18 = 27.
</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong></span></p>
<p><span style="font-size: 18px;">1 ≤ n ≤ 10<sup>3</sup><br></span><span style="font-size: 18px;">1 ≤ a<sub>i</sub> , b<sub>i</sub> ≤ 10<sup>3</sup></span></p>

**Expected Complexities:**

Time Complexity: O(n log n)  
Auxiliary Space: O(1)
