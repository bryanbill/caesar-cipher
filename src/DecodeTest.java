import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeTest {

    @Test
    void decode() {
        Helper.setKey(2);
        Helper.setPayload("HI");
        Decode d = new Decode();
        assertEquals("HI", d.decode(new Encoding().encode()));
    }
}