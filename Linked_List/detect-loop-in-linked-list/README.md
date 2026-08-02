## [Detect Loop in linked list](https://www.geeksforgeeks.org/problems/detect-loop-in-linked-list/1?page=1&category=Linked%20List&status=solved)

**Topics:** Linked List, two-pointer-algorithm  

**Problem Description:**

<p><span style="font-size: 18.6667px;">You are given the <strong>head </strong>of a singly linked list. You have to determine whether the given linked list contains a <strong>loop </strong>or <strong>not</strong>.<strong>&nbsp;</strong>A loop exists in a linked list if the next pointer of the last node points to any other node in the list (including itself), rather than being null.<br></span></p>
<p><span style="font-size: 18.6667px;"><strong>Note:&nbsp;</strong>Internally, pos(1 based index) is used to denote the position of the node that tail's next pointer is connected to. If pos = 0, it means the last node points to null. Note that pos is not passed as a parameter.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>pos = 2,<br>   <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/908280/Web/Other/blobid0_1756127210.webp" width="348" height="104"><br><strong>Output: </strong>true<strong>
Explanation: </strong>There exists a loop as last node is connected back to the second node.<br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>pos = 0,<br> &nbsp; <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/908280/Web/Other/blobid1_1756127232.webp" width="445" height="66"><br><strong>Output: </strong>false<strong>
Explanation: </strong>There exists no loop in given linked list.<br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>pos = 1,<br>   <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/908280/Web/Other/blobid2_1756127467.webp" width="389" height="96"><br><strong>Output: </strong>true<strong>
Explanation: </strong>There exists a loop as last node is connected back to the first node.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong></span><br><span style="font-size: 14pt;">1 ≤ number of nodes ≤ 10<sup>5</sup><br>1 ≤ node-&gt;data ≤ 10<sup>3&nbsp; &nbsp; &nbsp; &nbsp;</sup></span><span style="font-size: 18.6667px;"><br></span><span style="font-size: 14pt;">0&nbsp;</span><span style="font-size: 18.6667px;">≤&nbsp;</span><span style="font-size: 14pt;">pos&nbsp;</span><span style="font-size: 18.6667px;">≤ number of nodes</span></p>
