## [Stock Buy and Sell – Max one Transaction Allowed](https://www.geeksforgeeks.org/problems/buy-stock-2/1)

**Difficulty:** Easy  
**Topics:** Greedy, Arrays  

**Problem Description:**

<p><span style="font-size: 18.6667px;">Given an array <strong>prices[]</strong> of non-negative integers, representing the prices of the stocks on different days. The task is to find the maximum profit possible by buying and selling the stocks on different days when <strong>at most one </strong>transaction is allowed. Here one transaction means 1 buy + 1 Sell. If it is not possible to make a profit then <strong>return 0</strong>.</span></p>
<p><span style="font-size: 18.6667px;">Note: Stock must be bought before being sold.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong style="font-size: 14pt;">Input: </strong><span style="font-size: 14pt;">prices[] = [7, 10, 1, 3, 6, 9, 2]<br></span><strong style="font-size: 14pt;">Output:</strong><span style="font-size: 14pt;"> 8<br></span><strong style="font-size: 14pt;">Explanation:</strong><span style="font-size: 14pt;"> You can buy the stock on day 2 at price = 1 and sell it on day 5 at price = 9. Hence, the profit is 8.</span></span></pre>
<pre><span style="font-size: 14pt;"><strong style="font-size: 14pt;">Input: </strong><span style="font-size: 14pt;">prices[] = [7, 6, 4, 3, 1]<br></span><strong style="font-size: 14pt;">Output:</strong><span style="font-size: 14pt;"> 0 <br></span><span style="font-size: 18.6667px;"><strong>Explanation</strong></span><strong style="font-size: 14pt;">:</strong><span style="font-size: 14pt;"> Here the prices are in decreasing order, hence if we buy any day then we cannot sell it at a greater price. Hence, the answer is 0.<br></span></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>prices[] = [1, 3, 6, 9, 11]</span><br><span style="font-size: 14pt;"><strong>Output:</strong> 10 </span><br><span style="font-size: 14pt;"><span style="font-size: 18.6667px;"><strong>Explanation</strong></span><strong style="font-size: 14pt;">:</strong><span style="font-size: 14pt;"> Since the array is sorted in increasing order, we can make maximum profit by buying at price[0] and selling at price[n-1].</span></span></pre>
<p><span style="font-size: 14pt;"><strong>Constraint:</strong><br>1&nbsp;</span><span style="background-color: #ffffff; color: #1e2229; font-family: Nunito; font-size: 17px;">≤</span><span style="background-color: #ffffff; color: #1e2229; font-family: Nunito; font-size: 17px;"> </span><span style="font-size: 14pt;">&nbsp;prices.size()&nbsp;</span><span style="background-color: #ffffff; color: #1e2229; font-family: Nunito; font-size: 17px;">≤</span><span style="background-color: #ffffff; color: #1e2229; font-family: Nunito; font-size: 17px;"> </span><span style="font-size: 14pt;">&nbsp;10</span><sup>5<br></sup><span style="font-size: 14pt;">0&nbsp;</span><span style="background-color: #ffffff; color: #1e2229; font-family: Nunito; font-size: 17px;">≤</span><span style="background-color: #ffffff; color: #1e2229; font-family: Nunito; font-size: 17px;"> </span><span style="font-size: 14pt;">&nbsp;prices[i] </span><span style="background-color: #ffffff; color: #1e2229; font-family: Nunito; font-size: 17px;">≤</span><span style="background-color: #ffffff; color: #1e2229; font-family: Nunito; font-size: 17px;"> &nbsp;</span><span style="font-size: 14pt;">10</span><sup>4</sup></p>

**Expected Complexities:**

Time Complexity: O(n)  
Auxiliary Space: O(1)
