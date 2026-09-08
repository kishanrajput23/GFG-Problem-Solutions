## [Uncommon characters](https://www.geeksforgeeks.org/problems/uncommon-characters4932/1)

**Difficulty:** Basic  
**Topics:** Hash, Strings  

**Problem Description:**

<p><span style="font-size: 14pt;">You are given two strings <strong>s1</strong> and <strong>s2</strong>. Your task is to identify the characters that appear in either string but not in both (i.e., characters that are unique to one of the strings). Return the result as a sorted string.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>s1 = "geeksforgeeks", s2 = "geeksquiz"
<strong>Output: </strong>"fioqruz"
<strong>Explanation: </strong>The characters 'f', 'i', 'o', 'q', 'r', 'u', and 'z' are present in either s1 or s2, but not in both.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> s1 = "characters", s2 = "alphabets"
<strong>Output:</strong> "bclpr"
<strong>Explanation: </strong>The characters 'b', 'c', 'l', 'p', and 'r' are present in either s1 or s2, but not in both.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> s1 = "rome", s2 = "more"
<strong>Output:</strong> ""
<strong>Explanation: </strong>Both strings contain the same characters, so there are no unique characters. The output is an empty string.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1&lt;= s1.size(), s2.size() &lt;= 10<sup>5<br></sup>Both strings contain only lowercase English letters.</span></p>

**Expected Complexities:**

Time Complexity: O(n + m)  
Auxiliary Space: O(n + m)
