import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber() {
        int expectedValue = 14;
        Assert.assertTrue(String.format("Ожидалось, что метод getLocalNumber вернет значение равное %s, получили %s",
                expectedValue, this.getLocalNumber()), this.getLocalNumber() == expectedValue);
    }

    @Test
    public void testGetClassNumber() {
        int borderValue = 45;
        Assert.assertTrue(String.format("Ожидалось, что метод getClassNumber вернет значение больше чем %s, получили %s",
                borderValue, this.getClassNumber()), this.getClassNumber() > borderValue);
    }
}
