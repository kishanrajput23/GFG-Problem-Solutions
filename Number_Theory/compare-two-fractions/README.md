## [Compare two fractions](https://www.geeksforgeeks.org/problems/compare-two-fractions4438/1)

**Difficulty:** Easy  
**Topics:** Number Theory, Mathematics, Regular Expression  

**Problem Description:**

<p><span style="font-size: 18px;">You are given a string <strong>s</strong> containing two fractions a/b and c/d, compare them and return the <strong>greater fraction</strong>. </span><span style="font-size: 18px;">If they are equal, then return string "<strong>equal</strong>".</span></p>
<p><span style="font-size: 18px;"><strong>Note</strong>: The string s contains "<strong>a</strong></span><strong><span style="font-size: 18px;">/b, c/d</span></strong><span style="font-size: 18px;">"(fractions are separated by comma(,) &amp; space( )).&nbsp;</span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input</strong>: s = "5/6, 11/45"
<strong>Output:</strong>&nbsp;5/6
<strong>Explanation</strong>: 5/6 = 0.8333 and 11/45 = 0.2444, So 5/6 is greater fraction.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s = "8/1, 8/1"
<strong>Output: </strong>equal
<strong>Explanation: </strong>We can see that both the fractions are same, so we'll return a string "equal".<br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>s = "10/17, 9/10"
<strong>Output: </strong>9/10
<strong>Explanation: </strong>10/17 = 0.588 &amp; 9/10 = 0.9, so the <span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif; font-size: 18px; white-space: normal;">greater </span>fraction is "9/10".</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>0 ≤ a,c ≤ 10<sup>3</sup><br>1 ≤ b,d ≤ 10<sup>3</sup></span></p>

**Expected Complexities:**

Time Complexity: O(len|str|)  
Auxiliary Space: O(1)
