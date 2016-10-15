/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg10;
import java.util.*;
/**
 *
 * @author Raziel 2
 */
public class Problema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // N primeros número de la serie Fibonacci
        int n, a, b, x;
        a = 0;
        b = 1;
        x = 1;
        n = solicitarCantidad(); // Pedir cantidad de numero de la serie Fibonacci
        calcularYMostrarNumerosDeseados(n,a,b,x);
    }
    public static int solicitarCantidad(){ 
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cantindad de los primero numeros de la serie Fibonacci que deseas");
        n = teclado.nextInt();
        return n;
    }
    public static void calcularYMostrarNumerosDeseados(int n, int a, int b, int x){
        int i; 
        System.out.println("*Serie Fibonacci*");
        System.out.println(b); //A partir del 1
        for (i=0; i<n-1; i++) { // n - 1 debido ya que b contará como un digito mas los numeros deseados
            System.out.println(x);
            a = b;
            b = x;
            x = a +b;
            
        }
            
        
}
}