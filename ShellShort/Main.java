
package ShellShort;

/**
 *
 * @author ARCHV
 */
public class Main {
    
    public static void main(String[] args){
        
        int i=0, cantidad=1000000, rango=1000000;
        int arreglo[] = new int[cantidad];
        
        arreglo[i]=(int)(Math.random()*rango);
        for(i=1; i<cantidad; i++){
            arreglo[i]=(int)(Math.random()*rango);
            for(int j=0; j<i; j++){
                if(arreglo[i]==arreglo[j]){
                    i--;
                }
            }
        }
        
        Lista ordenar = new Lista();
        System.out.print("Arreglo original\n");
        ordenar.mostrarArreglo(arreglo);
        ordenar.shell(arreglo);
    }    
}
