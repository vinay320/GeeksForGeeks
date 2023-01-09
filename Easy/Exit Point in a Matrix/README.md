<h2><a href="https://practice.geeksforgeeks.org/problems/exit-point-in-a-matrix0905/1">Exit Point in a Matrix</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a matrix of size n x m with 0’s and 1’s , you enter the matrix at cell (0,0) in left to right direction. whenever you encounter a 0 you retain in same direction , if you encounter a 1’s you have to change direction to right of current direction and change that 1 value to 0, you have to find out from which index you will leave the matrix at the end.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>matrix = {{0, 1, 0},
{0, 1, 1}, {0, 0, 0}}
<strong>Output: </strong>1 0
<strong>Explanation: W</strong>e enter at 0,0 then move towards 
0,1 and we encountered a 1 so we turned right 
and moved towards 1,1 and again we encountered 
a 1 so we turned right and moved towards 1,0 after
which we leave the matrix.</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>matrix = {{0, 0}}
<strong>Output: </strong>0 1</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read or print anyhting.&nbsp;Your task is to complete the function&nbsp;<strong>FindExitPoint()&nbsp;</strong>which takes the matrix as input parameter and returns a list containg the exit point.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(n * m) where n is number of rows and m is number of columns.<br>
<strong>Expected Space Complexity:&nbsp;</strong>O(1)</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= n, m &lt;= 100</span></p>
</div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Samsung</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Matrix</code>&nbsp;<code>Data Structures</code>&nbsp;