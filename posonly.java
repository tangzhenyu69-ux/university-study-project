package universitystudy;

import java.util.Arrays;

public class posonly {

    public static int[] posonly(int[] arr) {
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos++;
            }
        }
        int[] out = new int[pos];
        int slow = 0;
        for (int fast = 0; fast < arr.length; fast++) {
            if (arr[fast] > 0) {
                out[slow] = arr[fast];
                slow++;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(posonly(new int[] { 2, 5, 0, -1, 3 })));
    }
}
