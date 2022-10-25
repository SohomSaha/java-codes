class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        char c1,c2;
        int a=0,b=0,c=0,d=0;
        do
        {
            c1=word1[a].charAt(b);
            c2=word2[c].charAt(d);
            if(c1!=c2)
                return false;
            if(b==word1[a].length()-1)
            {a++;b=0;}
            else
                b++;
            if(d==word2[c].length()-1)
            {c++;d=0;}
            else
                d++;
            if((a==word1.length&&c!=word2.length)||(a!=word1.length&&c==word2.length))
                return false;
        }while(a!=word1.length&&c!=word2.length);
        return true;
    }
}