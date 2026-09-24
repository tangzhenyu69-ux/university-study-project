package universitystudy;

public class Max1D {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(args[i + 1]);
        }
        int max = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        System.out.println(max);
    }
}
