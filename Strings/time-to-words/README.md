## [Time to Words](https://www.geeksforgeeks.org/problems/time-to-words3728/1)

**Difficulty:** Basic  
**Topics:** Strings  

**Problem Description:**

<p><span style="font-size: 14pt;">Given a time in hh:mm 12-hour format, convert it into words. </span><span style="font-size: 14pt;">The conversion follows standard time-telling rules:</span></p>
<ul>
<li><span style="font-size: 14pt;">At the top of the hour (mm = 0), say the hour followed by o' clock.</span></li>
<li><span style="font-size: 14pt;">For minutes between 1 and 30, say the number of minutes past the current hour.</span></li>
<li><span style="font-size: 14pt;">For minutes between 31 and 59, say the number of minutes to the next hour.</span></li>
<li><span style="font-size: 14pt;">15 minutes is said as quarter, and 30 minutes is said as half, instead of spelling out the number.</span></li>
</ul>
<pre><span style="font-size: 18px;">6:15 quarter past six
6:30 half past six
6:45 quarter to seven
6:47 thirteen minutes to seven</span></pre>
<p><strong><span style="font-size: 14pt;">Examples:</span></strong></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> h = 6, m = 0
<strong>Output:</strong> six o' clock
<strong>Explanation:</strong> 6H:0M is read as "six o' clock".</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> h = 6, m = 10
<strong>Output:</strong> ten minutes past six
<strong>Explanation:</strong> 6H:10M is read as "ten minutes past six".</span></pre>
<p><strong><span style="font-size: 14pt;">Constraints:</span></strong><br><span style="font-size: 14pt;">0 &lt; h &lt; 12</span><br><span style="font-size: 14pt;">0 ≤ m &lt; 60</span></p>

**Expected Complexities:**

Time Complexity: O(1)  
Auxiliary Space: O(1)
