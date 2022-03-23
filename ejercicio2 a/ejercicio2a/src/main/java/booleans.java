
import java.util.Scanner;


public class booleans {
    
 
  
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        float numero1,numero2,suma,rest,mult,div;
        
        System.out.println("Digite 2 numeros: ");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();
        
        suma = numero1 + numero2;
        rest = numero1-numero2;
        mult = numero1 * numero2;
        div = numero1/numero2;
        System.out.println("la suma es "+ suma);
        System.out.println("la resta es "+ rest);
        System.out.println("la multiplicacion es "+ mult);
        System.out.println("la division es "+ div);
        
        
        
        
       

  }    
}
