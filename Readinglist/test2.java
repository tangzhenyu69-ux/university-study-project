package universitystudy.Readinglist;

public class test2 {
    public static void main(String[] args) {
        String[] arr = new String[] { "111", "222" };
        System.out.println(arr.length);
        String[] arr2 = new String[arr.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i];
        }
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
    }
}
