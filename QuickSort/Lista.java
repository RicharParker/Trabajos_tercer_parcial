
package QuickSort;

/**
 *
 * @author ARCHV
 */
public class Lista {
    
    int i,j,temporal;
    
    public Lista(){
        this.i=0;
        this.j=0;
        this.temporal=0;
    }
    //Metodo de ordenamiento Quick
     public void quick(int[] arreglo, int primero, int ultimo){//recibe 3 parametros, primero posicion 0, ultimo indice del arreglo
         int i,j,pivote,auxiliar;
         i=primero;
         j=ultimo;
         pivote=arreglo[(primero+ultimo)/2];//para dividir a nuestro arreglo a la mitad
         System.out.println("El pivote es " + pivote);
         do{
             while(arreglo[i]<pivote){//mientras arreglo en la posicion i sea menor a pivote
                 i++;//vamos a incrementar al contador i
             }
             while(arreglo[j]>pivote){//esto es para ir moviendo los indices(en teoria)
                 j--;
             }
             //Aqui hacemos el intercambio
             if(i<=j){
                 auxiliar=arreglo[i];
                 arreglo[i]=arreglo[j];
                 arreglo[j]=auxiliar;
                 i++;
                 j--;
             }
         }while(i<=j);
         if(primero<j){
             quick(arreglo, primero, j);
         }
         if(i<ultimo){
             quick(arreglo, i, ultimo);
         }//esto es lo que estara haciendo las subdivisiones en sublistas
         mostrarArreglo(arreglo);
     }
    
    //Muestra los datos del vector
    public void mostrarArreglo(int [] arreglo){
        int k;//creamos variable local
        for(k=0;k<arreglo.length;k++){
            System.out.print("["+arreglo[k]+"]");
        }
        System.out.println();
    }
 
}