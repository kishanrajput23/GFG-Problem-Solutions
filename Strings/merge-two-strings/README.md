## [Alternate Merge Two Strings](https://www.geeksforgeeks.org/problems/merge-two-strings2736/1)

**Difficulty:** Basic  
**Topics:** Strings  

**Problem Description:**

<p><span style="font-size: 18px;">Given two strings <strong>s1</strong> and <strong>s2</strong>, merge them alternatively i.e. the first character of s1 then the first character of s2 and so on till the strings end.<br></span><br><span style="font-size: 18px;"><strong>Note:</strong>&nbsp;Add the whole string if other string is empty.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s1 = "Hello", s2 = "Bye"
<strong>Output:</strong> HBeylelo
<strong>Explanation</strong>: The characters of both the given strings are arranged alternatlively.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input</strong>: s1 = "abc", s2 = "def"
<strong>Output:</strong> adbecf
<strong>Explanation</strong>: The characters of both the given strings are arranged alternatlively.
</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1&lt;=|s1|, |s2| &lt;=10<sup>3</sup></span></p>

**Expected Complexities:**

Time Complexity: O(|s1| + |s2|)  
Auxiliary Space: O(1)
