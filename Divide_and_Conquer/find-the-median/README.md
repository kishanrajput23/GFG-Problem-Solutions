## [Median of an Array](https://www.geeksforgeeks.org/problems/find-the-median0527/1?page=2&difficulty=Basic&status=solved&sortBy=submissions)

**Difficulty:** Basic  
**Topics:** Mathematical, Divide and Conquer, Algorithms  

**Problem Description:**

<p><span style="font-size: 14pt;">Given an array <strong>arr[]</strong> of integers, calculate the median.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [90, 100, 78, 89, 67]
<strong>Output: </strong>89
<strong>Explanation: </strong>After sorting the array middle element is the median 
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [56, 67, 30, 79]
<strong>Output: </strong>61.5
<strong>Explanation: </strong>In case of even number of elements, average of two middle elements is the median.</span><span style="font-size: 14pt;"> <br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:&nbsp;</strong>arr[] = [1, 2]<br><strong>Output:</strong> 1.5<br><strong>Explanation:</strong> The average of both elements will result in 1.5.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 &lt;= arr.size() &lt;= 10<sup>5</sup><br>1 &lt;= arr[i] &lt;= 10<sup>5</sup></span></p>

**Expected Complexities:**

Time Complexity: O(n log n)  
Auxiliary Space: O(1)
