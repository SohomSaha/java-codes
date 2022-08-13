class Solution {
    public int jump(int[] nums) {
       return bottomUpDp(nums);
    }
   public int bottomUpDp(int[] nums) {
		int n = nums.length;
		int[] output = new int[n];
		for (int start = n - 2; start >= 0; start--) {
			int min = 10001;
			for (int i = start + 1; i <= start + nums[start]; i++) {
				min = Math.min(min, 1 + (i>=n ? 0 : output[i]));
			}
			output[start] = min;
		}
		return output[0];
	}
}