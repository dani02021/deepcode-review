package bg.daniel.review;

import bg.daniel.review.units.UnitTest;

public class UnitManager {
    private static void loadUnit(int result) {
        try {
            UnitTest unit = (UnitTest) Utils.loadClass(Unit.values()[result].getClassName()).newInstance();
            
            unit.init();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void displayAllUnits() {
        Unit[] units = Unit.values();

        System.out.println("Please select one of the following(Type -1 to go back):");
        for(int i = 0; i < units.length; i++) {
            System.out.println("("+(i+1)+") "+units[i].name());
        }

        int result = -1;

        while(result == -1) {
            result = Utils.readNumber();

            if(result == -1) {
                Main.displayMain();
                break;
            } else if(result <= units.length) {
                loadUnit(result-1);
            } else {
                System.out.println("Bad input, please try again!");
                result = -1;
            }
        }
    }
}

enum Unit {
    STRING_CONCATS("Unit01");

    private String className;

    Unit(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }
}