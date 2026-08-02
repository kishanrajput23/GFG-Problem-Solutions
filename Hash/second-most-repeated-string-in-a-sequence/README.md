## [Second most repeated string in a sequence](https://www.geeksforgeeks.org/problems/second-most-repeated-string-in-a-sequence0534/1?page=3&category=Strings&status=solved&sortBy=submissions)

**Topics:** Hash, Strings  

**Problem Description:**

<p><span style="font-size: 18px;">Given a sequence of strings <strong>arr[]</strong>, find and return the second highest frequency (count of occurrences) among all strings in the array.</span></p>
<p><strong><span style="font-size: 18px;">Note:</span></strong></p>
<ul>
<li><span style="font-size: 18px;">If all strings have the same frequency, return -1.</span></li>
<li><span style="font-size: 18px;">If there is only one unique string in the array, return -1.</span></li>
<li><span style="font-size: 18px;">If the array is empty, return -1.</span></li>
</ul>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = ["aaa", "bbb", "ccc", "bbb", "aaa", "aaa"]
<strong>Output:</strong> 2
<strong>Explanation</strong>: "bbb" is the second most occurring string with frequency 2. So the answer for this test case is 2.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input</strong>: arr[] = ["aaa", "aaa", "aaa", "aaa", "aaa", "aaa"]
<strong>Output:</strong> -1
<strong>Explanation</strong>: There is only one unique string with frequency 6. So answer for this test case is -1.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1≤ arr.size() ≤ </span><span style="font-size: 18px;">10<sup>5</sup><br>1 ≤ arr[i].size() ≤ 10</span></p>
