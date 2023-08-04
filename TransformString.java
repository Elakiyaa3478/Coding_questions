Transform String
Medium
  
Given two strings A and B. Find the minimum number of steps required to transform string A into string B. 
The only allowed operation for the transformation is selecting a character from string A and inserting it in the beginning of string A.

Example 1:

Input:
A = "abd"
B = "bad"
Output: 1
Explanation: The conversion can take place in
1 operation: Pick 'b' and place it at the front.
  
Example 2:

Input:
A = "GeeksForGeeks"
B = "ForGeeksGeeks"
Output: 3
Explanation: The conversion can take
place in 3 operations:
Pick 'r' and place it at the front.
A = "rGeeksFoGeeks"
Pick 'o' and place it at the front.
A = "orGeeksFGeeks"
Pick 'F' and place it at the front.
A = "ForGeeksGeeks"

Your Task: 
You dont need to read input or print anything. 
Complete the function transform() which takes two strings A and B as input parameters and returns the minimum number of steps required to transform A into B. If transformation is not possible return -1.


#SOLUTION
class Solution
{
    int transform (String A, String B)
    {
        // code here
        int count=0;
        int count1=0;
        int count2=0;
        if(A.length()!=B.length())
        {
            return -1;
        }
        for(int i=0;i<A.length();i++)
          {
              count1+=(int)A.charAt(i);
              count2+=(int)B.charAt(i);
              if(!B.contains(""+A.charAt(i)) || !A.contains(""+B.charAt(i)))
              {
                  return -1;
              }
          }
          if(count1!=count2)
          {
              return -1;
          }
       
            int i=A.length()-1;
            int j=B.length()-1;
            while(i>=0 && j>=0)
            {
                if(A.charAt(i)==B.charAt(j))
                {
                    j--;
                    i--;
                }
                else
                {
                  
                    i--;
                    count++;
                    
                }
            }
            return count;
        
       
    }
}

