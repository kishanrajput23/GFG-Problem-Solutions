## [Maximum Number in a String](https://www.geeksforgeeks.org/problems/extract-maximum2943/1)

**Difficulty:** Basic  
**Topics:** Strings, Mathematics  

**Problem Description:**

<p><span style="font-size: 18px;">Given an alphanumeric string <strong>s</strong> consisting of lowercase letters (a–z), uppercase letters (A–Z), and digits (0–9).</span></p>
<p><span style="font-size: 18px;">Extract all numeric <strong>substrings </strong>from <strong>s</strong> and return the <strong>maximum </strong>numeric value among them.</span></p>
<p><span style="font-size: 18px;">If no numeric substring exists, return -1.</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s = "100klh564abc365bg"
<strong>Output:</strong> 564
<strong>Explanation: </strong>Numeric values in string s are 100, 564 and 365. But 564 is maximum among them. So answer is 564.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s = "abcdefg"
<strong>Output:</strong> -1
<strong>Explanation:</strong> Since there is no numeric value in the string. So answer is -1. </span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ |s| ≤ 10<sup>4</sup><br>-1 ≤ output value ≤ 10<sup>6</sup></span></p>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(1)
