/* Universidad del Valle de Guatmala
 * Algoritmos y Estructuras de Datos
 *
 * En esta clase se realiza el Sort con el método Gnome
 */

/**
 *
 * @author referencia tomada de: https://rosettacode.org/wiki/Sorting_algorithms/Gnome_sort#Java;
 */
public class GnomeSort {
    public static Comparable[] gnomeSort(Comparable[] nums){ //takes unsorted array, returns sorted
    int index=1; //start of search
    Comparable temp;
    while(index<nums.length){ //until the array is fully sorted
        Comparable a = nums[index];
        Comparable b = nums[index-1];
      if(a.compareTo(b)<0){ //compares nums[index] with nums[index-1]. if smaller, switch.
        temp=nums[index];
        nums[index]=nums[index-1];
        nums[index-1]=temp;
        index--; //must decrease index to recheck. since they have been swapped, the array may still be out of order
        if(index==0){ //prevents index from going lower than 1
          index=1;
        }
      }
      else{
        index++; //if sorted, go up
      }
    }
    return(nums); //reaching the end of the array- completely sorted, returns nums
  }
}
