import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Repeatable;

public class MainTest {

    @Test
    public void TestCountConsonent() {
        Main main = new Main();
        int actualResult = main.countConsonent("gfghjkl");
        int expectedResult = 7;                 // a space-t is beleszámoljuk!!! mint nem magánhangzót

        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertEquals(3, main.countConsonent("Alibaba"));
    }

    @Test
    public void swap() {
        Main main = new Main();
        String actual = main.swap("Hello World!");
        String expected = "HEllO WOrld!";

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals("AlIbAbA", main.swap("Alibaba"));
    }
}
