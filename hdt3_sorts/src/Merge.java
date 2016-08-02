/* Universidad del Valle de Guatmala
 * Algoritmos y Estructuras de Datos
 *
 * En esta clase se realiza el Sort con el método Merge
 */
/**
 *
 * @author tomado de http://www.java2novice.com/java-sorting-algorithms/merge-sort/;
 */
public class Merge {
    private Comparable[] array;
    private Comparable[] tempMergArr;
    private int length;

    public Comparable[] sort(Comparable inputArr[]) {
        array = inputArr;
        length = inputArr.length;
        tempMergArr = new Comparable[length];
        doMergeSort(0, length - 1);
        return array;
    }
 
    private void doMergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i].compareTo(tempMergArr[j]) <= 0) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }

}
