
Rotate array by K elements


Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.

Examples:

Example 1:
Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
Output: 6 7 1 2 3 4 5
Explanation: array is rotated to right by 2 position .

Example 2:
Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left 
Output: 9 10 11 3 7 8
Explanation: Array is rotated to right by 3 position.

  
#SOLUTION

import java.util.* ;
import java.io.*; 
class Solution {
	 void reverse(int[] arr,int i,int j)
		 {
			 int start=i;
			 int end=j;
			 while(start<=end)
			 {
				 int temp=arr[start];
				 arr[start]=arr[end];
				 arr[end]=temp;
				 start++;
				 end--;
			 }
		 }
		 
	public static void main(String args[]) {
		
	     Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 for(int i=0;i<n;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		 int k=sc.nextInt();
		 Solution obj=new Solution();
		 obj.reverse(arr,0,k-1);
		 obj.reverse(arr,k,arr.length-1);
		 obj.reverse(arr,0,arr.length-1);
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.print(arr[i]+" ");
		 }
		
	}
}
