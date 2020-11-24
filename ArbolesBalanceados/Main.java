
package ArbolesBalanceados;

/**
 *
 * @author ARCHV
 */
public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        arbol.insert(3);
        arbol.insert(18);
        arbol.insert(1);
        arbol.insert(12);
        arbol.InOrder();
        arbol.buscar(2);
        arbol.delete(3);
        arbol.InOrder();
        arbol.PostOrder();
        arbol.PreOrder();
    }
}