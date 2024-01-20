/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

/**
 *
 * @author Jeniffer Dueñas:)
 */
public class Triangulo {

    private int M;
    private char caracter;

    //Constructor de la clase Triangulo.
    public Triangulo(int M, char caracter) {
        this.M = M;
        this.caracter = caracter;
    }

    //Imprime el primer tipo de triángulo
    public void imprimirPrimerTriangulo() {
        for (int i = 0; i < M; i++) {
            // Imprimir caracteres en una sola línea, separados por un carácter especial
            for (int j = 0; j <= i; j++) {
                System.out.print(caracter);
                if (j < i) {
                    System.out.print(" "); // Carácter especial para separar
                }
            }

            System.out.println(); // Cambiar de línea después de imprimir cada fila
        }
    }

    //Imprime el segundo tipo de triángulo 
    public void imprimirSegundoTriangulo() {
        for (int i = M; i > 0; i--) {
            // Imprimir caracteres en una sola línea, separados por un carácter especial
            for (int j = 0; j < i; j++) {
                System.out.print(caracter);
                if (j < i - 1) {
                    System.out.print(" "); // Carácter especial para separar
                }
            }
            System.out.println(); // Cambiar de línea después de imprimir cada fila
        }
    }

    //Imprime ambos tipos de triángulos pero con matrices actualizadas
    public void imprimirMatriz() {
        System.out.println("\n****************************");
        System.out.println("      MATRICES ACTUALIZADAS:)");
        System.out.println("*****************************");
        System.out.println("      PRIMER TRIANGULO:");
        imprimirPrimerTriangulo();
        System.out.println("\n      SEGUNDO TRIANGULO:");
        imprimirSegundoTriangulo();
    }

    //Actualiza el tamaño de la matriz si el nuevo valor es válido.
    public void setM(int nuevoM) {
        if (esValido(nuevoM)) {
            System.out.println("Tamaño de matriz actualizado con éxito.");
            this.M = nuevoM;
        } else {
            System.out.println("Error: Tamaño de matriz no válido.");
        }
    }

    //Actualiza el carácter
    public void setCaracter(char nuevoCaracter) {
        if (esCaracterValido(nuevoCaracter)) {
            System.out.println("Caracter actualizado con éxito." + nuevoCaracter);
            this.caracter = nuevoCaracter;
            imprimirMatriz();
        } else {
            System.out.println("Error: Caracter no válido.");
        }
    }

    // Verifica si un valor es válido para el tamaño de la matriz.
    private boolean esValido(int valor) {
        return valor > 0;
    }

    //Verifica si un carácter es válido.
    private boolean esCaracterValido(char c) {
        return Character.isLetter(c);
    }
}
