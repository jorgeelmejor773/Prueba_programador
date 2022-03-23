
public class ejercicio1c {
    public static void main (String [] args) {
        
         int matriz [][]= new int [5][5];
         int dato=1;
         for (int i=0;i<matriz.length;i++){
             for (int j=0;j<matriz[i].length;j++){
                 matriz[i][j]=dato;
                 dato++;
             }
         }
          for (int i=0;i<matriz.length;i++){
             for (int j=0;j<matriz[i].length;j++){
                 System.out.print("\t" +matriz[i][j]);
                 
             }
              System.out.println("");
         }
          int diagonalPrincipal[]=new int [matriz.length];
          int diagonalSecundaria[]=new int [matriz.length];
          
          for (int i=0;i<matriz.length;i++){
             for (int j=0;j<matriz[i].length;j++){
                 if (i==j){
                     diagonalPrincipal[i]=matriz[i][j];
                 }
                 if ((i+j) ==matriz.length-1){
                     diagonalSecundaria[i]=matriz[i][j];
                 }
                     
                 }
             }
          int suma=0;
          System.out.println("\n hombre este es tu diagonal Principal");
          for(int elemento:diagonalPrincipal){
              System.out.print("\t"+ elemento);
              suma =suma+elemento;
          }
          System.out.print("= "+suma);
          System.out.print("");
          
          suma=0;
          System.out.println("\n hombre este es tu diagonal Secundaria");
          for(int elemento:diagonalSecundaria){
              System.out.print("\t"+ elemento);
              suma =suma+elemento;
          }
          System.out.print("= "+suma);
          System.out.print("");
     
}
}