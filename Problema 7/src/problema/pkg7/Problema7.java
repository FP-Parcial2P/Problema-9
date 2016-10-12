/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg7;
import java.util.*;
/**
 *
 * @author Raziel 2
 */
public class Problema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // programa para convertir km/h a m/s
        double k,m;
        k = solicitarKmPorHora();
        m = convertirAMetros(k);
        mostrarResultado(m);
    }
    public static double solicitarKmPorHora(){
        double k;
        System.out.println("Introduce los km/h que quieres convertir a m/s");
        Scanner teclado = new Scanner(System.in);
        k = teclado.nextDouble();
        return k;
    }
    public static double convertirAMetros(double k){
        double m;
        m = k * 1000 / 3600;
        return m;
    }
    public static void mostrarResultado(double m){
    System.out.print("El resultado es igual a:" + m+"m/s ");
}
}