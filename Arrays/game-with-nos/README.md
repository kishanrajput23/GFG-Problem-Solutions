## [Adjacent XOR Transformation](https://www.geeksforgeeks.org/problems/game-with-nos3123/1)

**Difficulty:** Basic  
**Topics:** Arrays, Bit Magic  

**Problem Description:**

<p><span style="font-size: 18px;">Given an array <strong>arr[] </strong>of size&nbsp;<strong>n,</strong> </span><span style="font-size: 18px;">&nbsp;transform it according to the following rule:</span></p>
<ul>
<li><span style="font-size: 18px;">For every index i from 0 to n - 2, replace arr[i] with arr[i] <strong>XOR</strong> arr[i + 1].</span></li>
<li><span style="font-size: 18px;">The last element has no next element, so it remains unchanged.</span></li>
</ul>
<p><span style="font-size: 18px;">Return the resulting array after performing the transformation.</span></p>
<p><strong style="font-size: 18px;">Examples:</strong></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [10, 11, 1, 2, 3]
<strong>Output :</strong> [1, 10, 3, 1, 3]
<strong>Explanation:</strong>
At index 0, arr[0] xor arr[1] = 1.
At index 1, arr[1] xor arr[2] = 10.
At index 2, arr[2] xor arr[3] = 3.
At index 2, arr[3] xor arr[4] = 1.<br>At index 4, No element is left so, it will remain as
it is.
New Array will be [1, 10, 3, 1, 3].</span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> arr[] = [5, 9, 7, 6]
<strong>Output:</strong> [12, 14, 1, 6]
<strong>Explanation:</strong>
At index 0, arr[0] xor arr[1] = 12.
At index 1, arr[1] xor arr[2] = 14.
At index 2, arr[2] xor arr[3] = 1.
At index 3, No element is left So, it will remain as it is.
New Array will be [12, 14, 1, 6].</span></pre>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(1)
