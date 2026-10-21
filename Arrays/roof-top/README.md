## [Roof Top](https://www.geeksforgeeks.org/problems/roof-top-1587115621/1)

**Difficulty:** Easy  
**Topics:** Arrays, Searching  

**Problem Description:**

<p data-pm-slice="0 0 []"><span style="font-size: 14pt;">Given and array <strong>arr[]</strong> representing the heights of <strong>n</strong> consecutive buildings. You can move from the roof of a building to the roof of the next adjacent building. You need to find the maximum number of consecutive steps you can put forward such that every step is to a higher building than the previous one.&nbsp; </span></p>
<p data-pm-slice="0 0 []"><strong><span style="font-size: 14pt;">Examples: </span></strong></p>
<p><span style="font-size: 14pt;"> </span></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> arr[] = [1, 2, 2, 3, 2] <br><strong>Output:</strong> 1 <br><strong>Explanation:</strong> Only pairs like 1 -&gt; 2 or 2 -&gt; 3 increase in height, and each such run has just 1 step. So the maximum consecutive upward steps is 1.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> arr[] = [10, 20, 30, 40, 25, 50]<br><strong>Output:</strong> 3<br><strong>Explanation:</strong> 10 -&gt; 20 -&gt; 30 -&gt; 40 are strictly increasing heights, so </span><span style="font-size: 18.6667px;">the maximum consecutive upward steps is 3.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> arr[] = [4, 3, 2, 1]<br><strong>Output:</strong> 0<br><strong>Explanation:</strong> There are no contiguous increasing heights</span></pre>
<p><span style="font-size: 14pt;"> </span></p>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong> <br></span><span style="font-size: 14pt;">1 ≤ arr.size() ≤ 10<sup>5<br></sup></span><span style="font-size: 14pt;">1 ≤ arr[i] ≤ 10<sup>5</sup></span></p>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(1)
