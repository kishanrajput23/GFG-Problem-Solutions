## [Alternate Positive Negative](https://www.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1)

**Difficulty:** Easy  
**Topics:** Arrays  

**Problem Description:**

<p><span style="font-size: 18px;">Given an unsorted array <strong>arr </strong>containing<strong> </strong>both<strong> </strong>positive and negative numbers. Your task is to rearrange the array and convert it into an array of alternate positive and negative numbers without changing the relative order.<br><br></span><span style="font-size: 18px;"><strong>Note: </strong></span></p><ul><li><span style="font-size: 18px;">Resulting array should start with a positive integer (0 will also be considered as a positive integer). </span></li><li><span style="font-size: 18px;">If any of the positive or negative integers are exhausted, then add the remaining integers in the answer as it is by maintaining the relative order.</span></li></ul><p><span style="font-size: 18px;"><strong>Examples:</strong></span></p><pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [9, 4, -2, -1, 5, 0, -5, -3, 2]
<strong>Output: </strong>[9, -2, 4, -1, 5, -5, 0, -3, 2]
<strong>Explanation: </strong>The positive numbers are [9, 4, 5, 0, 2] and the negative integers are [-2, -1, -5, -3]. Since, we need to start with the positive integer first and then negative integer and so on (by maintaining the relative order as well), hence we will take 9 from the positive set of elements and then -2 after that 4 and then -1 and so on.
</span></pre><pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [-5, -2, 5, 2, 4, 7, 1, 8, 0, -8]
<strong>Output: </strong>[5, -5, 2, -2, 4, -8, 7, 1, 8, 0]
<strong>Explanation : </strong>The positive numbers are [5, 2, 4, 7, 1, 8, 0] and the negative integers are [-5,-2,-8]. According to the given conditions we will start from the positive integer 5 and then -5 and so on. After reaching -8 there are no negative elements left, so according to the given rule, we will add the remaining elements (in this case positive elements are remaining) as it in by maintaining the relative order.</span></pre><pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [9, 5, -2, -1, 5, 0, -5, -3, 2]
<strong>Output: </strong>[9, -2, 5, -1, 5, -5, 0, -3, 2]
<strong>Explanation: </strong>The positive numbers are [9, 5, 5, 0, 2] and the negative integers are [-2, -1, -5, -3]. Since, we need to start with the positive integer first and then negative integer and so on (by maintaining the relative order as well), hence we will take 9 from the positive set of elements and then -2 after that 5 and then -1 and so on.</span></pre>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(n)
