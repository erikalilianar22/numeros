/*
Autor:Erika Rodriguez
 */
package numeros;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Numeros {

    
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new  InputStreamReader( System.in) );
 
        Scanner reader = new Scanner(System.in);
        int num = 0;
        System.out.println("ingrese un numero:");
         num = reader.nextInt();
         
        int cont= 2;
        boolean primo=true;
        while ((primo) && (cont!=num)){
        if (num % cont== 0){
           primo = false;
                cont++;
        }
        if (primo==true){
            System.out.println("el numero " +num+" es primo");
            break;
        } 
        else{
            System.out.println("el numero " +num+" no es primo");
           break;
        }   
        } 
        
        if(num>=0){
            System.out.println("el numero " +num+" es positivo");
        }
        else{
            System.out.println("el numero " +num+" es negativo");        
        }
        if (num%2==0){
            System.out.println("el numero " +num+" es par");
        }
        else{
            System.out.println("el numero " +num+" es impar");
        }
        
       
    }
    
}
