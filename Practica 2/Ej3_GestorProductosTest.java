package tema3_cajaNegra;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Ej3_GestorProductosTest {
	@Test
    public void productoRegistradoTest() {
    	Ej3_BaseDeDatosProductos baseDeDatos = new Ej3_BaseDeDatosProductos();
    	Ej3_GestorProductos producto = new Ej3_GestorProductos(baseDeDatos);
    	producto.registrarProducto("Tomates");
        assertTrue(producto.productoRegistrado("Tomates"));
    }
}
