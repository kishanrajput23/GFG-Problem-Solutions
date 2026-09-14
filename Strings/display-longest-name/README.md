## [Longest Word](https://www.geeksforgeeks.org/problems/display-longest-name0853/1)

**Difficulty:** Basic  
**Topics:** Arrays, Strings  

**Problem Description:**

<p><span style="font-size: 18px;">Given an array arr[] containing strings of names. Your task is to return the longest string. If there are multiple names of the longest size, return the <strong>first</strong> occurring name.</span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = ["Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks"]</span>
<span style="font-size: 18px;"><strong>Output: </strong>"GeeksforGeeks"<br><strong>Explanation:</strong> Name "GeeksforGeeks" has maximum length among all names. <br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = ["Apple", "Mango", "Orange", "Banana"]<br><strong>Output: </strong>"Orange"</span><br><span style="font-size: 14pt;"><strong>Explanation:</strong> Names "Orange" and "Banana" both have maximum length among all names but Orange comes first so answer will be "Orange". </span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong></span><br><span style="font-size: 18px;">1 ≤ arr.size() ≤ 1000</span><br><span style="font-size: 18px;">1 ≤ arr[i] ≤ 1000<br>arr[i] has only lowercase and uppercase letters</span></p>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(1)
