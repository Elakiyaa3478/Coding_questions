Bulls and Cows
Programming
Strings
Medium


68

10

Bookmark
Asked In:
Problem Description
 
 

 You are playing the Bulls and Cows game with your friend.

You write down a secret number and ask your friend to guess what the number is. When your friend makes a guess, you provide a hint with the following info:

The number of "bulls", which are digits in the guess that are in the correct position.
The number of "cows", which are digits in the guess that are in your secret number but are located in the wrong position. 
Specifically, the non-bull digits in the guess that could be rearranged such that they become bulls. 
Given the secret number secret and your friend's guess guess, return the hint for your friend's guess.

The hint should be formatted as "xAyB", where x is the number of bulls and y is the number of cows. Note that both secret and guess may contain duplicate digits.



Problem Constraints
1 <= secret.length, guess.length <= 100000
secret.length == guess.length
secret and guess consist of digits only.


Example Input
Input 1:
secret = "1807", guess = "7810"
Input 2:

secret = "1123", guess = "0111"


Example Output
Ouput 1:
"1A3B"
Ouput 2:

"1A1B"


Example Explanation
Explanation 1:
Bulls are connected with a '|':
"1807"
  |
"7810"
Explanation 2:

Bulls are connected with a '|' 
"1123"        "1123"
  |      or     |
"0111"        "0111"
Note that only one of the two unmatched 1s is counted as a cow since 
the non-bull digits can only be rearranged to allow one 1 to be a bull.





#SOLUTION
public class Solution {
    public String solve(String A, String B) {
        String m="";
        int c1=0;
        int c2=0;
        int a1[]=new int[A.length()];
        int a2[]=new int[B.length()];
        for(int i=0;i<A.length();i++)
        {
            
                if(B.charAt(i)==A.charAt(i))
                {
                    c1++;
                }
                else
                {
                    a1[A.charAt(i)-'0']++;
                    a2[B.charAt(i)-'0']++;
                }
            
        }
        for(int i=0;i<A.length();i++)
        {
            c2+=Math.min(a1[i],a2[i]);
        }
        m+=Integer.valueOf(c1);
        m+="A";
        m+=Integer.valueOf(c2);
        m+="B";
        return m;
    }
}
