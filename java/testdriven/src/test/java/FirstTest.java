import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {

    // this method will resolve before each test method
    @BeforeEach
    void beforeEachTest() {
        System.out.println("Test is running...");
    }

    @AfterEach
    void afterEachTest() {
        System.out.println("Test has resolved.");
    }

    @Test
    @DisplayName("Testing returnBool() method in Utility class")
    void returnBoolTest() {
        Boolean actual = Utility.returnBool();
        assertTrue(actual);
    }

    @Test
    @Disabled("This test is currently disabled")
    void isLargerTest(){
        Boolean actual = Utility.isLarger(5, 3);
        assertTrue(actual);
    }

    @Test
    void addTest() {
        int expected = 31;
        int actual = Utility.addInts(10, 21);

        assertEquals(expected, actual);
    }

    @Test
    void addAnotherTest() {
        int expected = 26;
        int actual = Utility.addInts(15, 11);

        assertEquals(expected, actual);
    }

}
