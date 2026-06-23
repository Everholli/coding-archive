class Solution {
    public int maxArea(int[] nums) {
        int left = 0;
        int ryt = nums.length - 1;
        int res = 0;

        while(left < ryt){
            int width = ryt - left;
            int height = Math.min(nums[left], nums[ryt]);
            res = Math.max(res, height*width );

            if(nums[left] < nums[ryt]) left++;
            else ryt--;
        }
        return res;
    }
}