package universitystudy;

public class Transpose {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int c = Integer.parseInt(args[1]);
        int t = 2;
        int[][] a = new int[r][c];
        int[][] b = new int[c][r];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = Integer.parseInt(args[t]);
                t++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = a[j][i];
            }
        }
        System.out.print(c + " " + r);
        for (int i = 0; i < b.length; i++) {
            System.out.println();
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
    }
}
