## [Modular Node in Linked List](https://www.geeksforgeeks.org/problems/modular-node/1)

**Difficulty:** Basic  
**Topics:** Linked List, Modular Arithmetic  

**Problem Description:**

<p><span style="font-size: 14pt;">Given the head of a Singly Linked List and a number k, find the <strong>data </strong>of the <strong>modular node </strong>of the linked list. </span><span style="font-size: 18.6667px;">If no such index is present return -1.</span></p>
<blockquote>
<p><span style="font-size: 14pt;">A <strong>modular node </strong>is defined as the last node in the linked list whose position is divisible by k (pos % k==0).&nbsp;</span></p>
</blockquote>
<p><span style="font-size: 20px;">Note: 1-based position is followed, i.e., position of the first node is 1 and second node is 2.</span></p>
<p><span style="font-size: 20px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong><strong> </strong>head: 19-&gt;28-&gt;37-&gt;46-&gt;55, k = 2<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700634/Web/Other/blobid1_1720679992.png" width="502" height="69"><strong>
Output: </strong>46<strong>
Explanation:</strong> The position 4 is divisible by k. The node at this position is 46.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong><strong> </strong>head: 1-&gt;2-&gt;3-&gt;4-&gt;5-&gt;6-&gt;7, k = 10<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700634/Web/Other/blobid0_1720679969.png" width="502" height="69"> <br><strong>Output: </strong>-1
<strong>Explanation:</strong> No position is divisible by k as the max position is 7 only.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br><span style="font-size: 14pt;"><span style="color: #1e2229; font-family: Nunito; background-color: #ffffff;">1 &lt;= number of nodes &lt;= 10</span><span style="box-sizing: border-box; line-height: 1.7em; position: relative; vertical-align: baseline; top: -0.5em; font-family: Nunito; color: #1e2229; background-color: #ffffff;">5<br style="box-sizing: border-box; line-height: 1.7em; font-family: var(--gfg-font-primary) !important; color: var(--text-color) !important; background-color: var(--background) !important;"></span><span style="color: #1e2229; font-family: Nunito; background-color: #ffffff;">1 &lt;= node-&gt;data , k &lt;= 10<sup>5</sup></span></span><br></span></p>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(1)
