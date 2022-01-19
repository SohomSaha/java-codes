class Solution {
    public int maxArea(int[] height) {
         int res=0;
        int n=height.length; 
        int l=1;
        int r=n;
        while(l<r){
            res=Math.max(res,Math.min(height[l-1],height[r-1])*(r-l));
            if(height[l-1]<height[r-1]){
                l++;
            }
            else{
                r--;
            }
        }
        return res;
    }
    }
