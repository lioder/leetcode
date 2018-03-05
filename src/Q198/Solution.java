package Q198;

/**
 * Created by Kry·L on 2018/3/5.
 */
public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        if (nums.length > 1) {
            dp[1] = Math.max(nums[1],dp[0]);
        }
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.rob(new int[]{3, 1, 5, 8}));
    }
}
