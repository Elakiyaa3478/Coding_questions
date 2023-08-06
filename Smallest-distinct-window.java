SMALLEST DISTINCT WINDOW
  
Given a string 's'. The task is to find the smallest window length that contains all the characters of the given string at least one time.
For eg. A = aabcbcdbca, then the result would be 4 as of the smallest window will be dbca.
  
Example 1:

Input : "AABBBCBBAC"
Output : 3
Explanation : Sub-string -> "BAC"
  
Example 2:
Input : "aaab"
Output : 2
Explanation : Sub-string -> "ab"

  
#SOLUTION

HashSet<Character> st= new HashSet<Character>();
        for(int i=0;i<s.length();i++)
        {
            st.add(s.charAt(i));
        }
        int len=st.size();
        LinkedHashMap<Character,Integer> mpp=new LinkedHashMap<Character,Integer>();
        int minlen=s.length();
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            if(mpp.containsKey(s.charAt(i)))
            {
                mpp.put(s.charAt(i),mpp.get(s.charAt(i))+1);
            }
            else{
                mpp.put(s.charAt(i),1);
            }
            if(mpp.size()==len)
            {
                while(mpp.get(s.charAt(j))>1)
                {
                    mpp.put(s.charAt(j),mpp.get(s.charAt(j))-1);
                    j++;
                }
                minlen=Math.min(minlen,i-j+1);
            }
           
        }
        System.out.print((minlen));
