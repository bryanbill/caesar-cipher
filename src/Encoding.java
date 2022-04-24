public class Encoding {
    private int key;
    private String payload;
    public  Encoding(int key, String payload){
        this.key = key;
        this.payload = payload;
    }

    public  String encode(){
        String encoded = "";
        for(int i = 0; i < payload.length(); i++){
            encoded += (char)(payload.charAt(i) + key);
        }
        return encoded;
    }
}
