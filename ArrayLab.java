package universitystudy;

import java.util.Arrays;

public class ArrayLab {
    public static int[] twoSum(int[] nums, int target) {
        int[] out = { -1, -1 };
        if (nums.length > 1) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 1 + i; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        out[0] = i;
                        out[1] = j;
                        return out;
                    }
                }
            }
            return out;
        } else
            return out;
    }

    public static int[] moveZeroes(int[] nums) {
        int[] arr = new int[nums.length];
        int fast = 0;
        int slow = 0;
        for (int i = 0; i < arr.length; i++) {
            if (nums[fast] != 0) {
                arr[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] out = twoSum(new int[] { 1, 2, 3, 4 }, 5);
        System.out.println(Arrays.toString(out));
        int[] out2 = moveZeroes(new int[] {});
        System.out.println(Arrays.toString(out2));
    }
}
