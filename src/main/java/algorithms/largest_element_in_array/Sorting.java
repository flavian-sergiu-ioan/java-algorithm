package algorithms.largest_element_in_array;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int [] nums = new int[]{3, 2, 1, 5, 6, 4};
        int k = 2;
        Arrays.sort(nums);//1, 2, 3, 4, 5, 6
        System.out.println(nums[nums.length - k]);
    }
}
