## [Height of Heap](https://www.geeksforgeeks.org/problems/height-of-heap5025/1)

**Difficulty:** Basic  
**Topics:** Heap  

**Problem Description:**

<p><span style="font-size: 18px;">Given a Binary Heap of size n<strong>&nbsp;</strong>in an array <strong>arr[]</strong>.&nbsp;Write a program to calculate the height of the Heap.<br><br><strong>Note:&nbsp;</strong>Return 1 if the n is 1.<br></span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> n = 6, arr[] = [1, 3, 6, 5, 9, 8]
<strong>Output:</strong> 2
<strong>Explaination:</strong> The tree is like the following</span>
        <span style="font-size: 18px;">(1)
       /   \
    (3)    (6)
    / \     /
  (5) (9) (8)</span></pre>
<pre><span style="font-size: 18px;"><strong><br>Input: </strong>n = 9, arr[] = [3, 6, 9, 2, 15, 10, 14, 5, 12]
<strong>Output:</strong> 3
<strong>Explaination:</strong> The tree looks like following</span>
           <span style="font-size: 18px;">(2)
        /      \
      (3)      (9)
     /  \     /   \
   (5) (15) (10) (14)
   / \
 (6) (12)</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n ≤ 10<sup>4</sup><br>1&nbsp;≤ arr[i]&nbsp;≤ 10<sup>6</sup></span></p>

**Expected Complexities:**

Time Complexity: O(log n)  
Auxiliary Space: O(1)
