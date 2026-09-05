## [Stack using Linked List](https://www.geeksforgeeks.org/problems/implement-stack-using-linked-list/1)

**Difficulty:** Basic  
**Topics:** Linked List, Stack  

**Problem Description:**

<p><span style="font-size: 14pt;"><span style="font-size: 18.6667px;">Implement a <strong>Stack </strong>using a Linked List. The stack has dynamic size and can grow until memory is available.</span><br><span style="font-size: 14pt;">The Stack must support the following operations:</span></span></p>
<p><span style="font-size: 14pt;"><strong>(i)</strong><strong>&nbsp;push(x):</strong>&nbsp;Insert an element x at the top of the stack.<br><strong>(ii)</strong>&nbsp;<strong>pop():</strong>&nbsp;Remove the element from the top of the stack.</span><br><span style="font-size: 14pt;"><strong>(iii)</strong>&nbsp;<strong>peek():</strong>&nbsp;Return top element if not empty, else -1.<br><strong>(iv)</strong>&nbsp;<strong>isEmpty():</strong>&nbsp;Return true if the stack is empty else return false.<br><strong>(v)</strong>&nbsp;<strong data-start="837" data-end="847">size()</strong><strong>:</strong>&nbsp;Return the number of elements currently in the stack.<br></span></p>
<p><span style="font-size: 14pt;">There will be a sequence of queries&nbsp;<strong>queries[][] </strong>in numeric form:&nbsp;<br></span></p>
<ul>
<li><span style="font-size: 14pt;">1 x : Call push(x)</span></li>
<li><span style="font-size: 14pt;">2: Call pop()</span></li>
<li><span style="font-size: 14pt;">3: Call peek()</span></li>
<li><span style="font-size: 14pt;">4: Call isEmpty()</span></li>
<li><span style="font-size: 14pt;">5: Call size()</span></li>
</ul>
<p><span style="font-size: 18.6667px;">Implement only the functions push, pop, peek, isEmpty, and size. The driver code handles input and output.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>q = 7, queries[][] = [[1, 5], [1, 3], [1, 4], [3], [2], [5], [4]]
<strong>Output: </strong>[4, 2, false]<strong>
Explanation: </strong>Queries on queue are as follows:<br>push(5): Insert 5 at the top of the stack.<br>push(3): Insert 3 at the top of the stack.<br>push(4): Insert 4 at the top of the stack.<br>peek(): Return the top element i.e 4.<br>pop(): Remove the top element 4 from the stack.<br>size(): Stack contains 2 elements return 2.<br>isEmpty(): Stack is not empty return false.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>q = 4, queries[][] = [[4], [3], [1, 10], [5]]
<strong>Output: </strong>[true, -1, 1]<strong>
Explanation: </strong>Queries on queue are as follows:<br>isEmpty(): Stack is empty return true.<br>peek(): Stack is empty return -1.<br>push(10): Insert 10 at the top of the stack.</span><br><span style="font-size: 14pt;">size(): Stack contains 1 element return 1.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ number of query ≤ 10<sup>3</sup><br>0 ≤ x<strong>&nbsp;</strong>≤ 10<sup>5</sup></span></p>

**Expected Complexities:**

Time Complexity: O(1)  
Auxiliary Space: O(n)
