## [Count Internal Nodes in Tree](https://www.geeksforgeeks.org/problems/count-non-leaf-nodes-in-tree/1)

**Difficulty:** Basic  
**Topics:** Tree  

**Problem Description:**

<p><span style="font-size: 14pt;">Given a Binary Tree of size <strong>n</strong>, your task is to return the count of all the non-leaf nodes of the given binary tree.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> root[] = [1, 2, 3, 4, 5]
<img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/933076/Web/Other/blobid0_1787134369.png" alt="" width="215" height="184"></span><br><span style="font-size: 14pt;"><strong>Output: </strong>2
<strong>Explanation: </strong>Nodes 1 and 2 are the only non leaf nodes.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> root[] = [10, 5, 20, 3, 7, 15, 25]<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/933076/Web/Other/blobid1_1787134369.png" alt="" width="246" height="183">
<strong>Output: </strong>3
<strong>Explanation: </strong>Nodes 10, 5 and 20 are the only non leaf nodes.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> root[] = [8, 3, 9, 1, 6, 4, 7]</span><br><span style="font-size: 14pt;"><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/933076/Web/Other/blobid2_1787134369.png" alt="" width="239" height="266"></span><br><span style="font-size: 14pt;"><strong>Output: </strong>3
<strong>Explanation: </strong>Nodes 8, 3 and 6 are the only non leaf nodes.</span></pre>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(h)
