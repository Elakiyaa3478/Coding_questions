
Move all Zeros to the end of the array
  

Problem Statement:
You are given an array of integers, your task is to move all the zeros in the array to the end of the array and move non-negative integers
to the front by maintaining their order.
  
Example 1:
Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

Example 2:
Input: 1,2,0,1,0,4,0
Output: 1,2,1,4,0,0,0
Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

  
#SOLUTION

public class Solution {
        public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        int i=0;
        for(i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                break;
            }
        }
        int j=i+1;
        while(j<n)
        {
            if(a[j]!=0)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
            }
            j++;
        }
        return a;
    }
}
