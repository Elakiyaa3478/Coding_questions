Remove and Reverse
Medium
  
Given a string S which consists of only lowercase English alphabets, you have to perform the below operations:
If the string S contains any repeating character, remove the first repeating character and reverse the string and again perform the above operation on the modified string, otherwise, you stop.
You have to find the final string.

Input: S = "abab"
Output: ba
Explanation:
In 1st operation: The first repeating 
character is a. After Removing the first 
character, S = "bab". After Reversing the 
string, S = "bab".
In 2nd operation: The first repeating 
character is b. After Removing the first 
character, S = "ab". After Reversing the 
string, S = "ba".
Now the string S does not contain any 
repeating character.

#SOLUTION


import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        int i=0;
        StringBuffer st=new StringBuffer(s);
        while(i<st.length())
        {
            if(st.charAt(i)!='#' && freq[st.charAt(i)-'a']>1)
            {
                freq[st.charAt(i)-'a']--;
                st.replace(i,i+1,"#");
                
                st.reverse();
               
                i=0;
                continue;
            }
            i++;
        }
 
        String ans="";
        for(int j=0;j<st.length();j++)
        {
            if(st.charAt(j)!='#')
            {
                ans+=st.charAt(j);
            }
        }
        System.out.print(ans);
    }
}
