package algorithms.leet_code;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
         int [] nums = new int [] {1, 1, 0, 1, 1, 1};
         System.out.println(findMax(nums));
    }

    private static int findMax(int[] nums) {
        int max = 0;
        int currentNumberOfOnes = 0;

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == 1) {
                currentNumberOfOnes += 1;
                max = Math.max(max, currentNumberOfOnes);
            } else {
                currentNumberOfOnes = 0;
            }
        }
        return max;
    }
}
