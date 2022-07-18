package poligono;

import java.util.Scanner;
public class FiguraApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);  // creo el objeto entrada para escanear el teclado
        int elementos;  // numero de puntos del poligono
        Double X, Y; // coordenadas de los puntos  

        System.out.print("\nIngrese la cantidad de puntos del polígono: ");
        elementos = entrada.nextInt(); // ingreso un entero: variable = entrada.nextInt()
        Poligono poligono = new Poligono(elementos); // creo un poligono con el numero de puntos = elementos

        System.out.print("\nIngrese las coordenadas del poligono en sentido horario: ");
        for (int i = 0; i < elementos; i++) {
            System.out.print("\nIngrese la coordenada X  del punto " + (i + 1) + " :" );
            int elementos = entrada.nextInt(); // ingreso un entero: variable = entrada.nextInt()


        }


    }

}
