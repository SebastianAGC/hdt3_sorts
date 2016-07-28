/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo Arriaza;
 */
public class main {
      public static void main(String args[]) {
          Numeros losnumeros = new Numeros();
          Radixsort radix = new Radixsort();
          int [] numeros1 = losnumeros.generarNumeros();
          int [] ordenada = radix.sort(losnumeros.generarNumeros());
          for (int i=0; i<10;i++){
              System.out.println(numeros1[i]);
          }
          System.out.println("Ordenado: \n");
          for (int i=0; i<10;i++){
              System.out.println(ordenada[i]);
          }
          
      }
    
}
