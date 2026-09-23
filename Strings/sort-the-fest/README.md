## [Any Common Word in Two Lists](https://www.geeksforgeeks.org/problems/sort-the-fest0016/1)

**Difficulty:** Basic  
**Topics:** Strings  

**Problem Description:**

<p><span style="font-size: 14pt;">Given two arrays of strings <strong>s[ ]</strong> and <strong>t[ ]</strong> of sizes <strong>n</strong> and <strong>m</strong> , respectively, determine whether they share at least one common string. </span><span style="font-size: 14pt;">Return true if there exists a string that appears in both arrays; otherwise, return false.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><span style="font-size: 18px;"><strong>Input:</strong> s[] = ["cake", "pastry", "fish", "candy"], t[] = ["burger", "ham", "fish", "cake", "sauce"]
</span></span><span style="font-size: 18px;"><strong>Output: </strong>true<br></span><strong style="font-size: 18px;" data-start="1102" data-end="1118">Explanation</strong><span style="font-size: 18px;"><strong>: </strong></span><span style="font-size: 18px;">The word "fish" is present in both arrays.</span></pre>
<pre><span style="font-size: 18px;"><span style="font-size: 18px;"><strong>Input:</strong> </span><span style="font-size: 18px;">s[] = ["pizza", "chicken", "cake", "chilli", "candy"], t[] = ["choco", "coco"]</span></span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Output:</span> </strong><span style="font-size: 14pt;">false</span><strong><br></strong><strong style="font-size: 18px;" data-start="1102" data-end="1118">Explanation</strong><strong style="font-size: 18px;">: </strong><span style="font-size: 18px;"><span style="font-size: 14pt;">T</span></span></span><span style="font-size: 14pt;">here is no common word in the two arrays.
</span></pre>

**Expected Complexities:**

Time Complexity: O(n + m)  
Auxiliary Space: O(n)
