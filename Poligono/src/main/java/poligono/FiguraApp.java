package poligono;

import java.util.Scanner;
public class FiguraApp {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);  // creo el objeto entrada para escanear el teclado
        int elementos;  // numero de puntos del poligono
        Double X, Y; // coordenadas de los puntos

        System.out.print("\nIngrese la cantidad de puntos del poligono: ");
        elementos = entrada.nextInt(); // ingreso un entero: variable = entrada.nextInt()
        Punto[] puntos = new Punto[elementos]; // creo un arreglo de puntos para crear el polígono
        Poligono poligono = new Poligono(elementos); // creo un poligono con un numero elementos de puntos

        System.out.println("Ingrese las coordenadas del poligono en sentido horario: ");
        for (int i = 0; i < elementos; i++) {
            System.out.print("Ingrese la coordenada X  del punto " + (i + 1) + " : " );
            X = entrada.nextDouble(); // ingreso un Double: variable = entrada.nextDouble()
            System.out.print("Ingrese la coordenada Y  del punto " + (i + 1) + " : " );
            Y = entrada.nextDouble(); // ingreso un Double: variable = entrada.nextDouble()
            System.out.println();
            puntos[i] = new Punto(X,Y); // ingreso en el punto de indice i los valores de X e Y
            poligono.Insertar(i,puntos[i]);  // ingreso en el indice i del poligono el punto
        }

        for (int i = 0; i < elementos; i++) {  // muestro las coordenadas dee los puntos del poligono
            System.out.print("Coordenada X  del punto " + (i + 1) + " del poligono: " );
            poligono.MostrarX(i);
            System.out.print("Coordenada Y  del punto " + (i + 1) + " del poligono: " );
            poligono.MostrarY(i);
            System.out.println();
        }

        System.out.println("El area del poligono es: " + poligono.areaPoligono(poligono,elementos));

    }

}
