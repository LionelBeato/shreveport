import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class SecondTest {

    private List<Integer> integerList;

    @BeforeEach
    void setUp() {
        System.out.println("Initializing integerList...");
        integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(2);
        integerList.add(1563);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Method resolved");
        integerList.clear();
    }

    @AfterAll
    static void done() {
        System.out.println("Testing is complete.");
    }

    @Test
    void test() {
        Integer expected = 5;
        Integer actual = integerList.get(0);
        assertEquals(expected, actual);
    }

    @Test
    void anotherTest() {
        Integer expected = 5;
        Integer actual = integerList.get(0);
        assertEquals(expected, actual);
    }

    @Test
    void sizeTest() {
        Integer expected = 3;
        Integer actual = integerList.size();
        assertEquals(expected, actual);
    }

    @Test
    void allTest() {
        assertAll("numbers",
                () -> assertEquals(integerList.get(0), 5),
                () -> assertEquals(integerList.get(1), 2));
    }



}
