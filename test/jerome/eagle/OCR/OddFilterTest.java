package jerome.eagle.OCR;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddFilterTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(System.out);
    }

    OddFilter oddFilter = new OddFilter();

    @Test
    public void Given_Nothing_When_DisplayList_Then_DisplayFilteredListOfIntegers() {
        List<Integer> testList = Arrays.asList(0,1,2,3);
        oddFilter.generateFilteredList(testList);
        assertEquals(" \n" + "Voici la liste filtrée, avec seulement les nombres impairs :" +
                "\n[1, 3]\n", outContent.toString().replace("\r\n", "\n"));
    }

}
