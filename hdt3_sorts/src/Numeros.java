/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo Arriaza;
 */
import java.util.ArrayList;
import java.util.Random;
public class Numeros {
    
        
public int[] generarNumeros(){
        int losnumeros[] = new int[3000];
        for (int i=0; i<=3000; i++)
        {      
            Random rnd = new Random();
            losnumeros[i] = (int) (rnd.nextDouble() * 100);
        }
    return losnumeros;
    } 
}
