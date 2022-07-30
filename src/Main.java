public class Main {

    public static void main(String[] args) {
        // Step 1
        double myFirstValue = 20D;

        // Step 2
        double mySecondValue = 80D;

        // Step 3
        double myValuesTotal = 100 * (myFirstValue + mySecondValue);

        // Step 4
        double theRemainder = myValuesTotal % 40D;

        // Step 5
        boolean remainder = (theRemainder == 0);

        // Step 6
        System.out.println("remainder = " + theRemainder);

        // Step 7
        if (!remainder) {
            System.out.println("Got some remainder");
        }
    }
}
