package Java_Advance.esTesting1;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing = new Main();
    @org.junit.jupiter.api.Test
    void sum() {
        int result = testing.sum(2,2);
        assertEquals(result , 4 , "dovrebbe essere 4");
    }
}