import java.util.Arrays;
class Solution {
    public String[] findWords(String[] words) {
        int l=words.length-1;   String[] nwords=new String[l+1];
         String r1="eiopqrtuwy";
        String r2="adfghjkls";int c1=0;
        String r3="bcmnvxz";
        for(int i=0;i<=l;i++)
        { String w=words[i].toLowerCase();
         int w1=0,w2=0,w3=0;
            for(int j=0;j<words[i].length();j++)
            {
            String c=Character.toString(w.charAt(j));
           if(r1.contains(c)==true)
               w1++;
                else if(r2.contains(c)==true)
                    w2++;
                else if(r3.contains(c)==true)
                    w3++;   
            }
         if((w1==words[i].length())||(w2==words[i].length())||(w3==words[i].length()))
         { nwords[c1]=words[i];c1++;}
        }
        String[] nnwords=Arrays.copyOfRange(nwords,0,c1);
        return nnwords;
    }
}