/**
 * Main Class: Defines the app entry point
 */
public class Main {
    public static void main(String[] args) {
        Utils utils = new Utils();
        utils.print("Enter the number of rows: ");

        String input = utils.readString();

        utils.print(input);

    }
}