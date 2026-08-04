## [Remove Cycle in Linked List](https://www.geeksforgeeks.org/problems/remove-loop-in-linked-list/1?page=1&category=Linked%20List&status=solved&sortBy=submissions)

**Difficulty:** Medium  
**Topics:** Linked List, two-pointer-algorithm  

**Problem Description:**

<p data-pm-slice="0 0 []"><span style="font-size: 18.6667px;">Given the <strong>head </strong>of a singly linked list. A cycle<strong> </strong>exists if the last node points back to a previous node, forming a loop. Remove the loop from the linked list if it exists.</span></p>
<p data-pm-slice="0 0 []"><span style="font-size: 18.6667px;">Internally, the driver code uses a variable <strong>x</strong> (1-based indexing) to represent the position of the node to which the last node is connected.</span></p>
<p data-pm-slice="0 0 []"><span style="font-size: 14pt;">The driver code will print "true" if the linked list is correctly modified, otherwise it will print "false".</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input:<br></strong><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700332/Web/Other/blobid0_1785112540.png" height="100"><br><strong>Output: </strong>true<strong>
Explanation: </strong></span><span style="font-size: 18.6667px;">The linked list contains a loop that begins at node x = 2. After removing the loop, the driver code prints true.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700332/Web/Other/blobid1_1785112592.png" width="449" height="80"></strong>
<strong>Output: </strong>true<strong>
Explanation: </strong>The linked list does not contain a loop (x = 0).</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: <br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700332/Web/Other/blobid2_1785112671.png" height="90"></strong>
<strong>Output: </strong>true<strong>
Explanation: </strong>The linked list contains a loop that begins at node x = 1. After removing the loop, the driver code prints true.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ size of linked list ≤ 10<sup>5</sup><br>0&nbsp;</span><span style="font-size: 18.6667px;">≤ x&nbsp;</span><span style="font-size: 18.6667px;">≤ size of linked list</span></p>
