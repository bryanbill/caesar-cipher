public class Encoding {

    public  String encode(int key, String payload) {
       // Encrypt to Caesar cipher
       StringBuilder sb = new StringBuilder();
       for (char c : payload.toCharArray()) {
           sb.append((char)(c + key));
       }
       return sb.toString();
    }
}
