import org.junit.jupiter.api.*;

public class SimpleJUnitTest {

    int result;

    @BeforeAll
    static void beforeAll(){
        System.out.println("BeforeAll");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("BeforeEach");
        result=getResult();
    }

    @AfterEach
    void afterEach(){
        System.out.println("afterEach\n");
    }

    @Test
    void firstTest(){
        System.out.println("1111");
        Assertions.assertTrue(result>2);
    }

    @Test
    void secondTest(){
        System.out.println("2222");
        Assertions.assertTrue(3>2);
    }

    @Test
    void thirdTest(){
        System.out.println("3333");
        Assertions.assertTrue(3>2);
    }

    @Test
    void fourTest(){
        System.out.println("4444");
        Assertions.assertTrue(3>2);
    }

    private int getResult(){
        return 3;
    }
}
