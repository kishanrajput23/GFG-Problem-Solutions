## [First Occurence](https://www.geeksforgeeks.org/problems/implement-strstr/1?page=1&difficulty=Basic&status=solved&sortBy=submissions)

**Difficulty:** Basic  
**Topics:** Strings, Pattern Searching, Design-Pattern, implementation  

**Problem Description:**

<p><span style="font-size: 18px;">Given two strings <strong>txt</strong> and <strong>pat</strong>, return the 0-based index of the first occurrence of the substring <strong>pat</strong> in <strong>txt</strong>. If pat is not found, return -1.<br></span><strong><span style="font-size: 18px;">Note:&nbsp;</span></strong><span style="font-size: 18px;">You are not allowed to use the inbuilt function.</span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>txt = "GeeksForGeeks", pat = "Fr"
<strong>Output: </strong>-1<strong>
Explanation: "</strong>Fr" is not present in the string "GeeksForGeeks" as substring.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>txt = "GeeksForGeeks", pat = "For"
<strong>Output: </strong>5<strong>
Explanation: "</strong>For" is present as substring in "GeeksForGeeks" from index 5 (0 based indexing).<br></span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>txt = "GeeksForGeeks", pat = "gr"
<strong>Output: </strong>-1<strong>
Explanation: "</strong>gr" is not present in the string "GeeksForGeeks" as substring.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ txt.size(),pat.size() ≤ 1000</span></p>
