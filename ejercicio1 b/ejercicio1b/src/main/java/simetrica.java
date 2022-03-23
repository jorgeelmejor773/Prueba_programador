
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Jorge
 */
public class simetrica {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int matriz [][], nFilas, nCol;
        boolean simetrica = true;
        
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("digite el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("digite el numero de columnas: "));
        
        matriz = new int[nFilas] [nCol];
        System.out.println("Digite una matriz:");
         for (int i=0;i<nFilas;i++){
             for (int j=0;j<nCol;j++){
                 System.out.println("Matriz("+i+"("+j+"): ");
                 matriz [i][j] = entrada.nextInt();
             }
             
         }
         
         if (nFilas ==nCol){  
             int i,j;
             i=0;
             while(i<nFilas && simetrica==true){
                 j=0;
                 while (j<i && simetrica==true){
                     if(matriz[i][j]!=matriz[j][i]){
                         simetrica = false;
                     }
                     j++;
                 }
                 i++;
             }
             if(simetrica==true){
               JOptionPane.showMessageDialog(null, true);
             }
             else {
                 JOptionPane.showMessageDialog(null, false);
             }
         }
         else {
             JOptionPane.showMessageDialog(null, false);
         }
    }
    
}

