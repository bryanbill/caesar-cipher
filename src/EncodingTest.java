import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncodingTest {

    @Test
    void encode() {
        Helper.setKey(2);
        Helper.setPayload("HI");
        Encoding encoding = new Encoding();
        assertEquals("JK", encoding.encode());
    }
}