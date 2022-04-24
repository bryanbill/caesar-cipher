public class Helper {
    private static int key;
    private  static String payload;

    public static int getKey() {
        return key;
    }

    public static void setKey(int key) {
        Helper.key = key;
    }

    public static String getPayload() {
        return payload;
    }

    public static void setPayload(String payload) {
        Helper.payload = payload;
    }
}
