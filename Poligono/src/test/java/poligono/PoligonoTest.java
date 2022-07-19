package poligono;

import org.junit.Test; // tengo que importar esta clase para poder usar @Test
import static org.junit.jupiter.api.Assertions.*; // tengo que importar esta clase para podr usar assert

public class PoligonoTest {
    @Test
    public void test_area_circunferencia_pasa(){
        // given: Donde ponemos los datos
        Double radio = 2D;
        Double area;
        Poligono circunferencia = new Poligono(1);


        //when: Donde ejecutamos el método a probar
        area = circunferencia.areaPoligono(radio);

        // then: Donde chequeamos el resultado
        // si el radio es 2 el área es PI * 4
        assertEquals(Math.PI * 4, area,0.5);
    }

    @Test
    public void test_area_circunferencia_no_pasa(){
        // given: Donde ponemos los datos
        Double radio = 2D;
        Double area;
        Poligono circunferemncia = new Poligono(1);

        //when: Donde ejecutamos el método a probar
        area = circunferemncia.areaPoligono(radio);

        // then: Donde chequeamos el resultado
        // si el radio es 2 el área es PI * 4, en este caso debe no debe pasar el test
        assertEquals(Math.PI * 3, area,0.5);
    }

    @Test
    public void test_area_poigono_pasa() {
        // Given
        Poligono poligono = new Poligono(3);  // genero un triangulo
        Punto[] punto = new Punto[3]; // genero los tres puntos para el trinagulo
        Double area = 0D;
        // genero los puntos del poligono
        punto[0] = new Punto(0D, 0D);
        punto[1] = new Punto(1D, 0D);
        punto[2] = new Punto(0D, 1D);
        // ingreso los puntos en el poligono
        poligono.Insertar(0, punto[0]);
        poligono.Insertar(1, punto[1]);
        poligono.Insertar(2, punto[2]);

        // when
        area = poligono.areaPoligono(poligono, 3);

        // then
        assertEquals(0.5, area, 0.1); // El area es 0.5, el test es correcto
    }

    @Test
    public void test_area_poigono_no_pasa(){
        // Given
        Poligono poligono = new Poligono(3);  // genero un triangulo
        Punto[] punto = new Punto[3]; // genero los tres puntos para el trinagulo
        Double area = 0D;
        // genero los puntos del poligono
        punto[0] = new Punto(0D,0D);
        punto[1] = new Punto(1D,0D);
        punto[2] = new Punto(0D,1D);
        // ingreso los puntos en el poligono
        poligono.Insertar(0,punto[0]);
        poligono.Insertar(1,punto[1]);
        poligono.Insertar(2,punto[2]);

        // when
        area = poligono.areaPoligono(poligono,3);

        // then
        assertEquals(1, area,0.1); // El area es 0.5 pero sugiero que es 1 , el test no pasa
    }

    @Test
    public void test_area_elipse_pasa(){
        // given: Donde ponemos los datos
        Double radioHorizontal = 2D;
        Double radioVertical = 1D;
        Double area;
        Poligono elipse = new Poligono(1);


        //when: Donde ejecutamos el método a probar
        area = elipse.areaPoligono(radioHorizontal,radioVertical);

        // then: Donde chequeamos el resultado
        // si el radioHorizontal es 2 y el radioVertical es 1 el area es PI * 2
        assertEquals(Math.PI * 2, area,0.5);
    }

    @Test
    public void test_area_Elipse_no_pasa(){
        // given: Donde ponemos los datos
        Double radioHorizontal = 2D;
        Double radioVertical = 1D;
        Double area;
        Poligono elipse = new Poligono(1);

        //when: Donde ejecutamos el método a probar
        area = elipse.areaPoligono(radioHorizontal,radioVertical);

        // then: Donde chequeamos el resultado
        // si el radioHorizontal es 2 y el radioVertical es 1 el area es PI * 2
        assertEquals(Math.PI * 3, area,0.5);
    }

}