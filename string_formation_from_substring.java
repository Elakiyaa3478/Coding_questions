Given a string s, the task is to check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. 
Input: s = "ababab"
Output: 1
Explanation: It is contructed by 
appending "ab" 3 times

Input: s = "ababac"
Output: 0
Explanation: Not possible to construct



  #SOLUTION

  class Solution {
    int isRepeat(String s) {
          String m="";
        String p="";
        for(int i=1;i<s.length();i++)
        
       
        {
            m=s.substring(0,i);
            int l=0;
            p="";
            while(l<s.length())
            {
                p+=m;
                l=p.length();
            }
            if(p.equals(s))
            {
                return 1;
            }


        }
        return 0;
          
    }
}
