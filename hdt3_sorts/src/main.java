/**
 *
 * @author Rodrigo Arriaza;
 */
public class main {
      public static void main(String args[]) {
          Numeros losnumeros = new Numeros();
          Radixsort radix = new Radixsort();
          int [] numeros1 = losnumeros.generarNumeros();
          for (int i=0; i<10;i++){
              System.out.println(numeros1[i]);
          }
          int [] ordenada = radix.sort(numeros1);
          System.out.println("Ordenado: \n");
          for (int i=0; i<10;i++){
              System.out.println(ordenada[i]);
          }
        }
    }
