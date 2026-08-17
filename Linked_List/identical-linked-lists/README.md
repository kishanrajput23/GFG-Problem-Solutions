## [Identical Linked Lists](https://www.geeksforgeeks.org/problems/identical-linked-lists/1?page=1&difficulty=Basic&status=solved&sortBy=submissions)

**Difficulty:** Basic  
**Topics:** Linked List  

**Problem Description:**

<p data-pm-slice="0 0 []"><span style="font-size: 14pt;">Given the <strong>heads</strong> of two <strong>singly linked lists</strong>, <strong>head1</strong> and <strong>head2</strong>, the task is to determine whether the two linked lists are <strong>identical</strong>. Two linked lists are considered identical if they have the same number of nodes and each corresponding node contains the same data in the same order. Return <strong>true</strong> if both lists are identical; otherwise, return <strong>false</strong>.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>head1: 1-&gt;2-&gt;3-&gt;4-&gt;5-&gt;6, head2: 99-&gt;59-&gt;42-&gt;20
<strong>Output: </strong>false<br><strong>Explanation:<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700585/Web/Other/blobid0_1719550109.png" width="400" height="140"><br></strong>As shown in figure the two lists are not identical.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>head1: 1-&gt;2-&gt;3-&gt;4-&gt;5, head2: 1-&gt;2-&gt;3-&gt;4-&gt;5
<strong>Output: </strong>true<br><strong>Explanation: <br></strong><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700585/Web/Other/blobid2_1719550498.png" width="400" height="140"> </span><br><span style="font-size: 14pt;">As shown in figure both are identical.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ length of lists ≤ 10<sup>5</sup><sup><br></sup><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">1 ≤ elements of lists ≤ 10<sup>5</sup></span></span></p>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(1)
