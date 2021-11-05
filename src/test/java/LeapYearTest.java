import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {

    @Test
    public void DivisibleBy4not100() {
        Assertions.assertEquals(true, LeapYear.isLeapYear(1940));
    }

    @Test
    public void NotDivisibleBy4() {
        Assertions.assertEquals(false, LeapYear.isLeapYear(1914));
    }

    @Test
    public void DivisibleBy400() {
        Assertions.assertEquals(true, LeapYear.isLeapYear(2000));
    }

    
    @Test
    public void DivisibleBy100not400() {
        Assertions.assertEquals(false, LeapYear.isLeapYear(2100));
    }
}
