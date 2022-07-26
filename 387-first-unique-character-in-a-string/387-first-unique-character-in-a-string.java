import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
      int[] arr=new int[26];
        int min=s.length();
      for(char c: s.toCharArray())  
          arr[c-'a']++;
      for(int i=0;i<26;i++)
          if(arr[i]==1)
          {
               int index=s.indexOf((char)(i+97));
              if(min>index)
                  min=index;
          }
        return min<s.length()?min:-1;
    }
}