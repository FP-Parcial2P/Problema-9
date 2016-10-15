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
        float d; //variable del dato solicitado
        double y,p,mi; // variables que se calcularan 
        
        d = solicitarDato();
        y = convertirYardas(d); //Método para convertir a yardas
        p = convertirPies(d); //Método para convertir a pies
        mi= convertirMillas(d);//Método para convertir a millas
        mostrarConversiones(y,p,mi); // Se muestran los 3 resultados
    }
   
    public static int solicitarDato(){ //Se solicita el dato
        int d;
        System.out.println("Introduce el dato en metros");
        Scanner teclado = new Scanner(System.in);
        d = teclado.nextInt();
        return d;
    }
    public static double convertirYardas(float d){ //Método para convertir a yardas
       double y;
        y = d * 1.09361;
        return y;
    }
    public static double convertirPies(float d){ //Método para convertir a pies
        double p;
        p = d * 3.280884;
        return p;
    }
    public static double convertirMillas(float d){ //Método para convertir a millas
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
