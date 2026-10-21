## [Missing in Second Array](https://www.geeksforgeeks.org/problems/in-first-but-second5423/1)

**Difficulty:** Easy  
**Topics:** Arrays, Hash  

**Problem Description:**

<p><span style="font-size: 18px;">Given two integer arrays <strong>a[]</strong>&nbsp;and <strong>b[]</strong>, find the elements which are present in the first array a[], but not present in the second array b[].</span></p><ul><li><span style="font-size: 18px;">Return the elements in the same order in which they appear in a[].</span></li><li><span style="font-size: 18px;">If there are more occurrences of an element in a[] than in b[], then extra occurrences of this element are NOT considered as missing in b[].</span></li></ul><p><span style="font-size: 18px;"><strong>Examples :</strong></span></p><pre><span style="font-size: 18px;"><strong>Input: </strong>a[] = [1, 2, 3, 4, 5, 10], b[] = [2, 3, 1, 0, 5]
<strong>Output:</strong> [4, 10]
<strong>Explanation</strong>: 4 and 10 are present in first array, but not in second array.</span></pre><pre><span style="font-size: 18px;"><strong>Input: </strong>a[] = [4, 3, 5, 9, 11], b[] = [4, 9, 3, 11, 10]</span>
<span style="font-size: 18px;"><strong>Output: </strong>[5]  
<strong>Explanation</strong>: Second array does not contain element 5.<br></span></pre><pre><span style="font-size: 14pt;"><strong>Input: </strong>a[] = [9], b[] = [7, 9, 4, 9, 9, 9]
<strong>Output: </strong>[]  </span></pre>

**Expected Complexities:**

Time Complexity: O(n + m)  
Auxiliary Space: O(n)
