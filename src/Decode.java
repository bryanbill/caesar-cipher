public class Decode {

    public static String decode(String encrypted) {
        char ch;
        String decrypted = "";
        for(int i = 0; i < encrypted.length(); ++i){
            ch = encrypted.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - Helper.getKey());

                if(ch < 'a'){
                    ch = (char)(ch + 'z' - 'a' + 1);
                }

                decrypted += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch - Helper.getKey());

                if(ch < 'A'){
                    ch = (char)(ch + 'Z' - 'A' + 1);
                }

                decrypted += ch;
            }
            else {
                decrypted += ch;
            }
        }
        return  decrypted;
    }
}
