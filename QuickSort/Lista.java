
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
     public void quick(int[] arreglo, int primero, int ultimo){
         int i,j,pivote,auxiliar;
         i=primero;
         j=ultimo;
         pivote=arreglo[(primero+ultimo)/2];
         System.out.println("El pivote es " + pivote);
         do{
             while(arreglo[i]<pivote){
                 i++;
             }
             while(arreglo[j]>pivote){
                 j--;
             }
             
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
         }
         mostrarArreglo(arreglo);
     }
    
    
    public void mostrarArreglo(int [] arreglo){
        int k;//creamos variable local
        for(k=0;k<arreglo.length;k++){
            System.out.print("["+arreglo[k]+"]");
        }
        System.out.println();
    }
 
}
