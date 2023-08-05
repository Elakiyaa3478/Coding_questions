Find Second Smallest and Second Largest Element in an array
  
Problem Statement: Given an array, find the second smallest and second largest element in the array. 
Print ‘-1’ in the event that either of them doesn’t exist.


#SOLUTION


public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.

        int largest=a[0];
        int secondlargest=-1;
        for(int i=1;i<n;i++)
        {
            if(a[i]>largest)
            {
                secondlargest=largest;
                largest=a[i];
            }
            if(a[i]<largest && a[i]>secondlargest)
            {
                secondlargest=a[i];
            }
        }
         int smallest=Integer.MAX_VALUE;
        int secondsmallest=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<smallest)
            {
                secondsmallest=smallest;
                smallest=a[i];
            }
            if(a[i]>smallest && a[i]<secondsmallest)
            {
                secondsmallest=a[i];
            }
        }
        int temp[]={secondlargest,secondsmallest};
        return temp;
       
    }
}
