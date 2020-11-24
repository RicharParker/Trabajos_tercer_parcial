
package RadixSort;

/**
 *
 * @author ARCHV
 */
public class Radix {
    Nodo inicio = null;
    
     public boolean ordenado(Nodo raiz)
    {
        while(raiz.sig != null)
        {
            if(raiz.dato > raiz.sig.dato) return false;
            raiz = raiz.sig;
        }
        return true;
        
    }
    public void radixSort()
    {
        int digitos = num_digitos(this.inicio);
        int exp = 1;
        Nodo aux = this.inicio;
        Radix ordenada = new Radix();
        Radix valores[] = new Radix[10];
        
        for(int i = 0; i < digitos; ++i)
        {
            Radix temp = new Radix();
            while(aux != null){
                int posicion = (aux.dato / exp) % 10;
                if(valores[posicion] == null){
                    valores[posicion] = new Radix();
                }
                valores[posicion].insertar(aux.dato);
                aux = aux.sig;
            }
            for(int j = 0; j < 10; ++j)
            {
                while(valores[j] != null && valores[j].inicio != null)
                {
                    temp.insertar(valores[j].inicio.dato);
                    valores[j].inicio = valores[j].inicio.sig;
                }
            }
            exp *= 10;
            aux = temp.inicio;
        }
        while(aux != null)
        {
            ordenada.insertar(aux.dato);
            aux = aux.sig;
        }
        
        inicio = ordenada.inicio;
    }
    public void recorrer()
    {
        Nodo aux = inicio;
        while( aux != null )
        {
            System.out.print(aux.dato + " ");
            aux = aux.sig;
        }
    }
    public boolean isEmpty()
    {
        return inicio == null;
    }
    public void insertar(int dato)
    {
        Nodo nuevo = nuevoNodo(dato);
        if(!isEmpty())
        {
            nuevo.sig = inicio;
        }
        inicio = nuevo;
    }
    public Nodo nuevoNodo(int dato)
    {
        Nodo nuevo = new Nodo();
        nuevo.dato = dato;
        nuevo.sig = null;
        return nuevo;
    }
    public int num_digitos(Nodo raiz){
        int max = raiz.dato;
        int digitos = 0;
        while(raiz != null)
        {
            if(raiz.dato > max) max = raiz.dato;
            raiz = raiz.sig;
        }
        
        while(max != 0)
        {
            max /= 10;
            digitos++;
        }      
        return digitos;
    }
}