## [Swap Two Nibbles](https://www.geeksforgeeks.org/problems/swap-two-nibbles-in-a-byte0446/1)

**Difficulty:** Easy  
**Topics:** Bit Magic  

**Problem Description:**

<p><span style="font-size: 18px;">Given a number <strong>n </strong>(with value less than 256), task is to swap the two nibbles and find the resulting number.&nbsp; </span><span style="font-size: 14pt;">A nibble </span><span style="font-size: 14pt;">is a four-bit aggregation, or half an octet. There are two nibbles in a byte. For example, the decimal number 150 is represented as 10010110 in an 8-bit byte. This byte can be divided into two nibbles: 1001 and 0110.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 100
<strong>Output: </strong>70<br><strong>Explanation: </strong>100 in binary is 01100100, </span><span style="font-size: 20px;"><span style="font-size: 18px;">two nibbles are (0110) and (0100). If we swap the two nibbles, we get 01000110 which is 70 in decimal.</span></span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 129
<strong>Output: </strong>24
<strong>Explanation: </strong>129 in binary is 10000001, </span><span style="font-size: 20px;"><span style="font-size: 18px;">two nibbles are (</span></span><span style="font-size: 18px;">1000</span><span style="font-size: 20px;"><span style="font-size: 18px;">) and (</span></span><span style="font-size: 18px;">0001</span><span style="font-size: 20px;"><span style="font-size: 18px;">). If we swap the two nibbles, we get </span></span><span style="font-size: 18px;">0001</span><span style="font-size: 18px;">1000</span><span style="font-size: 20px;"><span style="font-size: 18px;"> which is 24 in decimal.</span></span></pre>

**Expected Complexities:**

Time Complexity: O(1)  
Auxiliary Space: O(1)
