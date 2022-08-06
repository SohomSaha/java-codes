class Solution {
    public int poorPigs(int buckets, int md, int mt) {
        int trial=mt/md;
        return (int)Math.ceil(Math.log(buckets)/Math.log(trial+1)); 
    }
}