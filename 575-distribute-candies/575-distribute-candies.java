import java.util.*;
class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer>set=new HashSet<>(candyType.length);
        for(int i: candyType)
            set.add(i);
        return Math.min(set.size(),candyType.length/2);
    }
}