## [Segregate Different Types of Characters](https://www.geeksforgeeks.org/problems/split-strings5211/1)

**Difficulty:** Basic  
**Topics:** Strings  

**Problem Description:**

<p><span style="font-size: 14pt;">Given a string <strong>s</strong> containing letters, digits, and special characters,<strong> </strong>return an array of three strings [s1, s2, s3]<strong> </strong>such that: <strong>s1</strong> contains all the letters, <strong>s2</strong> contains all the digits, and <strong>s3</strong> contains all the special characters. </span></p>
<ul>
<li><span style="font-size: 14pt;">The relative order of the characters in each string must be exactly as they appear in s.</span></li>
<li><span style="font-size: 14pt;">If any type of character is not present, then return "-1" in the corresponding string.</span></li>
</ul>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s = "geeks01for02geeks03!!!"
<strong>Output: </strong>["geeksforgeeks" , "010203" , "!!!"]
<strong>Explanation:</strong> s1 contains all the letters ("geeksforgeeks"), s2 contains all the digits ("010203"), and s3 contains the remaining special characters ("!!!") </span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s = "**Docoding123456789everyday##"
<strong>Output: </strong>["Docodingeveryday" , "123456789" , "**##"]<br><strong>Explanation: </strong>s1 contains all the letters ("Docodingeveryday"), s2 contains all the digits ("123456789"), and s3 contains all the special characters ("**##") </span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s = "ab##c"
<strong>Output: </strong>["abc" , "-1" , "##"]</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ s.size() ≤ 10<sup>5</sup></span></p>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(n)
