public class Encoding {

    public  String encode() {
       // Encrypt to Caesar cipher
       StringBuilder sb = new StringBuilder();
       for (char c : Helper.getPayload().toCharArray()) {
           sb.append((char)(c + Helper.getKey()));
       }
       return sb.toString();
    }
}
