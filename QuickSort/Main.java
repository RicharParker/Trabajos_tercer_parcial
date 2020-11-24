
package QuickSort;

/**
 *
 * @author ARCHV
 */
public class Main {
    public static void main(String[] args){
        
        int i=0, cantidad=1000000, rango=1000000;
        int arreglo[] = new int[cantidad];//el arreglo se va a generar de la cantidad que estamos colocando
        
        arreglo[i]=(int)(Math.random()*rango);//vamos a almacenar en la localidad 0 de nuestro arreglo el 1er num aleatorio que estemos generando. dependiendo del rango
        for(i=1; i<cantidad; i++){
            arreglo[i]=(int)(Math.random()*rango);//le damos otro valor a otra localidad arreglo
            for(int j=0; j<i; j++){
                if(arreglo[i]==arreglo[j]){
                    i--;//
                }
            }
        }
        
        Lista ordenar=new Lista();
        System.out.print("Arreglo original");
        ordenar.mostrarArreglo(arreglo);
        System.out.print("Arreglo ordenado con Quick Sort\n");
        ordenar.quick(arreglo, 0, arreglo.length-1);
        
    }    
}