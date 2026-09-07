## [Extract Integers from String](https://www.geeksforgeeks.org/problems/extract-the-integers4428/1)

**Difficulty:** Basic  
**Topics:** two-pointer-algorithm, Strings  

**Problem Description:**

<p><span style="font-size: 18px;">Given a string<strong> s</strong> consisting of lowercase letters, uppercase letters, digits, and special characters, extract all the integers present in the string and return them in the order they appear.</span></p>
<p><span style="font-size: 18px;">If no integers are present in the string, return an empty array.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s = "1: Geeks for geeks, 2: geeksfor geeks, 3: forGeeksgeeks 56"
<strong>Output: </strong>[1, 2, 3, 56]
<strong>Explanation: </strong>1, 2, 3, 56 are the integers present in s.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s = "geeksforgeeks"
<strong>Output: </strong>[]
<strong>Explanation: </strong>No integers present in the string.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n ≤ 10<sup>5</sup>, n is size of the string.</span></p>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(n)
