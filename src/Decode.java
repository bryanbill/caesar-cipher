public class Decode {

    public static String decode(int key, String s) {
        // Decode Caesar Cipher
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    sb.append((char)('A' + (c - 'A' - key) % 26));
                } else {
                    sb.append((char)('a' + (c - 'a' - key) % 26));
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
