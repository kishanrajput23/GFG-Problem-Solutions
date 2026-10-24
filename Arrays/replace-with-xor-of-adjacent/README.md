## [Replace with XOR of Adjacent](https://www.geeksforgeeks.org/problems/replace-with-xor-of-adjacent/1)

**Difficulty:** Easy  
**Topics:** Arrays, Bit Magic  

**Problem Description:**

<p><span style="font-size: 18px;">Given an array <strong>arr[]</strong> of n integers,&nbsp;</span><span style="font-size: 18px;">modify the array in-place such that each element is replaced with the <strong>XOR</strong> of its adjacent elements.</span></p>
<ul>
<li><span style="font-size: 18px;">For the first element, update arr[0] = arr[0] <strong>^</strong> arr[1].</span></li>
<li><span style="font-size: 18px;">For the last element, update arr[n-1] = arr[n-2] <strong>^</strong> arr[n-1].</span></li>
<li><span style="font-size: 18px;">For all other elements, update arr[i] = arr[i-1] <strong>^</strong> arr[i+1].</span></li>
</ul>
<p><span style="font-size: 18px;"><strong>Note:</strong>&nbsp;</span><span style="font-size: 18px;">Here, a <strong>^</strong> b represents the <strong>XOR</strong> operation between a and b.</span><span style="font-size: 18px;"><strong>&nbsp;</strong></span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input : </strong><span style="font-size: 18px;">arr[] = [2, 1, 4, 7]
</span><strong style="font-size: 18px;">Output : </strong><span style="font-size: 14pt;">[3, 6, 6, 3]</span>
<strong style="font-size: 18px;">Explanation:</strong><span style="font-size: 18px;">
At index 0, arr[0] </span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif; font-size: 18px; white-space: normal;">^</span><span style="font-size: 18px;"> arr[1] = 2 ^ 1 = 3
At index 1, arr[0] </span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif; font-size: 18px; white-space: normal;">^</span><span style="font-size: 18px;"> arr[2] = 2 ^ 4 = 6
At index 2, arr[1] </span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif; font-size: 18px; white-space: normal;">^</span><span style="font-size: 14pt;"> arr[3] = 1 ^ 7 = 6</span><span style="font-size: 18px;"><br>At index 3, arr[2] ^ arr[3] = 4 ^ 7 = 3
Thus, the updated array becomes [3, 6, 6, 3].</span>
</span></pre>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input :</strong><span style="font-size: 18px;"> arr[] = [5, 9, 2, 6, 7]
<strong>Output: </strong>[12, 7, 15, 5, 1]
<strong>Explanation:<br></strong>At index 0, arr[0] ^ arr[1] = 5 ^ 9 = 12
At index 1, arr[0] ^ arr[2] = 5 ^ 2 = 7
At index 2, arr[1] ^ arr[3] = 9 ^ 6 = 15
At index 3, arr[2] ^ arr[4] = 2 ^ 7 = 5
At index 4, arr[3] ^ arr[4] = 6 ^ 7 = 1
Thus, the updated array becomes [12, 7, 15, 5, 1]. </span></span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:<br></strong></span><span style="font-size: 18px;">2 ≤ n ≤ 10<sup>5</sup><br>1 ≤ arr[i] ≤ 10<sup>7</sup></span></p>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(1)
