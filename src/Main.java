/**
 * Main Class: Defines the app entry point
 */
public class Main {
    public static void main(String[] args) {
        Utils.print("Enter Payload: ");
        String input = Utils.readString();
        Utils.print("Enter Shift Key (1-25): ");
        int shift = Utils.readInt();

        // Set Helper Values
        Helper.setKey(shift);
        Helper.setPayload(input);
         String output = new Encoding().encode();
        Utils.print("Output: ");
        Utils.print("Encrypted Payload: " + output );
        Utils.print("Decrypted Payload: " + new Decode().decode(output));

    }
}