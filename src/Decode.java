public class Decode {

    public static String decode() {
        // Decode Caesar Cipher
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Helper.getPayload().length(); i++) {
            char c = Helper.getPayload().charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    sb.append((char)('A' + (c - 'A' - Helper.getKey()) % 26));
                } else {
                    sb.append((char)('a' + (c - 'a' - Helper.getKey()) % 26));
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
