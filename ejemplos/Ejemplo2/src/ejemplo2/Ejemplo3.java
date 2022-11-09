/*
 * Realizar un programa en java que permita determinar
 * si un estudiante ha pasado el ciclo
 * se ingresa el promedio del estudiante
 * - Un estudiante pasa el ciclo si tiene un promedio
 * mayor o igual a 7.5. Si el estudiante aprueba el ciclo, presentar
 * un mensaje como sigue: Estudiante aprobado con un promedio: 8.1
 */
package ejemplo2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo3 {

    public static void main(String[] args) {
        // Condicionales simples
        Scanner entrada= new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double promedio;
        double nota1;
        double nota2;
        double suma;
        System.out.println("Ingrese nota1");
        nota1 = entrada.nextDouble();
        System.out.println("Ingrese nota2");
        nota2 = entrada.nextDouble();
        suma =nota1+nota2;
        promedio = suma / 2;
        

        if (promedio >= 7.5) { // Falso
            System.out.printf("Estudiante aprobado con un "
                    + "promedio: %.2f\n", promedio);
        } // -------------
        
    }

}
