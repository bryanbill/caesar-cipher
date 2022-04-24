public class Decode {
    private int key;
    private  String payload;
    public Decode(int key, String payload){
        this.key = key;
        this.payload = payload;
    }

    public String decode(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < payload.length(); i++){
            int c = payload.charAt(i);
            c = c - key;
            sb.append((char)c);
        }
        return sb.toString();
    }

}
