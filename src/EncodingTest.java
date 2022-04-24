import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncodingTest {

    @Test
    void encode() {
        Encoding encoding = new Encoding();
        assertEquals("JK", encoding.encode(2,  "HI"));
    }
}