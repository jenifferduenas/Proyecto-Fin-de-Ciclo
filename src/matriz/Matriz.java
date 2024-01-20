/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author Jeniffer Dueñas:)
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************");
        System.out.println("     MATRIZ TRIANGULO:)");
        System.out.println("****************************");
        System.out.print("INGRESE EL CARACTER QUE USTED DESEE: ");
        char caracter = scanner.next().charAt(0);

        System.out.print("INGRESE EL TAMAÑO DE LA MATRIZ (M*M) ");
        int M = scanner.nextInt();

        Triangulo triangulo = new Triangulo(M, caracter);
        System.out.println("");
        System.out.println("****************************");
        System.out.println("      PRIMER TRIANGULO:)");
        System.out.println("*****************************");
        triangulo.imprimirPrimerTriangulo();

        System.out.println("");
        System.out.println("****************************");
        System.out.println("     SEGUNDO TRIANGULO:)");
        System.out.println("****************************");
        triangulo.imprimirSegundoTriangulo();

        // Cambiar el tamaño de la matriz
        System.out.print("\nIngrese el nuevo tamaño de la matriz (M*M): ");
        int nuevoM = scanner.nextInt();
        triangulo.setM(nuevoM);

        // Cambiar el carácter
        System.out.print("Ingrese un nuevo carácter: ");
        char nuevoCaracter = scanner.next().charAt(0);
        triangulo.setCaracter(nuevoCaracter);

        scanner.close();
    }
    
}
