## [Elements in the Range](https://www.geeksforgeeks.org/problems/elements-in-the-range2834/1)

**Difficulty:** Basic  
**Topics:** Arrays, Searching  

**Problem Description:**

<p><span style="font-size: 18px;">Given an array <strong>arr[]</strong> containing <strong>distinct</strong> positive integers, and two integers <strong>start</strong> and <strong>end</strong> defining a range. Determine if the array contains all elements within inclusive range <strong>[start, end]</strong>.<br></span></p>
<p><span style="font-size: 18px;"><strong>Note:</strong>&nbsp;If the array contains all elements in the given range return <strong>true </strong>otherwise return <strong>false.</strong></span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>start = 2, end = 5, arr[] =  [1, 4, 5, 2, 7, 8, 3]
<strong>Output:</strong> true
<strong>Explanation</strong>: All integers within the range [2, 5] are 2, 3, 4, and 5, and all of them are present in the array. Therefore, the answer is true for this test case.<br></span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>start = 2, end = 6, arr[] = [1, 4, 5, 2, 7, 8, 3]
<strong>Output: </strong>false
<strong>Explanation</strong>: The array does not contain 6; hence, it does not contain all the elements in the range [2, 6]. Therefore, the output is false.
</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ arr.size() ≤ 10<sup>5<br></sup>0 ≤ arr[i] ≤ 10<sup>5</sup><sup><br></sup></span><span style="font-size: 18px;">0 ≤ start ≤ end ≤ 10<sup>5</sup><br></span></p>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(1)
