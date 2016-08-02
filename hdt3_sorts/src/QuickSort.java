/* Universidad del Valle de Guatmala
 * Algoritmos y Estructuras de Datos
 *
 * En esta clase se realiza el Sort con el método Quick, se hace uso de dos métodos.
 */

/**
 *
 * @author Rodrigo Arriaza, Alejandro Chaclán, Sebastián Galindo
 */
public class QuickSort {
            
    public static void sort (Comparable[] list, int low, int high) {
        int part = 0;
        if (low < high) {
            part = partition(list, low, high);
            sort(list, low, part - 1);
            sort(list, part + 1, high);
        }
    } 
    
    public static int partition (Comparable[] list, int low, int high) {
        int pivot = (int) list[high];
        int i = low;
        int temp;
        
        for (int j = low; j < high; j++) {
            if (list[j].compareTo(pivot) <= 0) {
                temp = (int) list[i];
                list[i] = list[j];
                list[j] = temp;
                i++;
            }
        }
        
        temp = (int) list[high];
        list[high] = list[i];
        list[i] = temp;
        
        return i;
    }
}
