import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeTest {

    @Test
    void decode() {
        Decode d = new Decode(0, "B");
        assertEquals("a", d.decode());
    }
}