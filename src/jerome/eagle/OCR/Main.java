package jerome.eagle.OCR;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ListOfIntegers listOfIntegers = new ListOfIntegers();
        List<Integer> unfilteredList = listOfIntegers.generateList();

        OddFilter oddFilter = new OddFilter();
        oddFilter.generateFilteredList(unfilteredList);
    }
}
