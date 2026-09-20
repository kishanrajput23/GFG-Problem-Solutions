## [Front-Back Transformation of String](https://www.geeksforgeeks.org/problems/front-back-transformation1659/1)

**Difficulty:** Basic  
**Topics:** Strings  

**Problem Description:**

<p><span style="font-size: 14pt;">Given a string <strong>s </strong>consisting only of English alphabets, transform each character by replacing it with the character present at the corresponding position in the reversed English alphabet. Thus, 'a' becomes 'z', 'b' becomes 'y', 'c' becomes 'x', and similarly 'z' becomes 'a'. Uppercase letters are also transformed in the same way while preserving their case. Return the resulting transformed string.</span></p><p><span style="font-size: 18px;"><strong>Examples:</strong></span></p><pre><span style="font-size: 18px;"><strong>Input:</strong> s = "Hello"
<strong>Output:</strong> Svool
<strong>Explanation:</strong> </span><span style="font-size: 14pt;">'H' is replaced by 'S', 'e' by 'v', 'l' by 'o', and 'o' by 'l'. Therefore, the transformed string becomes "Svool".</span></pre><pre><span style="font-size: 18px;"><strong>Input:</strong> s = "GfG"
<strong>Output:</strong> TuT
<strong>Explanation:</strong>'G' is replaced by 'T' and 'f' is replaced by 'u'. Hence, the resulting string is "TuT".</span></pre>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(1)
