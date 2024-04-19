import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeUtilsTest {

    @ParameterizedTest
    @CsvSource({
            "-1, -1",
            "0, 0:00:00",
            "1, 0:00:01",
            "59, 0:00:59",
            "60, 0:01:00",
            "3599, 0:59:59",
            "3600, 1:00:00",
            "3601, 1:00:01",
            "10000, 2:46:40",
            "86400, 24:00:00",
            "86401, 24:00:01"
    })
    public void testSecToTime(int seconds, String expectedTime) {
        assertEquals(expectedTime, TimeUtils.secToTime(seconds));
    }
}
