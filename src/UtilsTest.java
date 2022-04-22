import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @org.junit.jupiter.api.Test
    void readString() {
        //Expect a String
        String expected = "Hello";
        String actual = Utils.readString();
        assertEquals(expected, actual);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void readInt() {
        //Expect an Integer
        int expected = 5;
        int actual = Utils.readInt();
        assertEquals(expected, actual);
    }

}