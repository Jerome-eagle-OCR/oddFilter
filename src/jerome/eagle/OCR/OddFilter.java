package jerome.eagle.OCR;

import java.util.ArrayList;
import java.util.List;

public class OddFilter {

    /**
     * filter a list of integers to keep only odd integers
     * Displays the list
     */

    public void generateFilteredList(List<Integer> unfilteredList) {
        List<Integer> filteredlistOfIntegers = new ArrayList<>();
        int j = 0;
        int numberOfIntegers = unfilteredList.size();
        while (j < numberOfIntegers) {
            int getNumber = unfilteredList.get(j);
            if ((getNumber % 2) != 0) {
                filteredlistOfIntegers.add(getNumber);
            }
            j++;
        }
        System.out.println(" ");
        System.out.println("Voici la liste filtrée, avec seulement les nombres impairs :");
        System.out.println(filteredlistOfIntegers);
    }
}
