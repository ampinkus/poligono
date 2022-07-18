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
    public void Insertar(int posicion, Punto punto) {  // pongo un punto de la clase Punto en la posición dada por posicion
        poligono[posicion] = punto;
    }

    // guarda la coordenada X del punto que esta en el indice posición del poligono
    // Uso: <nombre del poligono>.guardarPuntoX(posicion, x)
    // posicion es entero y x es Double
    public void guardarPuntoX(int posicion, Double x) { // retorna la coordenada X del punto que esta en el indice posición
        poligono[posicion].setX(x);
    }

    // guarda la coordenada Y del punto que esta en el indice posición del poligono
    // Uso: <nombre del poligono>.guardarPuntoY(posicion, y)
    // posicion es entero e y  es Double
    public void guardarPuntoY(int posicion, Double y) {
        poligono[posicion].setY(y);
    }

    // Muestro el valor de la coordenada X del punto en el indice posicion del polígono
    // Uso: <nombre del poligono>.MostrarX(posicion)
    // posicion es un entero
    public void MostrarX(int posicion) {
        // poligono[posicion] me retorna el punto y le aplico getX() al mismo
        System.out.println(poligono[posicion].getX());
    }

    // Muestro el valor de la coordenada Y del punto en el indice posicion del polígono
    // Uso: <nombre del poligono>.MostrarY(posicion)
    // posicion es un entero
    public void MostrarY(int posicion) {
        // poligono[posicion] me retorna el punto y le aplico getY() al mismo
        System.out.println(poligono[posicion].getY());
    }

    // retorna la coordenada X del punto que esta en el indice posición del poligono
    // Uso: <nombre del poligono>.retornarPuntoX(posicion)
    // posicion es un entero
    public Double retornarPuntoX(int posicion) { // retorna la coordenada X del punto que esta en el indice posición
        return poligono[posicion].getX();
    }

    // retorna la coordenada Y del punto que esta en el indice posición del poligono
    // Uso: <nombre del poligono>.retornarPuntoY(posicion)
    // posicion es un entero
    public Double retornarPuntoY(int posicion) {
        return poligono[posicion].getY();
    }


    // Calculamos el valor del area utilizando la formula de "lazo de zapato"
    // Uso:  Los argumentos son el poligono del cual queremos calcular el área y el número de vertices
    public double areaPoligono(Poligono poligono, int n)
    {
        // inicializamos el  area
        Double area = 0D;
        int j = n - 1;
        for (int i = 0; i < n; i++) {
            // area += (X[j] + X[i]) * (Y[j] - Y[i]);
            area += (poligono.retornarPuntoX(j)  + poligono.retornarPuntoX(i)) * (poligono.retornarPuntoY(j) - poligono.retornarPuntoY(i));
            // agregamos el ultimo vertice nuevamente
            j = i;
        }
        // Retornamos el valor absoluto del área
        return Math.abs(area / 2.0);
    }


}
