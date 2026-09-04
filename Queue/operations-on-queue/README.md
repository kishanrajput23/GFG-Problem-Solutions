## [Operations on Queue](https://www.geeksforgeeks.org/problems/operations-on-queue/1)

**Difficulty:** Basic  
**Topics:** Queue  

**Problem Description:**

<p><span style="color: #1e2229; font-family: Nunito;"><span style="font-size: 18.6667px;"><span style="color: #1e2229; font-family: Nunito;"><span style="font-size: 18.6667px;">Implement a class myQueue that supports following operations:</span></span></span></span></p>
<ul>
<li><span style="color: #1e2229; font-family: Nunito;"><span style="font-size: 18.6667px;"><strong style="color: #1e2229; font-family: Nunito; font-size: 18.6667px;">void enqueue(int x):</strong><span style="color: #1e2229; font-family: Nunito;"><span style="font-size: 18.6667px;"> Insert an element x at the end of the queue.</span></span></span></span></li>
<li style="box-sizing: border-box; line-height: 1.4285em; font-family: Nunito; color: #1e2229;"><span style="color: #1e2229; font-family: Nunito;"><span style="font-size: 18.6667px;"><strong>void dequeue():</strong> Remove the element from the front of the queue.</span></span></li>
<li style="box-sizing: border-box; line-height: 1.4285em; font-family: Nunito; color: #1e2229;"><span style="color: #1e2229; font-family: Nunito;"><span style="font-size: 18.6667px;"><strong>int getFront():</strong> Return the element at the front of the queue.</span></span></li>
<li style="box-sizing: border-box; line-height: 1.4285em; font-family: Nunito; color: #1e2229;"><span style="color: #1e2229; font-family: Nunito;"><span style="font-size: 18.6667px;"><strong>int getRear():</strong> Return the element at the rear end of the queue.</span></span></li>
<li style="box-sizing: border-box; line-height: 1.4285em; font-family: Nunito; color: #1e2229;"><span style="color: #1e2229; font-family: Nunito;"><span style="font-size: 18.6667px;"><strong>bool isEmpty():</strong> Return true if the queue is empty, otherwise false.</span></span></li>
<li style="box-sizing: border-box; line-height: 1.4285em; font-family: Nunito; color: #1e2229;"><span style="color: #1e2229; font-family: Nunito;"><span style="font-size: 18.6667px;"><strong>int size():</strong> Return the number of elements currently in the queue.</span></span></li>
</ul>
<p><span style="color: #1e2229; font-family: Nunito;"><span style="font-size: 18.6667px;"><span style="color: #1e2229; font-family: Nunito;"><span style="font-size: 18.6667px;">There will be a sequence of q queries queries[][]. The queries are represented in numeric form:</span></span></span></span></p>
<ul>
<li style="box-sizing: border-box; line-height: 1.4285em; font-family: Nunito; color: #1e2229;"><span style="color: #1e2229; font-family: Nunito;"><span style="font-size: 18.6667px;">1 x - Call enqueue(x)</span></span></li>
<li style="box-sizing: border-box; line-height: 1.4285em; font-family: Nunito; color: #1e2229;"><span style="color: #1e2229; font-family: Nunito;"><span style="font-size: 18.6667px;">2 - Call dequeue()</span></span></li>
<li style="box-sizing: border-box; line-height: 1.4285em; font-family: Nunito; color: #1e2229;"><span style="color: #1e2229; font-family: Nunito;"><span style="font-size: 18.6667px;">3 - Call getFront()</span></span></li>
<li style="box-sizing: border-box; line-height: 1.4285em; font-family: Nunito; color: #1e2229;"><span style="color: #1e2229; font-family: Nunito;"><span style="font-size: 18.6667px;">4 - Call getRear()</span></span></li>
<li style="box-sizing: border-box; line-height: 1.4285em; font-family: Nunito; color: #1e2229;"><span style="color: #1e2229; font-family: Nunito;"><span style="font-size: 18.6667px;">5 - Call isEmpty()</span></span></li>
<li style="box-sizing: border-box; line-height: 1.4285em; font-family: Nunito; color: #1e2229;"><span style="color: #1e2229; font-family: Nunito;"><span style="font-size: 18.6667px;">6 - Call size()</span></span></li>
</ul>
<p><span style="color: #1e2229; font-family: Nunito;"><span style="font-size: 18.6667px;"><span style="color: #1e2229; font-family: Nunito;"><span style="font-size: 18.6667px;">The driver code will process the queries, call the corresponding functions, and print the outputs of getFront(), getRear(), isEmpty(), size() operations. You only need to implement the above six functions.</span></span></span></span></p>
<p><strong><span style="color: #1e2229; font-family: Nunito;"><span style="font-size: 18.6667px;">Examples:</span></span></strong></p>
<pre><span style="color: #1e2229; font-family: Nunito;"><span style="font-size: 18.6667px;"><strong>Input: </strong>q = 8, queries[][] = [[1 1], [1 7], [1 8], [2], [3], [4], [5], [6]]
<strong>Output:</strong> [7, 8, false, 2]
<strong>Explanation:</strong> Operations on queue will process as follows:
  • enqueue(1) in the queue.
  • enqueue(7) in the queue.
  • enqueue(8) in the queue.
  • dequeue(), 1 will be removed from the queue.
  • getFront(), return 7.
  • getRear(), return 8.
  • isEmpty(), queue is non-empty; i.e. return false.
  • size(), queue currently contains two elements, return 2.</span></span></pre>
<pre><span style="color: #1f1f1f; font-family: Google Sans, Arial, sans-serif;"><span style="font-size: 18.6667px;"><strong>Input:</strong> q = 4, queries[][] = [[5], [1 3], [1 6], [4]]</span></span><br><span style="color: #1f1f1f; font-family: Google Sans, Arial, sans-serif;"><span style="font-size: 18.6667px;"><strong>Output:</strong> [true, 6]</span></span><br><span style="color: #1f1f1f; font-family: Google Sans, Arial, sans-serif;"><span style="font-size: 18.6667px;"><strong>Explanation:</strong> Operations on queue will process as follows:</span></span><br><span style="color: #1f1f1f; font-family: Google Sans, Arial, sans-serif;"><span style="font-size: 18.6667px;">  • isEmpty(), queue is empty; i.e. return true.</span></span><br><span style="color: #1f1f1f; font-family: Google Sans, Arial, sans-serif;"><span style="font-size: 18.6667px;">  • enqueue(3) in the queue.</span></span><br><span style="color: #1f1f1f; font-family: Google Sans, Arial, sans-serif;"><span style="font-size: 18.6667px;">  • enqueue(6) in the queue.</span></span><br><span style="color: #1f1f1f; font-family: Google Sans, Arial, sans-serif;"><span style="font-size: 18.6667px;">&nbsp; • getRear(), return 6.</span></span></pre>
<p><span style="color: #1f1f1f; font-family: Google Sans, Arial, sans-serif;"><span style="font-size: 18.6667px; background-color: #ffffff;"><strong>Constraints:&nbsp;<br></strong></span></span><span style="color: #1f1f1f; font-family: Google Sans, Arial, sans-serif;"><span style="font-size: 18.6667px; background-color: #ffffff;">1 ≤ q ≤ 10<sup>3</sup><br></span></span><span style="color: #1f1f1f; font-family: Google Sans, Arial, sans-serif;"><span style="font-size: 18.6667px; background-color: #ffffff;">1 ≤ x ≤ 10<sup>3</sup></span></span></p>

**Expected Complexities:**

Time Complexity: O(1)  
Auxiliary Space: O(1)
