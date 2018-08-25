import java.util.Scanner;

public class IPAddress {
    public static void main(String[] args) {
        String[] outputString;
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        outputString = getOutputString(input);

        OutputMethod(outputString);
    }

    private static String[] getOutputString(String input) {
        String[] ret = new String[4];
        for (int i = 0; i < 4; i++) {
            int temp = 0;
            for (int j = 0; j < 8; j++) {
                temp = input.charAt(i * 8 + j) - '0' + (temp << 1);
            }
            ret[i] = "" + temp;
        }
        return ret;
    }

    private static void OutputMethod(String[] outputString) {
        for (int i = 0; i < 3; i++) {
            System.out.print(outputString[i] + ".");
        }
        System.out.print(outputString[3]);
    }
}