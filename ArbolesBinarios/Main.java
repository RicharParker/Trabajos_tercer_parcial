
package ArbolesBinarios;

/**
 *
 * @author ARCHV
 */
public class Main {
    public static void main(String[] args) {
        Arbol Binario = new Arbol();
        Binario.insert(70);
        Binario.insert(60);
        Binario.insert(60);
        Binario.insert(40);
        Binario.insert(50);
        Binario.insert(30);
        Binario.insert(20);
        Binario.identificar(50);
        
        
        Binario.inorder();
        Binario.borrar(50);        
        System.out.println("");
        Binario.identificar(50);
        Binario.inorder();
    }
    
}
