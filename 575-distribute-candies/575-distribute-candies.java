import java.util.*;
class Solution {
    public int distributeCandies(int[] candyType) {
        boolean[] arr=new boolean[200001];
        int max=candyType.length/2,count=0;
        for(int i:candyType)
        {
            int candy=i+100000;
            if(!arr[candy])
            {
                if(++count==max)
                    return max;
                arr[candy]=true;
            }
        }
         return count;
}
}