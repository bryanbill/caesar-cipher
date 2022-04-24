public class Encoding {

    public  String encode() {
        String output = "";
        char ch;
        for(int i = 0; i < Helper.getPayload().length(); ++i){
            ch = Helper.getPayload().charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch + Helper.getKey());

                if(ch > 'z'){
                    ch = (char)(ch - 'z' + 'a' - 1);
                }

                output += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + Helper.getKey());

                if(ch > 'Z'){
                    ch = (char)(ch - 'Z' + 'A' - 1);
                }

                output += ch;
            }
            else {
                output += ch;
            }
        }
        return output;
    }
}

