import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber() {
        int expectedValue = 14;
        int value = this.getLocalNumber();
        Assert.assertTrue(String.format("Ожидалось, что метод getLocalNumber вернет значение равное %s, получили %s",
                expectedValue, value), value == expectedValue);
    }

    @Test
    public void testGetClassNumber() {
        int borderValue = 45;
        int value = this.getClassNumber();
        Assert.assertTrue(String.format("Ожидалось, что метод getClassNumber вернет значение больше чем %s, получили %s",
                borderValue, value), value > borderValue);
    }
}
