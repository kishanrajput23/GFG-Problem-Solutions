## [Preorder Traversal](https://www.geeksforgeeks.org/problems/preorder-traversal/1?page=1&difficulty=Basic&status=solved&sortBy=submissions)

**Difficulty:** Basic  
**Topics:** Stack, Tree  

**Problem Description:**

<p><span style="font-size: 18px;">Given the root<strong> </strong>of a binary tree, return its preorder traversal.&nbsp; </span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif; font-size: 14pt;">A preorder traversal first visits the node, then visits the left child (including its entire subtree), and finally visits the right child (including its entire subtree).</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>root = [</span><span style="font-size: 14pt;">1, 4, N, 4, 2]<br></span><span style="font-size: 18px;"><strong>   <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/912455/Web/Other/blobid0_1758798513.webp" width="214" height="241"></strong>
<strong>Output: </strong>[1, 4, 4, 2]</span><span style="font-size: 22px;"><br></span><strong><span style="font-size: 14pt;">Explanation: </span></strong><span style="font-size: 14pt;">The preorder traversal of the given binary tree is [1, 4, 4, 2]</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>root = [6, 3, 2, N, 1, 2, N]<strong><br></strong>   <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/912455/Web/Other/blobid1_1758797018.webp" width="229" height="221">&nbsp;
<strong>Output: </strong>[6, 3, 1, 2, 2] <br><strong>Explanation:</strong> </span><span style="font-size: 14pt;">The preorder traversal of the given binary tree is [6, 3, 1, 2, 2] </span></pre>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(1)
