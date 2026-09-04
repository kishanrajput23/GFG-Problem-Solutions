## [Queue using Linked List](https://www.geeksforgeeks.org/problems/implement-queue-using-linked-list/1?page=2&difficulty=Basic&status=solved&sortBy=submissions)

**Difficulty:** Basic  
**Topics:** Queue, Linked List  

**Problem Description:**

<p><span style="font-size: 14pt;">Implement a&nbsp;<strong>Queue&nbsp;</strong>using a Linked List, this queue has no fixed capacity and can grow dynamically until memory is available.<br>The Queue must support the following operations:</span></p>
<p><span style="font-size: 14pt;"><strong>(i)</strong><strong>&nbsp;enqueue(x):</strong> Insert an element x at the rear of the queue.<br><strong>(ii)</strong>&nbsp;<strong>dequeue():</strong> Remove the front element from the queue. If the queue is empty, do nothing.</span><br><span style="font-size: 14pt;"><strong>(iii)</strong>&nbsp;<strong>getFront():</strong>&nbsp;Return front element if not empty, else -1.<br><strong>(iv)</strong>&nbsp;<strong>isEmpty():</strong>&nbsp;Return true if the queue is empty else return false.<br><strong>(v)</strong>&nbsp;<strong style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;" data-start="837" data-end="847">size()</strong><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"><strong>:</strong> Return the number of elements currently in the queue.</span><br></span></p>
<p><span style="font-size: 14pt;">There will be a sequence of queries&nbsp;<strong>queries[][]</strong>. The queries are represented in numeric form:<br></span></p>
<ul>
<li><span style="font-size: 14pt;">1 x : Call enqueue(x)</span></li>
<li><span style="font-size: 14pt;">2: Call dequeue()</span></li>
<li><span style="font-size: 14pt;">3: Call getFront()</span></li>
<li><span style="font-size: 14pt;">4: Call isEmpty()</span></li>
<li><span style="font-size: 14pt;">5: Call size()</span></li>
</ul>
<p><span style="font-size: 14pt;">You just have to implement the functions&nbsp;enqueue,&nbsp;dequeue,&nbsp;getFront,&nbsp; isEmpty&nbsp;and&nbsp;size. The driver code will handle the input and output.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>q = 7, queries[][] = [[1, 5], [1, 3], [1, 4], [3], [2], [5], [4]]
<strong>Output: </strong>[5, 2, false]<strong>
Explanation: </strong>Queries on queue are as follows:<br>enqueue(5): Insert 5 at the rear of the queue.<br>enqueue(3): Insert 3 at the rear of the queue.<br>enqueue(4): Insert 4 at the rear of the queue.<br>getFront(): Return the front element i.e 5.<br>dequeue(): Remove the front element 5 from the queue.<br>size(): Queue now has 2 elements.<br>isEmpty(): Queue is not empty return false.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>q = 4, queries[][] = [[4], [3], [1, 10], [5]]
<strong>Output: </strong>[true, -1, 1]<strong>
Explanation: </strong>Queries on queue are as follows:<br>isEmpty(): Queue is empty return true.<br>getFront(): Queue is empty return -1.<br>enqueue(10): Insert 10 at the rear of the queue.</span><br><span style="font-size: 14pt;">size(): Queue contains 1 element return 1.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ number of query ≤ 10<sup>3</sup><br>0 ≤ x<strong>&nbsp;</strong>≤ 10<sup>5</sup></span></p>

**Expected Complexities:**

Time Complexity: O(1)  
Auxiliary Space: O(1)
