package algorithms.rotate_array;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int k = 3;
        array = rotate(array, k);
        print(array);
    }

    public static int[] rotate(int[] nums, int k) {
        if (nums == null || nums.length==0 || k < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }
         for (int i = 0; i< k; i++) {
             for (int j = nums.length -1; j>0; j--) {
                 int temp = nums[j];
                 nums[j] = nums[j-1];
                 nums[j-1] = temp;
             }
         }
         return nums;
    }

    public static void print(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
