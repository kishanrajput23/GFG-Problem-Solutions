## [Keypad Typing](https://www.geeksforgeeks.org/problems/keypad-typing0119/1)

**Difficulty:** Basic  
**Topics:** Strings  

**Problem Description:**

<p><span style="font-size: 18px;">Given a string <strong>s</strong> consisting of lowercase English letters. Each letter corresponds to a number on a standard keypad, as shown in the figure. Replace every character in s with its corresponding keypad number and return the resulting numeric string.</span></p>
<p><span style="font-size: 18px;"><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/927509/Web/Other/blobid0_1777529736.png" width="322" height="225"></span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s = "geeksforgeeks"
<strong>Output: </strong>4335736743357<strong>
Explanation: </strong>Each character in the string "geeksforgeeks" is converted to its corresponding digit based on the keypad, and the digits are concatenated in order. This results in the number 4335736743357, which is the required decimal representation.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s = "geeksquiz"
<strong>Output: </strong>433577849<strong>
Explanation: </strong></span><span style="font-size: 14pt;">Each character in the string "geeksquiz" is converted to its corresponding digit based on the keypad, and the digits are concatenated in order. This results in the number 433577849, which is the required decimal representation.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ s.size() ≤ 100</span></p>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(n)
