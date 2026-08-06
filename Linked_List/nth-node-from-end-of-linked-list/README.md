## [Kth from End of Linked List](https://www.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1?page=1&category=Linked%20List&status=solved&sortBy=submissions)

**Difficulty:** Easy  
**Topics:** Linked List  

**Problem Description:**

<p class="ajy" tabindex="0" role="button" aria-haspopup="true" data-tooltip="Show details" aria-label="Show details"><span style="font-size: 18.6667px;">Given the <strong>head</strong> of a linked list and an integer <strong>k</strong>, return the kth node from the end of the linked list. If k is greater than the number of nodes in the list, return -1.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>k = 2<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700170/Web/Other/blobid2_1785220073.png" width="711" height="64"><br><strong>Output: </strong>8<strong>
Explanation: <br></strong><strong><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/927814/Web/Other/blobid0_1778560525.webp" width="698" height="68"><br></strong>The 2nd node from end is 8.</span></pre>
<pre dir="ltr"><strong><span style="font-size: 14pt;">Input: </span></strong><span style="font-size: 14pt;">k = 3<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700170/Web/Other/blobid1_1785231895.png" height="100"><br><strong>Output:</strong> 40<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700170/Web/Other/blobid0_1785231867.png" height="100"><br>The 3rd node from the end is 40.</span></pre>
<div dir="ltr">
<pre><span style="font-size: 14pt;"><strong>Input: </strong>k = 5</span><br><span style="font-size: 14pt;"><strong><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/927814/Web/Other/blobid2_1778560858.webp" width="404" height="75"></strong></span><span style="font-size: 14pt;"><strong><br>Output: </strong>-1<strong>
Explanation: </strong>The given linked list is 10 -&gt; 5 -&gt; 100 -&gt; 5. Since 'k' is more than the number of nodes, the output is -1.<br></span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ number of nodes ≤ 10<sup>6<br></sup>1 ≤ node-&gt;data , x ≤ 10<sup>6</sup><br>1 ≤ k ≤ 10<sup>6</sup></span></p>
</div>
