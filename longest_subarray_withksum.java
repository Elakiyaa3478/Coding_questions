
Longest Subarray with given Sum K(Positives)
Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.



#SOLUTION
  
public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int left=0;
        int right=0;
        int sum=a[0];
        int maxlen=0;
        while(right<a.length)
        {
            while(sum>k && left<=right)
            {
                sum-=a[left];
                left++;
            }

            if(sum==k)
            {
               maxlen=Math.max(maxlen,right-left+1);
            }
            right++;
            if(right<a.length)
            {
                sum+=a[right];
               
            }
        }
        return maxlen;
        
    }
}
