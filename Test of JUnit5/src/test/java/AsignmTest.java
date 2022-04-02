import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class AsignmTest {

    @Test
    void tom(){
        int actualLength = "ABCDE".length();
        int expectedLenght = 4;

        assertEquals(expectedLenght, actualLength);
    }
}