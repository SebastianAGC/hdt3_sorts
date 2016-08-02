/**
 *
 * @author Rodrigo Arriaza;
 */
import java.util.Random;

public class main {
      public static void main(String args[]) {
          int len = 3000; //Variable que determina el tamaño del vector
          Comparable[] num = new Comparable[len];
          Comparable[] ordenados = new Comparable[len];
          Random random = new Random();
          
          
          //Clases para los sorts
          Radixsort radix = new Radixsort();
          Merge merge = new Merge();
          GnomeSort elgnomo = new GnomeSort();
          QuickSort quick = new QuickSort();
          
          //Se llena el array con numeros random
          for (int i = 0; i < len; i++)
              num[i] = random.nextInt(len*100);
                    
          //Se llena otro array con numeros ordenados
          for (int i = 0; i < len; i++)
              ordenados[i]=i;
          
          //Sort con QuickSort
          QuickSort.sort(ordenados, 0, ordenados.length-1);
          
          //Sort con RadixSort
          //num = radix.sort(num);
          
          //Sort con Merge
          //num = merge.sort(num);
          
          //Sort con Gnome
          //elgnomo.gnomeSort(ordenados);
          
          //Se muestra el vector ordenado en pantalla
          for (int i = 0; i < len; i++)
            System.out.println(ordenados[i]);
          
        }
    }
