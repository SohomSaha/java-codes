class Solution {
public int removeDuplicates(int[] nums) {
	int result = 1;
	int p1 = 0;
	int p2 = 1;

	while (p2 < nums.length) {
		if (nums[p1] != nums[p2]) {
			nums[result++] = nums[p2];
			p1 = p2;
		}

		p2 += 1;
	}

	return result;
}
}