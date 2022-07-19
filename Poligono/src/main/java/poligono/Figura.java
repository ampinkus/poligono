package poligono;
public abstract class Figura {
    // clase abstracta donde defino dos métodos para calcular el area:
    // uno para una circunferencia y otro para un poligono.


    // Calculamos el valor del area de un poligono utilizando la formula de "lazo de zapato"
    // como es un metodo abstracto solo va la firma del mismo
    public abstract Double areaPoligono(Poligono poligono, int n);

    // Calculamos el area de una circunferencia PI * radio ^2
    // como es un metodo abstracto solo va la firma del mismo
    public abstract Double areaPoligono(Double radio);
}
