Minimum Characters required to make a String Palindromic


Problem Description
 
Given a string A. The only operation allowed is to insert characters at the beginning of the string.
Find how many minimum characters are needed to be inserted to make the string a palindrome string.


Problem Constraints
1 <= |A| <= 106


Input Format
The only argument given is string A.


Output Format
Return the minimum characters that are needed to be inserted to make the string a palindrome string.


Example Input
Input 1:
A = "ABC"
Input 2:
A = "AACECAAAA"


Example Output
Output 1:
2
Output 2:
2


Example Explanation
Explanation 1:
Insert 'B' at beginning, string becomes: "BABC".
Insert 'C' at beginning, string becomes: "CBABC".
Explanation 2:
Insert 'A' at beginning, string becomes: "AAACECAAAA".
Insert 'A' at beginning, string becomes: "AAAACECAAAA".



  #SOLUTION
  
 public class Solution {

    public static int minCharsforPalindrome(String str) {
        //Write your code here
        int i=0;
        int j=str.length()-1;
        int trim=str.length()-1;
        int res=0;
        while(i<j)
        {
            if(str.charAt(i)==str.charAt(j))
            {
                i++;
                j--;
            }
            else{
                res++;
                i=0;
                j=--trim;

            }
        }
        return res;
    }

}
