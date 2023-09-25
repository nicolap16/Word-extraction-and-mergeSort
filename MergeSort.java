import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(String[] array, int start_index, int end_index) {

        if (start_index == end_index) {
            return;
        }
        int mid_index = (start_index + end_index) / 2;
        // sort the first and the second half
        mergeSort(array, start_index, mid_index);
        mergeSort(array, mid_index + 1, end_index);
        merge(array, start_index, mid_index, end_index);
    
    }// end mergeSort

    // Two halves of a single array will be compared and sorted into alphabetical order
    public static void merge(String[] array, int start_index, int mid_index, int end_index) {
        int arraySize = end_index - start_index + 1;  
        String[] tempArray = new String[arraySize];   
        int iterator1 = start_index;               // iterator for first half of the array
        int iterator2 = mid_index + 1;            // iterator for second half of the array
        int nextElement = 0;                   // next open position in temporary array

        // Comparing each element in the two parts of the array
        while (iterator1 <= mid_index && iterator2 <= end_index) {
            if (array[iterator1].compareTo(array[iterator2]) < 0) {
                tempArray[nextElement] = array[iterator1];
                iterator1++;
            } else {
                tempArray[nextElement] = array[iterator2];
                iterator2++;
            }
            nextElement++;
        }

        // Add any leftover elements in the first part of the array to temp array
        while (iterator1 <= mid_index) {
            tempArray[nextElement] = array[iterator1];
            iterator1++;
            nextElement++;
        }

        // add any leftover elements in the second part of the array to temp array
        while (iterator2 <= end_index) {
            tempArray[nextElement] = array[iterator2];
            iterator2++;
            nextElement++;
        }

        // replace elements in the original array with the sorted values stored in temp
        for (nextElement = 0; nextElement < arraySize; nextElement++) {
            array[start_index + nextElement] = tempArray[nextElement];
        }
    }//end merge

}