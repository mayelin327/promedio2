package promedio2;

import java.util.Scanner;

public class Promedio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, nota3, nota4;
        double promedio;

        System.out.println("Ingresar  nota primer parcial (20%):");
        nota1 = scanner.nextDouble();

        System.out.println("Ingresar nota segundo parcial (20%):");
        nota2 = scanner.nextDouble();

        System.out.println("Ingresarnota tercer parcial (30%):");
        nota3 = scanner.nextDouble();

        System.out.println("Ingresar nota cuarto parcial (30%):");
        nota4 = scanner.nextDouble();

        
        promedio = (nota1 * 0.2 + nota2 * 0.2 + nota3 * 0.3 + nota4 * 0.3);

        System.out.println("El promedio del curso es: " + promedio);

        if (promedio >= 85 && promedio <= 100) {
            System.out.println("SU PROMEDIO ES: EXCELENTE");
        } else if (promedio >= 80 && promedio < 84) {
            System.out.println("SU PROMEDIO ES: MUUY BUENO");
        } else if (promedio >= 70 && promedio < 79) {
            System.out.println("SU PROMEDIO ES: BUENO");
        } else if (promedio >= 60 && promedio < 69) {
            System.out.println("SU PROMEDIO ES: REGULAR");
        } else {
            System.out.println("Repite curso");
        }

        
    }
}
