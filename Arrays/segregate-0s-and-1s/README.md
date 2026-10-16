## [Segregate 0s and 1s](https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1)

**Difficulty:** Easy  
**Topics:** Arrays  

**Problem Description:**

<p><span style="font-size: 18px;">Given an array <strong>arr[]</strong> consisting of only <strong>0</strong>'s and <strong>1</strong>'s. Modify the array <strong>in-place</strong> to segregate 0s onto the left side and 1s onto the right side of the array. </span></p><p><span style="font-size: 18px;"><strong>Examples :</strong></span></p><pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
<strong>Output:</strong> [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]<br><strong style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Explanation:</strong><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">  </span>After segregation, all the 0's are on the left and 1's are on the right. Modified array will be [0, 0, 0, 0, 0, 1, 1, 1, 1, 1].</span></pre><pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [1, 1]
<strong>Output:</strong> [1, 1]
<strong>Explanation:</strong> There are no 0s in the given array, so the modified array is [1, 1]</span></pre>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(1)
