/*//Leticia Vianey Narvaez Reyes A01410432 Ingenieria Industrial y de Sistemas
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssp2.lnarvaezr.t01.p2;
import java.util.Scanner;
/**
 *
 * @author Vianey_Narváez
 */
public class SSP2LNarvaezRT01P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double sup, per, base, altura;
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Ingrese la base");
    base = teclado.nextDouble();
    System.out.println("Ingrase la altura");
    altura = teclado.nextDouble();
    
    per = base+base+altura+altura;
    sup = base*altura; 
    
    System.out.println("El perimetro del rectungulo es " + per);
    System.out.println("La superficie del rectangulo es " + sup);
            
    }
    
}
