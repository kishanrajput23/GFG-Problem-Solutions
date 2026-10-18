## [Non-Repeating Element](https://www.geeksforgeeks.org/problems/non-repeating-element3958/1)

**Difficulty:** Easy  
**Topics:** Arrays, Hash  

**Problem Description:**

<p><span style="font-size: 20px;">Find the first non-repeating element in a given array<strong> arr</strong> of integers and if there is not present any non-repeating element then return <strong>0</strong></span></p>
<p><span style="font-size: 20px;"><strong>Note:</strong> The array consists of only positive and negative integers and <strong>not zero</strong>.</span></p>
<p><span style="font-size: 20px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 20px;"><strong>Input: </strong>arr[] = [-1, 2, -1, 3, 2]
<strong>Output: </strong>3
<strong>Explanation: </strong>-1 and 2 are repeating whereas 3 is the only number occuring once. Hence, the output is 3. </span></pre>
<pre><span style="font-size: 20px;"><strong>Input:</strong> arr[] = [1, 1, 1]
<strong>Output:</strong> 0<br><strong style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Explanation: </strong><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">T</span></span><span style="font-size: 20px;">here is not present any non-repeating element so answer should be 0.</span></pre>
<p><span style="font-size: 20px;"><strong>Constraints:</strong><br>1 &lt;= arr.size &lt;= 10<sup>6</sup><br>-10<sup>9</sup> &lt;= arr[i]<sup>&nbsp;</sup>&lt;= 10<sup>9</sup><br>arr[i] != 0&nbsp;</span></p>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(n)
