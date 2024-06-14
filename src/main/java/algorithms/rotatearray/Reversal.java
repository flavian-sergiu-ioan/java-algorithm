package algorithms.rotatearray;

public class Reversal {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int k = 2;
        array = rotate(array, k);
        print(array);
    }

    public static int[] rotate(int[] nums, int k) {
        if (nums == null || nums.length==0 || k < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        if (k > nums.length) {
            k = k % nums.length;
        }

        int a = nums.length - k;

        reverse(nums, 0, a -1);
        reverse(nums, a, nums.length-1);
        reverse(nums, 0, nums.length-1);

        return nums;
    }

    private static void reverse(int[] nums, int left, int right) {
        if(nums==null || nums.length ==1) {
            return;
        }

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }

    public static void print(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
