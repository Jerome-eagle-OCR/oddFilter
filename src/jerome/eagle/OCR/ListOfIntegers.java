package jerome.eagle.OCR;

import java.util.ArrayList;
import java.util.List;

public class ListOfIntegers {

    /** generate a list of integers from 0 to 22
     * Displays the list
     * @return the list
     */
    public List<Integer> generateList() {
        List<Integer> listOfIntegers = new ArrayList<>();
        int i = 0;
        while (i <= 22) {
            listOfIntegers.add(i);
            i++;
        }
        System.out.println("Voici la liste de nombres entiers dont on ne veut garder que les nombres impairs :");
        System.out.println(listOfIntegers);
        return listOfIntegers;
    }
}
