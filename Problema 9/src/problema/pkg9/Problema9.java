/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg9;
import java.util.*;
/**
 *
 * @author Raziel 2
 */
public class Problema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Programa que reciba numero de 4 cifras y lo muestr por separado
        String num;
        num = solicitarNumero();
        dividirNumeroYMostrarResultado(num);
    }
    public static   String solicitarNumero(){ //Pedir numero y hacer string
        String num;
        System.out.println("Introduce un numero de 4 digitos");
        Scanner teclado = new Scanner(System.in);
        num = teclado.nextLine();
        while ((num.length()>4) || (num.length() > 4)){ // mientras que el numero tenga mas de 4 o 5 digitos
        System.out.print("El numero que ingresaste no es de 4 dígitos. Porfavor vuelve a ingresarlo.");
        num = teclado.nextLine();
    }
        return num;
    }
    public static void dividirNumeroYMostrarResultado(String num){
      String var = (num);
      char cad[];
      cad = var.toCharArray(); 
      { System.out.println( num + " = " + cad[0] + "000 + " + cad[1] + "00 + " + cad[2] +"0 +" + cad[3]);
      }
    }
}