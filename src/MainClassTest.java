import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber() {
        int expectedValue = 14;
        Assert.assertTrue(String.format("Ожидалось, что метод getLocalNumber вернет значение равное %s, получили %s",
                expectedValue, this.getLocalNumber()), this.getLocalNumber() == expectedValue);
    }
}
