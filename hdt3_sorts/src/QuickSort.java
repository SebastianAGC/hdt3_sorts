/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
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
