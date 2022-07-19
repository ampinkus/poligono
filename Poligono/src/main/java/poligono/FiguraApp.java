package poligono;

import java.util.Scanner;
public class FiguraApp {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);  // creo el objeto entrada para escanear el teclado
        int elementos;  // numero de puntos del poligono
        Double X, Y; // coordenadas de los puntos
        Double radio; // radio de la circunferencia
        Double radioHorizontal, radioVertical;

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

         /*
         // muestro las coordenadas de los puntos del poligono, util para testeo
        for (int i = 0; i < elementos; i++) {
            System.out.print("Coordenada X  del punto " + (i + 1) + " del poligono: " );
            poligono.MostrarX(i);
            System.out.print("Coordenada Y  del punto " + (i + 1) + " del poligono: " );
            poligono.MostrarY(i);
            System.out.println();
        }
         */

        // ingreso el radio de una circunferencia
        System.out.print("Ingrese el radio de la circunferencia: ");
        radio = entrada.nextDouble();

        // ingreso los radios de la Elipse
        System.out.print("Ingrese el radio horizontal de la elipse: ");
        radioHorizontal = entrada.nextDouble();
        System.out.print("Ingrese el radio vertical de la elipse: ");
        radioVertical = entrada.nextDouble();

        System.out.println("El area del poligono es: " + poligono.areaPoligono(poligono,elementos));
        System.out.println("El area de la circunferencia es: " + poligono.areaPoligono(radio));
        System.out.println("El area de la elipse es: " + poligono.areaPoligono(radioHorizontal,radioVertical));

    }

}
