package universitystudy;

import java.util.Arrays;

public class IterativeLab {
    public static int[] plusOne(int[] digits) {
        int[] arr = new int[digits.length + 1];
        for (int i = 0; i < digits.length; i++) {
            arr[i + 1] = digits[i];
        }
        for (int i = 0; i < digits.length/* max = 3 */; i++) {
            if (arr[arr.length - 1 - i] == 9 || arr[arr.length - 1 - i] == 10) {
                arr[arr.length - 1 - i] = 0;
                arr[arr.length - 2 - i] = arr[arr.length - 2 - i] + 1;
                if (arr[arr.length - 2 - i] != 10) {
                    break;
                }
            } else {
                arr[arr.length - 1 - i] = arr[arr.length - 1 - i] + 1;
                break;
            }
        }
        if (arr[0] == 0) {
            int[] out = new int[digits.length];
            for (int i = 0; i < out.length; i++) {
                out[i] = arr[i + 1];
            }
            return out;
        } else
            return arr;

    }

    public static void reverse(int[] a, int left, int right) {
        for (int i = left; i <= (right + left) / 2; i++) {
            int temp = a[right + left - i];
            a[right + left - i] = a[i];
            a[i] = temp;
        }
        System.out.println(Arrays.toString(a));
        /*
         * int[] output = new int[a.length];
         * for (int i = 0; i < left; i++) {
         * output[i] = a[i];
         * }
         * for (int i = left, j = right; i <= right; i++, j--) {
         * output[i] = a[j];
         * }
         * for (int i = right + 1; i < a.length; i++) {
         * output[i] = a[i];
         * }
         * a = output;
         * int[] arr = new int[right - left + 1];
         * 
         * for (int i = left; i <= right; i++) {
         * arr[i - left] = a[i];
         * }
         * 
         * System.out.print("{");
         * System.out.print(a[0]);
         * for (int i = 1; i < left; i++) {
         * System.out.print(", " + a[i]);
         * }
         * for (int i = arr.length - 1; i >= 0; i--) {
         * System.out.print(", " + arr[i]);
         * }
         * for (int i = right + 1; i < a.length; i++) {
         * System.out.print(", " + a[i]);
         * }
         * System.out.print("}");
         * 
         * System.out.println(Arrays.toString(output));
         */
    }

    static int[] rotate(int[] nums, int k) {
        /*
         * if(num.length == 0) return new int[0];
         * int a = k % nums.length;
         * int[] arr = new int[nums.length];
         * for (int i = 0; i < arr.length; i++) {
         * if (i + a > arr.length - 1)
         * arr[i + a - nums.length] = nums[i];
         * else
         * arr[i + a] = nums[i];
         * }
         * return arr;
         */

        int n = nums.length;
        k = k % nums.length;
        int[] out = nums;
        if (k == 0)
            return out;
        else {
            reverse(out, 0, n - 1);
            reverse(out, 0, k - 1);
            reverse(out, k, n - 1);
            return out;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[] { 1, 9, 9 })));
        reverse(new int[] { 2, 5, 4, 3, 1, 0 }, 0, 5);
        System.out.println(Arrays.toString(rotate(new int[] { 2, 5, 4, 1, 6 }, 2)));
    }
}
