FIND THE CLOSEST PAIR FROM TWO ARRAYS
Given two sorted arrays arr and brr and a number x,find the pair whose sum is closest to x and the pair has an element from each array.In the case of multiple closest pairs return any one of them.

Example 1:
Input N=4,M=4
arr[]={1,4,5,7};
brr[]={10,20,30,40};
X=32

Output : 1
Explanation :
The closest pair whose sum is closest to 32 is {1,30}=31


Example 2:
Input: N=4 , M=4
arr[]={1,4,5,7};
brr[]={10,20,30,40}
X=50

Output:3
Explanation :
The closest pair whose sum is closest to 50 is {7,40}=47

Solution
//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String[] element = br.readLine().split(" ");
		    int N = Integer.parseInt(element[0]);
		    int M = Integer.parseInt(element[1]);
		    int arr [] = new int[N];
		    int brr [] = new int[M];
		    String[] elements = br.readLine().split(" ");
		    for(int i=0; i<N; i++)
		        arr[i] = Integer.parseInt(elements[i]);
		        
		    String[] ele = br.readLine().split(" ");
		    for(int i=0; i<M; i++)
		        brr[i] = Integer.parseInt(ele[i]);
		    
		    int X = Integer.parseInt(br.readLine());
		    
		    Solution obj = new Solution();
		    ArrayList<Integer> ans;
		    ans = obj.printClosest(arr, brr, N, M, X);
		    System.out.println(Math.abs(ans.get(0) + ans.get(1) - X));
		}
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    // Function for finding maximum and value pair
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        // code here
        ArrayList<Integer> li=new ArrayList<Integer>();
        int min=Integer.MAX_VALUE;
        int i=0;
        int j=m-1;
        int key=0;
        int value=0;
        while(i<arr.length && j>=0)
        {
            if(Math.abs(arr[i]+brr[j]-x)<min)
            {
                min=Math.abs(arr[i]+brr[j]-x);
                key=arr[i];
                value=brr[j];
                
            }
            if(arr[i]+brr[j]>x)
            {
                j--;
            }
            else{
                i++;
            }
        }
        li.add(key);
        li.add(value);
        return li;
        
    }
}
