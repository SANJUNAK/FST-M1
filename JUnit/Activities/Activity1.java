
import java.util.ArrayList;
        import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.Test;
        import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1 {

    static ArrayList<String> myList;

    @BeforeEach
    void setUp() throws Exception {
        myList = new ArrayList<String>();
        myList.add("alpha"); // at index 0
        myList.add("beta"); // at index 1
    }

    @Test
    public void insertTest() {

        assertEquals(2, myList.size(), "Wrong size");
        myList.add(2, "charlie");
        assertEquals(3, myList.size(), "Wrong size");


        assertEquals("alpha", myList.get(0), "Wrong element");
        assertEquals("beta", myList.get(1), "Wrong element");
        assertEquals("charlie", myList.get(2), "Wrong element");
    }

    @Test
    public void replaceTest() {

        myList.set(1, "charlie");


        assertEquals(2, myList.size(), "Wrong size");

        assertEquals("alpha", myList.get(0), "Wrong element");
        assertEquals("charlie", myList.get(1), "Wrong element");
    }
}