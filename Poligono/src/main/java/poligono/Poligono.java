package poligono;
public class Poligono extends Figura {

    // atributos
    private int elementos; // número de puntos del poligono
    private  Punto[] poligono; // poligono es el nombre del arreglo de puntos

    // constructor
    public Poligono(int elementos) {
        this.elementos = elementos;
        poligono = new Punto[elementos]; // inicializo el arreglo poligono con la cantidad de puntos dada por elementos
    }

    // Metodos:

    // pongo un punto de la clase Punto en el poligono en la posición dada por posicion
    // Uso:  <nombre del poligono>(posicion, punto)
    // posicion es un entero y punto es un objeto de la clase Punto
    void Insertar(int posicion, Punto punto) {  // pongo un punto de la clase Punto en la posición dada por posicion
        poligono[posicion] = punto;
    }

    // guarda la coordenada X del punto que esta en el indice posición del poligono
    // Uso: <nombre del poligono>.guardarPuntoX(posicion, x)
    // posicion es entero y x es Double
    void guardarPuntoX(int posicion, Double x) { // retorna la coordenada X del punto que esta en el indice posición
        poligono[posicion].setX(x);
    }

    // guarda la coordenada Y del punto que esta en el indice posición del poligono
    // Uso: <nombre del poligono>.guardarPuntoY(posicion, y)
    // posicion es entero e y  es Double
    void guardarPuntoY(int posicion, Double y) {
        poligono[posicion].setY(y);
    }

}
