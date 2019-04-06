package bg.daniel.review;

public class Main {
    /**
     *
     * @author Daniel Gyudzhenev
     * @version 1.0.0-SNAPSHOT
     *
     * Testing the compatibilities of DeepCode with different code examples
     * For more information visit: deepcode.ai
     */

    public static void main(String[] args) {
        System.out.println("Starting unit tests...");

        displayMain();
    }

    public static void displayMain() {
        System.out.println("Please select one of the following:");
        System.out.println("(1) Select unit tests");
        System.out.println("(2) Settings");
        System.out.println("(3) Exit");

        int result = -1;

        while(result <= 0) {
            result = Utils.readNumber(4);

            if(result <= 0) {
                System.out.println("Bad input, please try again!");
            } else if(result == 1) {
                UnitManager.displayAllUnits();
            } else if(result == 2) {
                // Settings
            } else if(result == 3) {
                System.exit(0);
            }
        }
    }
}
