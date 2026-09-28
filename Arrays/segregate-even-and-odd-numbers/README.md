## [Segregate Even and Odd numbers](https://www.geeksforgeeks.org/problems/segregate-even-and-odd-numbers4629/1)

**Difficulty:** Basic  
**Topics:** Arrays  

**Problem Description:**

<p><span style="font-size: 18px;">Given an array <strong>a</strong><strong>rr</strong>, write a program segregating even<strong> </strong>and odd<strong> </strong>numbers. The program should put all even numbers first in sorted order, and then odd numbers in sorted order.</span></p>
<p><span style="font-size: 18px;"><strong>Note</strong>:- You don't need to return the array, you need to modify it in-place.</span></p>
<p><span style="font-size: 18px;"><strong>Example:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [12, 34, 45, 9, 8, 90, 3]
<strong>Output:</strong> [8, 12, 34, 90, 3, 9, 45]
<strong>Explanation:</strong> Even numbers are 12, 34, 8 and 90. Rest are odd numbers.
</span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> arr[] = [0, 1, 2, 3, 4]
<strong>Output:</strong> [0, 2, 4, 1, 3]
<strong>Explanation:</strong> 0 2 4 are even and 1 3 are odd numbers.<br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> arr[] = [10, 22, 4, 6]
<strong>Output:</strong> [4, 6, 10, 22]
<strong>Explanation:</strong> Here all elements are even, so no need of segregataion</span></pre>

**Expected Complexities:**

Time Complexity: O(n log n)  
Auxiliary Space: O(1)
