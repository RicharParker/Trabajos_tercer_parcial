
package Huffman;
import java.util.PriorityQueue; 
import java.util.Scanner; 
import java.util.Comparator;
/**
 *
 * @author ARCHV
 */
  
public class Main { 
  

    public static void printCode(Nodo root, String s) 
    { 
   
        if (root.izq 
                == null
            && root.der 
                   == null
            && Character.isLetter(root.c)) { 

            System.out.println(root.c + ":" + s); 
  
            return; 
        } 
  
        printCode(root.izq, s + "0"); 
        printCode(root.der, s + "1"); 
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
  

        Nodo root = null; 
  

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

            root = f; 
 
            q.add(f); 
        } 

        printCode(root, ""); 
    } 
} 
  
