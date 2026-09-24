package universitystudy;

public class Review2 {
    public static void main(String[] args) {
        String input = args[0];
        boolean isBinary = true;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
                isBinary = false;
            }
            if (isBinary == false)
                break;
        }
        if (isBinary) {
            System.out.println("The input is a binary number.");
        } else {
            System.out.println("The input is not a binary number.");
        }
    }
}