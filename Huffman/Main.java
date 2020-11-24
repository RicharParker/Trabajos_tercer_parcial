
package Huffman;
import java.util.PriorityQueue; 
import java.util.Scanner; 
import java.util.Comparator;
/**
 *
 * @author ARCHV
 */
  
public class Main { 
  

    public static void imprimircodigo(Nodo raiz, String s) 
    { 
   
        if (raiz.izq 
                == null
            && raiz.der 
                   == null
            && Character.isLetter(raiz.c)) { 

            System.out.println(raiz.c + ":" + s); 
  
            return; 
        } 
  
       imprimircodig(raiz.izq, s + "0"); 
       imprimircodig(raiz.der, s + "1"); 
    } 
  
    // main function 
    public static void main(String[] args) 
    { 
  
        Scanner s = new Scanner(System.in); 
  
        int n = 6; 
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' }; 
        int[] charfreq = { 5, 9, 12, 13, 16, 45 }; 
  class MyComparator implements Comparator<Nodo> { 
    public int compare(Nodo x, Nodo y) 
    { 
  
        return x.dato - y.dato; 
    } 
} 

        PriorityQueue<Nodo> q 
            = new PriorityQueue<Nodo>(n, new MyComparator()); 
  
        for (int i = 0; i < n; i++) { 
  

            Nodo hn = new Nodo(); 
  
            hn.c = charArray[i]; 
            hn.dato = charfreq[i]; 
  
            hn.izq = null; 
            hn.der = null; 
  

            q.add(hn); 
        } 
  

        Nodo raiz = null; 
  

        while (q.size() > 1) { 
  

            Nodo x = q.peek(); 
            q.poll(); 
  
 
            Nodo y = q.peek(); 
            q.poll(); 
  

            Nodo f = new Nodo(); 
  

            f.dato = x.dato + y.dato; 
            f.c = '-'; 
  

            f.izq = x; 

            f.der = y; 

            raiz = f; 
 
            q.add(f); 
        } 

        imprimircodigo(raiz, ""); 
    } 
} 
  
