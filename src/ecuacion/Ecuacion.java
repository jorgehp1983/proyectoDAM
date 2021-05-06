/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacion;
import java.util.Scanner;
/**
 *
 * @author CESURMADRID
 */
public class Ecuacion {
   // clase principal que inicia la resolución de una ecuación de primer grado
    
    public static void main(String[] args) {

        // clase Scanner para petición de datos
        Scanner teclado = new Scanner(System.in);
        double c1, c2, x;
        String resultado;

        System.out.print( "Introducir primer numero C1: " );
        c1 = teclado.nextDouble(); // pedimos el primer numero al usuario
        System.out.print( "Introducir segundo numero C2: " );
        c2 = teclado.nextDouble(); // pedimos el segundo numero al usuario

        // si el coeficiente de x es cero la ecuacion no se puede calcular
        resultado = (c1==0)?"Error, la ecuacion no se puede calcular":String.valueOf(-c2/c1);

        System.out.println("El valor de x en la ecuacion C1x + C2 = 0 es " + resultado);
    } 
} 

  
