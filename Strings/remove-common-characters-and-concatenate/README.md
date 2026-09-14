## [Remove Common and Concat](https://www.geeksforgeeks.org/problems/remove-common-characters-and-concatenate-1587115621/1)

**Difficulty:** Basic  
**Topics:** Strings  

**Problem Description:**

<p data-pm-slice="0 0 []"><span style="font-size: 18.6667px;">Given two strings, <strong>s1</strong> and <strong>s2</strong>. The task is to remove all characters that are common in both strings and then combine the remaining characters from each string to form a new string. </span></p>
<ul>
<li data-pm-slice="0 0 []"><span style="font-size: 18.6667px;">The characters that are not shared between the two strings should appear in the result in the same order as they appear in their respective original strings. </span></li>
<li data-pm-slice="0 0 []"><span style="font-size: 18.6667px;">If no characters are left&nbsp;</span><span style="font-size: 18.6667px;">after removing the common characters</span><span style="font-size: 18.6667px;">, return "-1"</span></li>
</ul>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s1 = aacdb, s2 = gafd
<strong>Output: </strong>cbgf<strong>
Explanation: </strong>The common characters of s1 and s2 are: a, d. The uncommon characters of s1 and s2 are c, b, g and f. Thus the modified string with uncommon characters concatenated is cbgf.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s1 = abcs, s2 = cxzca
<strong>Output: </strong>bsxz<strong>
Explanation: </strong>The common characters of s1 and s2 are: a,c. The uncommon characters of s1 and s2 are b,s,x and z. Thus the modified string with uncommon characters concatenated is bsxz.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:&nbsp;</strong><br>1 &lt;= |Length of Strings| &lt;= 10<sup>5</sup></span></p>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(n)
