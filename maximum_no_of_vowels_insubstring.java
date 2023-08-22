Maximum Number of Vowels in a Substring of Given Length

Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

 

Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
Example 2:

Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.
Example 3:

Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.



  #SOLUTION
 //USING SLIDING WINDOW
  class Solution {
    public int maxVowels(String s, int k) {
        String vowels="aeiouAEIOU";
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++)
        {
            if(vowels.contains(""+s.charAt(i)))
            {
                count++;
            }
        }
        max=Math.max(count,max);
        int start=0;
        for(int j=k;j<s.length();j++)
        {
            if(vowels.contains(""+s.charAt(start)))
            {
                count--;
            }
            start++;
            if(vowels.contains(""+s.charAt(j)))
            {
                count++;
                 max=Math.max(count,max);
            }
            
        }
        return max;
        
    }
}
