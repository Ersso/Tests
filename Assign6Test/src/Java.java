import org.junit.jupiter.api.Test;

public class Java {
    @Test
    void setup() {
        System.out.println("Open browser");
    }
    @Test
    void login() {
        System.out.println("This is login test.");
    }
    @Test
    void teardown(){
        System.out.println("Closing browser");
    }
}
//For testing the thing