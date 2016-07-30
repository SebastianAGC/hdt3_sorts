/**
 *
 * @author Rodrigo Arriaza;
 */
public class main {
      public static void main(String args[]) {
          Numeros losnumeros = new Numeros();
          Radixsort radix = new Radixsort();
          Merge merger = new Merge();
          int [] numeros1 = losnumeros.generarNumeros();
          for (int i=0; i<10;i++){
              System.out.println(numeros1[i]);
          }
          int [] ordenada = merger.sort(numeros1); //cambiar aqui entre merger y radix 
          System.out.println("Ordenado: \n");
          for (int i=0; i<10;i++){
              System.out.println(ordenada[i]);
          }
        }
    }
