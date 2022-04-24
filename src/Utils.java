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
//        By default, the next line is read as a string.
        return read();
    }

    /**
     * Reads a string from the console and converts it to an integer.
     * @return int
     */
    public static int readInt(){
       try {
           return Integer.parseInt(read());
       }catch (NumberFormatException e){
           throw new RuntimeException(e);
       }
    }

    /**
     * Prints a string to the console.
     * @param s
     */

    public static void print(String s){
        System.out.println(s);
    }


}


