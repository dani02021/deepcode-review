package bg.daniel.review;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    public static int readNumber() {
        return readNumber(Integer.MAX_VALUE-1);
    }

    public static int readNumber(int max) {
        try {
            Scanner scan = new Scanner(System.in);

            int input = scan.nextInt();
            if(input > max)
                return -1;

            return input;
        } catch(InputMismatchException e) {
            return -1;
        }
    }

    public static Class<?> loadClass(String name) {
        try {
            return Class.forName("bg.daniel.review.units."+name);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
