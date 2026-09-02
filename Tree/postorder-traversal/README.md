## [Postorder Traversal](https://www.geeksforgeeks.org/problems/postorder-traversal/1)

**Difficulty:** Basic  
**Topics:** Tree  

**Problem Description:**

<p><span style="font-size: 14pt;"><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Given the <strong>root </strong>of a Binary Tree, return its </span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Postorder Traversal</span>.</span></p>
<p><span style="font-size: 14pt;"><strong>Note:&nbsp;</strong><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">A postorder traversal first visits the left child (including its entire subtree), then visits the right child (including its entire subtree), and finally visits the node itself.</span></span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>root = [19, 10, 8, 11, 13]<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700199/Web/Other/blobid0_1752318711.webp" width="205" height="205">
<strong>Output: </strong>[11, 13, 10, 8, 19]<br><strong>Explanation: </strong>The postorder traversal of the given binary tree is [11, 13, 10, 8, 19].</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>root = [11, 15, N, 7]<br> <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700199/Web/Other/blobid1_1752318749.webp" width="160" height="216">
<strong>Output:</strong> [7, 15, 11]<br><strong>Explanation: </strong>The postorder traversal of the given binary tree is [7, 15, 11].</span></pre>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(1)
