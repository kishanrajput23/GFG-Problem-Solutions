## [Buildings with Sunlight](https://www.geeksforgeeks.org/problems/buildings-receiving-sunlight3032/1)

**Difficulty:** Easy  
**Topics:** Arrays  

**Problem Description:**

<p><span style="font-size: 18px;">Given the array <strong>arr[]</strong> of <strong>heights</strong> of certain buildings that lie adjacent to each other, Sunlight starts falling from the <strong>left side</strong> of the buildings. If there is a building of a certain height, all the buildings to the right side of it having <strong>lesser heights</strong> cannot see the sun. </span><span style="font-size: 18px;">Find the total number of buildings that receive sunlight.</span></p>
<p><strong><span style="font-size: 18px;">Note:&nbsp;</span></strong><span style="font-size: 14pt;">Buildings with equal height do not block each other and can also receive sunlight.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> arr[] = [6, 2, 8, 4, 11, 13]
<strong>Output:</strong> 4
<strong>Explanation:</strong> Only the buildings with heights 6, 8, 11, and 13 receive sunlight; therefore, the output is 4.<br> <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/926489/Web/Other/blobid0_1776323808.png" width="226" height="200"><br></span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> arr[] = [2, 5, 1, 8, 3]
<strong>Output:</strong> 3
<strong>Explanation:</strong> Only buildings of height 2, 5 and 8 can see the sun, hence output is 3.<br> <img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/926489/Web/Other/blobid1_1776324095.png" width="226" height="200"><br></span></pre>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input:</strong><span style="font-size: 18px;"> arr[] = [3, 3, 3, 1]
</span><strong style="font-size: 18px;">Output:</strong><span style="font-size: 18px;"> 3<br><strong>Explanation:</strong> </span></span><span style="font-size: 18px;">The first three buildings (height 3) receive sunlight, while the last building (1) is blocked. Hence, the output is 3.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ arr.size() ≤ 10<sup>5</sup><br>1 ≤ arr[i] ≤ 10<sup>5</sup></span></p>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(1)
