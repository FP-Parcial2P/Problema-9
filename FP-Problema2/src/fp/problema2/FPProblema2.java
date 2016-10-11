/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.problema2;
import java.util.*;
/**
 *
 * @author Raziel 2
 */
public class FPProblema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float d;
        double y,p,mi;
        
        d = solicitarDato();
        y = convertirYardas(d);
        p = convertirPies(d);
        mi= convertirMillas(d);
        mostrarConversiones(y,p,mi);
    }
   
    public static int solicitarDato(){
        int d;
        System.out.println("Introduce el dato en metros");
        Scanner teclado = new Scanner(System.in);
        d = teclado.nextInt();
        return d;
    }
    public static double convertirYardas(float d){
       double y;
        y = d * 1.09361;
        return y;
    }
    public static double convertirPies(float d){
        double p;
        p = d * 3.280884;
        return p;
    }
    public static double convertirMillas(float d){
        double mi;
        mi = d *0.000621371 ;
        return mi;
    }
    public static void mostrarConversiones(double y, double p ,double mi){
        System.out.println("La conversión a yardas es igual a:" + y);
        System.out.println("La conversión a pies es igual a:" + p);
        System.out.println("La conversión a millas es igual a:" + mi);
    }
}
