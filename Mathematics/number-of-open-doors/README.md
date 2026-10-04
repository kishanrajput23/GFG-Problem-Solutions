## [Number Of Open Doors after n Toggles](https://www.geeksforgeeks.org/problems/number-of-open-doors1552/1)

**Difficulty:** Easy  
**Topics:** Mathematics  

**Problem Description:**

<p><span style="font-size: 18px;"><span style="font-family: arial,helvetica,sans-serif;">Consider a long alley with a <strong>n </strong>number of doors on one side. </span></span></p>
<ul>
<li><span style="font-size: 18px;"><span style="font-family: arial,helvetica,sans-serif;">All the doors are closed initially. </span></span></li>
<li><span style="font-size: 18px;"><span style="font-family: arial,helvetica,sans-serif;">You move to and fro in the alley changing the states of the doors as follows. </span></span></li>
<li><span style="font-size: 18px;"><span style="font-family: arial,helvetica,sans-serif;">In the first go, you toggle the states of doors numbered 1, 2, 3, , n. </span></span></li>
<li><span style="font-size: 18px;"><span style="font-family: arial,helvetica,sans-serif;">I</span><span style="font-family: arial,helvetica,sans-serif;">n the second go, you&nbsp;</span></span><span style="font-size: 18px;"><span style="font-family: arial,helvetica,sans-serif;">toggle</span></span><span style="font-size: 18px;"><span style="font-family: arial,helvetica,sans-serif;">&nbsp;the states of doors numbered 2, 4, 6</span></span></li>
<li><span style="font-size: 18px;"><span style="font-family: arial,helvetica,sans-serif;">In the third go, you alter the states of doors numbered 3, 6, 9 </span></span></li>
<li><span style="font-size: 18px;"><span style="font-family: arial,helvetica,sans-serif;">You continue this till the nth go in which you alter the state of the door numbered n.</span></span></li>
</ul>
<p><span style="font-size: 18px;"><span style="font-family: arial,helvetica,sans-serif;">You need to find the number of open doors at the end of the procedure.</span></span></p>
<p><span style="font-size: 18px;"><strong>Example :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 2</span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Output:</span> </strong></span><span style="font-size: 18px;">1</span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Explanation:</span> </strong></span><span style="font-size: 18px;">Following the sequence 4 times, we can see that only 1st door will remain open.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 4</span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Output:</span> </strong></span><span style="font-size: 18px;">2</span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Explanation:</span> </strong></span><span style="font-size: 18px;">Following the sequence 4 times, we can see that only 1st and 4th doors will remain open.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong></span><br><span style="font-size: 18px;">1 &lt;= n &lt;= 10<sup>9</sup></span></p>

**Expected Complexities:**

Time Complexity: O(log(n))  
Auxiliary Space: O(1)
