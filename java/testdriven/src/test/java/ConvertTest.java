import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConvertTest {


    @Test
    void testConvertLengthFromCentToInches() {
//        fail("This test is not yet implemented");
        // given 100 centimeters
        // when I convert to inches I get back 100/2.54 == 39.3701
        double expected = 39.3701;
        double actual = Convert.convertLengthFromCentToInches(100);

        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void testConvertLengthForCentimetersToInches() {
        // this length is going to be centimeters
        double expected = 100;
        double actual = Convert.convertLength(240, "centimeters");
        assertEquals(expected, actual);
    }

    @Test
    void testConvertLengthForInchesToCentimeters() {
        double expected = 240;
        double actual = Convert.convertLength(100, "inches");
        assertEquals(expected, actual);
    }

    @Test
    void test() {
        double expected = 0;
        double actual = Convert.convertLength(34423, "hello");
        assertEquals(expected, actual);
    }



}
