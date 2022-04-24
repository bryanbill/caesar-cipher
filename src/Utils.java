import java.util.Scanner;

public class Utils {

    private static String read( ){

        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * Reads a string from the console.
     * @return string
     */

    public static String readString(){
        // By default, the next line is read as a string.
        // Sanitize the input.
        String input =  read();
        // Check if the input is empty.
        if(input.isEmpty() ){
            throw new RuntimeException("Empty input!");
        }
        return input;
    }

    /**
     * Reads a string from the console and converts it to an integer.
     * @return int
     */
    public static int readInt(){
       //        Int input should be 1-25;
        int key;
       try {
           key= Integer.parseInt(read());
       }catch (NumberFormatException e){
           throw new RuntimeException(e);
       }
       if(key<1 || key>25){
           throw new RuntimeException("Invalid input!");
       }
       return key;
    }

    /**
     * Prints a string to the console.
     * @param s
     */

    public static void print(String s){
        System.out.println(s);
    }


}


