
import java.util.Scanner;


/**
 *
 * Santiago Zapata Alzate
 */
public class PedirDatos {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        
        //declarar variables
        int num1, num2, suma, resta, multi, division; 
        
    System.out.println("por favor ingrese un numero ");
    num1 = teclado.nextInt();
    System.out.println("por favor ingrese el segundo numero");
    num2 = teclado.nextInt();
    
    suma = num1+num2;
    resta = num1-num2;   
    multi = num1*num2; 
    division = num1/num2; 
    //mostrar resultado
    System.out.println("el resultado al sumar sus 2 numero es igual a: "+suma);        
    System.out.println("el resultado al restar sus 2 numero es igual a "+resta);      
    System.out.println("el resultado al multiplicar sus 2 numeros es igual a "+multi);
    System.out.println("el resultado al dividir sus 2 numero es igual a "+division);
    
    }
}
