package bg.daniel.review;

public class Main {
    /**
     *
     * @author Daniel Gyudzhenev
     * @version 1.0.0-SNAPSHOT
     *
     * Description:
     * Testing the compatibilities of DeepCode with different code examples
     * For more information visit: deepcode.ai
     */

    public static void main(String[] args) {
        System.out.println("Starting unit tests...");

        displayMain();
    }

    public static void displayMain() {
        String message = "Please select one of the following:" + "\n" +
        				"(1) Select unit tests" + "\n" +
        				"(2) Settings" + "\n" +
        				"(3) Exit";
        
        System.out.println(message);

        int result = -1;

        while(result <= 0) {
            result = Utils.readNumber(4);

            if(result <= 0) {
                System.out.println(message);
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
