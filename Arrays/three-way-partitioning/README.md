## [Three Way Partitioning](https://www.geeksforgeeks.org/problems/three-way-partitioning/1)

**Difficulty:** Easy  
**Topics:** Arrays, Sorting  

**Problem Description:**

<p><span style="font-size: 18px;">Given an array <strong>arr[]</strong> and a range <strong>a</strong>, <strong>b</strong>. The task is to partition the array around the range such that the array is divided into three parts.</span></p><ol><li><span style="font-size: 18px;">All elements smaller than <strong>a</strong> come first.</span></li><li><span style="font-size: 18px;">All elements in range <strong>a</strong> to <strong>b</strong> come next.</span></li><li><span style="font-size: 18px;">All elements greater than <strong>b</strong> appear in the end.</span></li></ol><p><span style="font-size: 18px;">The individual elements of three sets can appear in any order. You are required to return the modified array.<br></span></p><p><span style="font-size: 18px;"><strong>Note</strong>: The generated output is true if you modify the given array successfully. Otherwise false.</span></p><p><span style="font-size: 18px;"><strong>Examples:</strong></span></p><pre><span style="font-size: 18px;"><strong>Input</strong>: arr[] = [1, 2, 3, 3, 4], a = 1, b = 2
<strong>Output:</strong> true
<strong>Explanation</strong>: One possible arrangement is: {1, 2, 3, 3, 4}. If you return a valid arrangement, output will be true.</span>
</pre><pre><span style="font-size: 18px;"><strong>Input</strong>: arr[] = [1, 4, 3, 6, 2, 1], a = 1, b = 3
<strong>Output</strong>: true
<strong>Explanation: </strong>One possible arrangement is: {1, 3, 2, 1, 4, 6}. If you return a valid arrangement, output will be true.</span></pre>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(1)
