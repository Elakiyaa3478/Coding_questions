Problem Statement
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
2
4
10 20 30 10
3
10 50 10
Sample Output 1:
20
0
Explanation Of Sample Input 1:
For the first test case,
The frog can jump from 1st stair to 2nd stair (|20-10| = 10 energy lost).
Then a jump from the 2nd stair to the last stair (|10-20| = 10 energy lost).
So, the total energy lost is 20 which is the minimum. 
Hence, the answer is 20.










SOLUTION
  public class Solution {
    public static int frogJump(int n, int heights[]) {

int dp[]=new int[n+1];
dp[0]=0;
for(int i=1;i<n;i++)
{
    int left=dp[i-1]+Math.abs(heights[i]-heights[i-1]);
    int right=Integer.MAX_VALUE;
    if(i>1)
    {
        right=dp[i-2]+Math.abs(heights[i]-heights[i-2]);
        
    }
    dp[i]=Math.min(left,right);
}
return dp[n-1];

}
}
