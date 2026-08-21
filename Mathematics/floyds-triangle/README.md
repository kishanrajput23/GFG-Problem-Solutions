## [Floyd's triangle](https://www.geeksforgeeks.org/problems/floyds-triangle1222/1)

**Difficulty:** Basic  
**Topics:** Mathematics  

**Problem Description:**

<p><span style="font-size: 18px;">Given a number <strong>n</strong>, print Floyd's triangle with n lines.</span></p>
<p><span style="font-size: 18px;"><span style="font-size: 18px;">Floyd’s Triangle is a pattern of consecutive natural numbers arranged in rows, where the i-th row contains i numbers.</span></span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><strong><span style="font-size: 18px;">Input: </span></strong><span style="font-size: 18px;">n = 4</span>
<strong><span style="font-size: 18px;">Output:
</span></strong><span style="font-size: 18px;">1
2 3
4 5 6
7 8 9 10</span>
<strong><span style="font-size: 18px;">Explanation: </span></strong><span style="font-size: 18px;">The triangle has 4 rows. Numbers start from 1 and increase sequentially across rows, and each row i contains i elements.</span></pre>
<pre><strong><span style="font-size: 18px;">Input: </span></strong><span style="font-size: 18px;">n = 5</span> <br><strong><span style="font-size: 18px;">Output:
</span></strong><span style="font-size: 18px;">1
2 3
4 5 6
7 8 9 10
11 12 13 14 15</span>
<strong><span style="font-size: 18px;">Explanation: </span></strong><span style="font-size: 18px;">The triangle has 4 rows, and each row i contains i numbers.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= n &lt;= 100</span></p>

**Expected Complexities:**

Time Complexity: O(n^2)  
Auxiliary Space: O(1)
