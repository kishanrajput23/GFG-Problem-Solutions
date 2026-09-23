## [Perfect Reversible String](https://www.geeksforgeeks.org/problems/perfect-reversible-string4828/1)

**Difficulty:** Basic  
**Topics:** Strings  

**Problem Description:**

<p><span style="font-size: 20px;">Given a string <strong>s</strong>, check if the reverse of every possible substring of <strong>s</strong> is also present as a substring in <strong>s</strong>.&nbsp;</span></p>
<p><strong><span style="font-size: 20px;">Examples:</span></strong></p>
<pre><span style="font-size: 20px;"><strong>Input:</strong> s = "ab"<br></span><span style="font-size: 20px;"><strong>Output:</strong> false<br></span><span style="font-size: 20px;"><strong>Explanation:</strong> All substrings are "a", "b", "ab" but the reverse of "ab" which is "ba" is not present in s.</span></pre>
<pre><span style="font-size: 20px;"><strong>Input:</strong> s = "aba"<br></span><span style="font-size: 20px;"><strong>Output:</strong> true<br></span><span style="font-size: 20px;"><strong>Explanation:</strong> Reverse of every possible substring is present in s.</span></pre>
<pre><span style="font-size: 20px;"><strong>Input:</strong> s = "abc"<br></span><span style="font-size: 20px;"><strong>Output:</strong> false<br></span><span style="font-size: 20px;"><strong>Explanation:</strong> The reverse of substring "abc" which is "cba" is not present in s.</span></pre>

**Expected Complexities:**

Time Complexity: O(|s|)  
Auxiliary Space: O(1)
