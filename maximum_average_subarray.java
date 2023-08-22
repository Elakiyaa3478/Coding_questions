Maximum Average Subarray I

You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.


Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:

Input: nums = [5], k = 1
Output: 5.00000

  
  #SOLUTION 
  class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int flag=0;
        for(int i=0;i<k;i++)
        {
           sum+=nums[i];
        }
        double avg=sum;
        int temp=0;
        for(int i=0;i<=nums.length-k;i++)
        {
            temp=0;
            for(int j=i;j<i+k;j++)
            {
               temp+=nums[j];
            }
            if(temp>sum)
            {
                flag=1;
                sum=temp;
                avg=(double)temp/k;
                System.out.println(avg);
            }
        }
       if(flag==0)
       {
           avg=avg/k;
           return avg;
       }
        return avg;
       
    }
}
