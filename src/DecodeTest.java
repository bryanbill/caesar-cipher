import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeTest {

    @Test
    void decode() {
        Decode d = new Decode();
        assertEquals("HI", d.decode(2, "JK"));
    }
}