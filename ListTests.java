import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

class Checking implements StringChecker {
    public boolean checkString(String stringj) {
        if (stringj.length() == 5) {
            return true;
        }
        else {
            return false;
        }
    }
}

public class ListTests {
    @Test
    public void testingFilter() {
        List<String> newList = new ArrayList<>();
        newList.add("hello");
        newList.add("it's");
        newList.add("nice");
        newList.add("to");
        newList.add("meet");
        newList.add("you");
        newList.add("emily");
        List<String> expected = new ArrayList<>();
        expected.add("hello");
        expected.add("emily");
        StringChecker sc = new Checking();
        assertEquals(expected, ListExamples.filter(newList, sc)); 
    }
}