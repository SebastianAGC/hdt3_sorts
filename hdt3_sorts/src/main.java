/**
 *
 * @author Rodrigo Arriaza;
 */
import java.util.Random;

public class main {
      public static void main(String args[]) {
          Comparable[] num = new Comparable[10];
          Random random = new Random();
          int len = 10; //Variable que determina el tamaño del vector
          
          //Clases para los sorts
          Radixsort radix = new Radixsort();
          Merge merge = new Merge();
          
          //Se llena el array con numeros random
          for (int i = 0; i < len; i++)
              num[i] = random.nextInt(len*100);
                    
          //Sort con QuickSort
          QuickSort.sort(num, 0, num.length-1);
          
          //Sort con RadixSort
          //num = radix.sort(num, len);
          
          //Sort con Merge
          //num = merge.sort(num);
          
          
          //Se muestra el vector ordenado en pantalla
          for (int i = 0; i < len; i++)
            System.out.println(num[i]);
          
        }
    }
