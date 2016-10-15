/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg8;
import java.util.*;
/**
 *
 * @author Raziel 2
 */
public class Problema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Obtener hipotenusa mediante dos catetos que sean positivos
        double a,b,h; // cateto a, cateto b, hipotenusa h 
        a = solicitarCatetos(); // Pedimos el primer y segundo cateto en el mismo método
        b = solicitarCatetos();
        h = obtenerHipotenusa(a,b); // raiz de (a^2 + b^2)
        mostrarResultado(h);
    }
    public static double solicitarCatetos(){
    double c;
    System.out.println("Introduce el primer cateto y posteriormente el segundo cateto. Ambos tienen que ser positivos");
    Scanner teclado = new Scanner(System.in);
    c = teclado.nextDouble();
    if (c>0){
    return c;}
    else { System.out.println("Los catetos tienen que ser positivos. Vuelve a correr el programa."); System.exit(0); 
    }
    return c;
    }
    
    public static double obtenerHipotenusa(double a , double b){
        double h;
        h = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        return h;
    }
    public static void mostrarResultado(double h){
        System.out.println("La hipotenusa es igual a:" + h);
    }
    
}
