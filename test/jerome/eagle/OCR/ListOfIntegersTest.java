package jerome.eagle.OCR;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListOfIntegersTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(System.out);
    }

    ListOfIntegers listOfIntegers = new ListOfIntegers();

    @Test
    public void Given_Nothing_When_DisplayList_Then_DisplayListOfIntegers() {
        listOfIntegers.generateList();
        assertEquals("Voici la liste de nombres entiers dont on ne veut garder que les nombres impairs :" +
                "\n[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22]\n", outContent.toString().replace("\r\n", "\n"));
    }

}
