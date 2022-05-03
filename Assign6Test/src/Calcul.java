import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.junit.jupiter.api.Test;

public class Calcul {

    @BeforeMethod
    void beforeMethod(){
        System.out.println("This will happen before every Method");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("This will happen after every Method");
    }
    @Test
    void test1(){
        System.out.println("this is test1...");
    }
    @Test
    void test2(){
        System.out.println("this is test2...");
    }
}
