
package RadixSort;

import java.util.Random;

/**
 *
 * @author ARCHV
 */
public class Main {
    public static void main(String[] args) {
        Radix Rx = new Radix();
        
        for(int i = 0; i < 1000001; ++i)
        {
            Random rng = new Random();
            int valorDado = rng.nextInt(100001); 
            Rx.insertar(valorDado);
        }
        
        System.out.print("Números: ");
        Rx.recorrer();
        System.out.println("\n");
        
        System.out.print("Números ordenados: ");
        Rx.radixSort();
        Rx.recorrer();
    }
}

