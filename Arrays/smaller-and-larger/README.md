## [Smaller and Larger in Sorted](https://www.geeksforgeeks.org/problems/smaller-and-larger4005/1)

**Difficulty:** Basic  
**Topics:** Arrays  

**Problem Description:**

<p><span style="font-size: 18px;"><span style="font-size: 18px;">Given a sorted array <strong>arr[]</strong> and a value <strong>target</strong>, return an array of size 2. The first value is the number of elements less than or equal to the target, and the second value is the number of elements greater than or equal to the target.</span><br></span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> arr[] = [1, 2, 8, 10, 11, 12, 19], <span style="font-size: 14pt;"><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif; font-size: 18px; white-space: normal;">target</span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"> = 0</span></span>
<strong>Output: </strong>[0, 7]
<strong>Explanation:</strong> There are no elements less or equal to 0 and 7 elements greater to 0.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [1, 5, 8, 12, 12, 12, 19], target<span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"> </span>= 12<br><strong>Output:</strong> [6, 4]
<strong>Explanation:</strong> There are 6 elements less or equal to 12 and 4 elements greater or equal to 12.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ arr.size ≤ 10<sup>5</sup><br>0 ≤ arr[i],&nbsp;</span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif; font-size: 18px; white-space: normal;">target </span><span style="font-size: 18px;">≤ 10</span><sup>6</sup></p>

**Expected Complexities:**

Time Complexity: O(log n)  
Auxiliary Space: O(1)
