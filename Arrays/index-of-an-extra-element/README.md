## [Extra in One of the Two Arrays](https://www.geeksforgeeks.org/problems/index-of-an-extra-element/1)

**Difficulty:** Easy  
**Topics:** Arrays, Searching  

**Problem Description:**

<p><span style="font-size: 20px;">You have given two sorted arrays <strong>a[]</strong> &amp; <strong>b[]</strong> of distinct elements. The first array has one element extra added in between. Return the index of the extra element.</span></p><p><span style="font-size: 20px;"><strong>Note</strong>: 0-based indexing is followed.</span></p><p><span style="font-size: 20px;"><strong>Examples</strong></span></p><pre><span style="font-size: 20px;"><strong>Input: </strong>a[] = [2,4,6,8,9,10,12], b[] = [2,4,6,8,10,12]
<strong>Output: </strong>4<strong>
Explanation: </strong></span><span style="font-size: 18px;">In the first array, 9 is extra added and it's index is 4.</span></pre><pre><span style="font-size: 20px;"><strong>Input: </strong>a[] = [3,5,7,8,11,13], b[] = [3,5,7,11,13]
<strong>Output: </strong>3<br></span><span style="font-size: 14pt;"><strong>Explanation: </strong><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">In the first array, 8 is extra and it's index is 3.</span></span></pre><pre><span style="font-size: 20px;"><strong>Input: </strong>a[] = [3,5], b[] = [3]
<strong>Output: </strong>1<br></span><span style="font-size: 14pt;"><strong>Explanation: </strong><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">In the first array, 5 is extra and it's index is 1.</span></span></pre>

**Expected Complexities:**

Time Complexity: O(log n)  
Auxiliary Space: O(1)
