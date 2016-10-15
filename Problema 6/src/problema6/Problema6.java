/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema6;
import java.util.*;
/**
 *
 * @author Raziel 2
 */
public class Problema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Programa para calcular salario
        float p,h; 
        p = solicitarPago(); 
        h = solicitarHoras();
        calcularymostrarSalario(p,h);
    }
    public static float solicitarPago(){  // solicitar paga de 1 hora
        float p;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el pago de 1 hora");
        p = teclado.nextFloat();
        return p;
    }
    public static float solicitarHoras(){  // solicitar paga de 1 hora
        float h;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce las horas trabajadas");
        h = teclado.nextFloat();
        return h;
    }
    public static void calcularymostrarSalario(float p, float h) {
    if (h<=40) { p = (p * h); } //Si es menor a 40 horas 
    else if  ((h > 40) &&(h <=48)){ p = (p*40)+ ((h-40) * (p * 2));}
    else if (h > 48) { p = (p *40) + ((8)* (p * 2))+ ((h-48)*(p*3));}
    System.out.print("El salario es igual a:  $" + p);
    }
}
