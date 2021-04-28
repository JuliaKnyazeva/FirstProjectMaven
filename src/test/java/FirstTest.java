import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void test() {
        Assert.assertEquals(
                Main.pad("Sergey", 10, "!"),
                "Sergey!!!!");

    }

    @Test
    public void nullTest() {
        Assert.assertNull(Main.pad(null, 10, ""));

    }

    @Test
    public void emptyTest() {
        Assert.assertEquals(
                Main.pad("", 0, ""),
                "");

    }


}
