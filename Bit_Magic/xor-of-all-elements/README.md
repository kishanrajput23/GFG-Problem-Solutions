## [XOR of All Elements Except Self](https://www.geeksforgeeks.org/problems/xor-of-all-elements0736/1)

**Difficulty:** Basic  
**Topics:** Bit Magic  

**Problem Description:**

<p><span style="font-size: 18px;">Given an array <strong>arr[]</strong>, construct another array <strong>res[]</strong>&nbsp;such that res[i] is equal to the <strong>XOR</strong> of all elements of arr[] except arr[i]. </span><span style="font-size: 18px;">Return the resulting array.</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [2, 1, 5, 9]<strong>
Output: </strong>[13, 14, 10, 6]<strong>
Explanation: <br></strong>res[0] = 1 ^ 5 ^ 9 = 13<br>res[1] = 2 ^ 5 ^ 9 = 14<br>res[2] = 2 ^ 1 ^ 9 = 10<br>res[3] = 2 ^ 1 ^ 5 = 6
Therefore, the resulting array is [13, 14, 10, 6].</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [2, 1]<strong>
Output: </strong>[1, 2]<strong>
Explanation: <br></strong>res[0] = 1<br>res[1] = 2
Since only one element remains after excluding the current element, each position contains that remaining element. Therefore, the resulting array is [1, 2].</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ arr.size() ≤ 10<sup>5</sup><br>0 ≤ arr[i] ≤ 10<sup>9</sup></span></p>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(1)
