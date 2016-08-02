/* Universidad del Valle de Guatmala
 * Algoritmos y Estructuras de Datos
 *
 * En esta clase se realiza el Sort con el método Radix
 */

/**
 *
 * codigo tomado de http://www.sanfoundry.com/java-program-implement-radix-sort/;
 */
public class Radixsort {
    public Comparable[] sort(Comparable[] a)
        {

            int i, m = (int) a[0], exp = 1, n = a.length;
            int[] b = new int[a.length];
            for (i = 1; i < n; i++)
                if (a[i].compareTo(m) > 0)
                    m = (int) a[i];
            while (m / exp > 0)
            {
                int[] bucket = new int[10];

                for (i = 0; i < n; i++)
                    bucket[((int)a[i] / exp) % 10]++;
                for (i = 1; i < 10; i++)
                    bucket[i] += bucket[i - 1];
                for (i = n - 1; i >= 0; i--)
                    b[--bucket[((int)a[i] / exp) % 10]] = (int)a[i];
                for (i = 0; i < n; i++)
                    a[i] = b[i];
                exp *= 10;        
            }
            return a;
        }       
}
