## [Queue Using Array](https://www.geeksforgeeks.org/problems/implement-queue-using-array/1?page=1&difficulty=Basic&status=solved&sortBy=submissions)

**Difficulty:** Basic  
**Topics:** Arrays, Queue  

**Problem Description:**

<p><span style="font-size: 14pt;">Implement a <strong>Queue </strong>using an Array, where the size of the array, <strong>n</strong> is given. <br>The Queue must support the following operations:</span></p>
<p><span style="font-size: 14pt;"><strong>(i)</strong><strong>&nbsp;enqueue(x):</strong> Insert an element x at the rear of the queue.<br><strong>(ii)</strong>&nbsp;<strong>dequeue():</strong> Remove the element from the front of the queue.</span><br><span style="font-size: 14pt;"><strong>(iii)</strong>&nbsp;<strong>getFront():</strong> Return front element if not empty, else -1.</span><br><span style="font-size: 14pt;"><strong>(iv)</strong>&nbsp;<strong>getRear():</strong>&nbsp;Return rear element if not empty, else -1.<br><strong>(v)</strong>&nbsp;<strong>isEmpty():</strong>&nbsp;Return true if the queue is empty else return false.<br><strong>(vi)</strong>&nbsp;<strong>isFull():</strong>&nbsp;Return true if the queue is full else return false.<br></span></p>
<p><span style="font-size: 14pt;">There will be a sequence of queries <strong>queries[][]</strong>. The queries are represented in numeric form:<br></span></p>
<ul>
<li><span style="font-size: 14pt;">1 x : Call enqueue(x)</span></li>
<li><span style="font-size: 14pt;">2: Call dequeue()</span></li>
<li><span style="font-size: 14pt;">3: Call getFront()</span></li>
<li><span style="font-size: 14pt;">4: Call getRear()</span></li>
<li><span style="font-size: 14pt;">5: Call isEmpty()</span></li>
<li><span style="font-size: 14pt;">6: Call isFull()</span></li>
</ul>
<p><span style="font-size: 14pt;">You just have to implement the functions enqueue, dequeue, getFront,&nbsp;getRear,&nbsp;isEmpty and isFull and the driver code will handle the output.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>n = 3, q = 7, queries[][] = [[1, 5], [1, 3], [1, 4], [3], [2], [5], [4]]
<strong>Output: </strong>[5, false, 4]<strong>
Explanation: </strong>Queries on queue are as follows:<br>enqueue(5): Insert 5 at the rear of the queue.<br>enqueue(3): Insert 3 at the rear of the queue.<br>enqueue(4): Insert 4 at the rear of the queue.<br>getFront(): Return the front element i.e 5.<br>dequeue(): Remove the front element 5 from the queue.<br>isEmpty(): Return false as the queue is not empty.<br>getRear(): Return the rear element i.e 4.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>n = 2, q = 4, queries[][] = [[4], [1, 3], [1, 7], [6]]
<strong>Output: </strong>[-1, true]<strong>
Explanation: </strong>Queries on queue are as follows:<br>getRear(): As the queue is empty return -1.<br>enqueue(3): Insert 3 at the rear of the queue.<br>enqueue(7): Insert 7 at the rear of the queue.</span><br><span style="font-size: 14pt;">isFull(): Return true as the queue is full i.e containing 2 elements.</span></pre>
<p><span style="font-size: 14pt;"><strong style="font-size: 14pt;">Constraints:</strong><br><span style="font-size: 14pt;">1 </span><span style="font-size: 18.6667px;">≤ n ≤ 10<sup>3</sup></span><br></span><span style="font-size: 14pt;">1 ≤ number of query ≤ 10<sup>3</sup><br>0 ≤ x<strong> </strong>≤ 10<sup>5</sup></span></p>
