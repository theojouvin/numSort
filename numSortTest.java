import static org.junit.Assert.*;
import org.junit.*;
import java.io.File;
import java.io.FileNotFoundException;
public class numSortTest {

    @Test
    public void numSortTest() throws FileNotFoundException {
        File input = new File("nums.txt");
        assertEquals("[1, 2, 3, 4]", numSort.sort(input).toString());
    }
}