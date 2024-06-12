package algorithms.rotatearray;

public class IntermedateArray {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int k = 3;
        array = rotate(array, 3);
        print(array);
    }

    public static int[] rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }

        int [] result = new int[nums.length];

        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i]; //5, 6, 7
        }

        int j = 0;
        for (int i = k; i< nums.length; i++) {
            result[i] = nums[j];
            j++;
        }

        return result;
    }

    public static void print(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
