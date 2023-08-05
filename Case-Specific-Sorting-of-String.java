Case-specific Sorting of Strings
Medium


Given a string S consisting of only uppercase and lowercase characters. 
The task is to sort uppercase and lowercase letters separately such that if the ith place in the original string had an Uppercase character then it should not have a lowercase character after being sorted and vice versa.


Example 1:

Input:
N = 12
S = defRTSersUXI
Output: deeIRSfrsTUX
Explanation: Sorted form of given string
with the same case of character as that
in original string is deeIRSfrsTUX
Example 2:

Input:
N = 6
S = srbDKi
Output: birDKs
Explanation: Sorted form of given string
with the same case of character will
result in output as birDKs.
Your Task:
You only need to complete the function caseSort that takes a string str and length of the string n and returns sorted string.



#SOLUTION
  
class Solution
{
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str)
    {
     
     int upper=0;
     int lower=0;
       for(int i=0;i<str.length();i++)
       {
           if(str.charAt(i)>=65 && str.charAt(i)<=90)
           {
               upper++;
           }
           else
           {
               lower++;
           }
       }
      char arr1[]=new char[upper];
      char arr2[]=new char[lower];
      int p=0;
      int q=0;
        for(int i=0;i<str.length();i++)
        {
            if((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90)
            {
               arr1[p]=str.charAt(i);
               p++;
            }
            else
            {
               arr2[q]=str.charAt(i);
               q++;
            }
        }
       p=0;
       q=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>=65 && str.charAt(i)<=90)
            {
                sb.append(arr1[p]);
                p++;
            }
            else
            {
                sb.append(arr2[q]);
                q++;
            }
        }
        
        return sb.toString();
    }
}
