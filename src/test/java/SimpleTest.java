import org.testng.annotations.Test;

public class SimpleTest {

    @Test
    public void test_01(){
        int value = 5;
        assert (value < 4);
    }
}
