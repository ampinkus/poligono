package poligono;

import org.junit.Test; // tengo que importar esta clase para poder usar @Test
import static org.junit.jupiter.api.Assertions.*; // tengo que importar esta clase para podr usar assert

public class PoligonoTest {

    @Test
    public void test_area_circunferencia(){
        // given: Donde ponemos los datos
        Double radio = 2D;
        Double area;
        Poligono poligono = new Poligono(1);

        //when: Donde ejecutamos el método a probar
        area = poligono.areaPoligono(radio);

        // then: Donde chequeamos el resultado
        // si el radio es 2 el área es PI * 4, con un delta de 2 y un radio de 1.9 da positivo
        assertEquals(Math.PI * 4, area,0.5);

    }

}