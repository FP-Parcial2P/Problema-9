/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg3;
import java.util.*;
/**
 *
 * @author Raziel 2
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Programa para obtener factorial de un numero dado
        int d;// dato
        int f ; // factorial
        d = solicitarDato();
        f = calcularFactorial(d);
        mostrarFactorial(f);
    }
    public static int solicitarDato(){
        int d;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        d = teclado.nextInt();
        return d;
    }
    public static int calcularFactorial(int d){
        int x=1;//utilizado para obtener factorial 
        while (d != 0)  {  //mientras que d sea diferente de 0
        x = x * d; 
        d--; // El numero ira disminuyendo hasta que sea = 0
        }
      return x;          
    }
    public static void mostrarFactorial(int f){
        System.out.println("El factorial del numero es igual a:" + f);
    }
}
