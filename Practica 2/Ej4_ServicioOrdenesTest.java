package tema3_cajaNegra;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Ej4_ServicioOrdenesTest {

	@Test
    public void procesarOrdenTest() {
		Ej4_ServicioPagos Pagos = new Ej4_ServicioPagos();
		Ej4_ServicioOrdenes Ordenes = new Ej4_ServicioOrdenes(Pagos);
		assertTrue(Ordenes.procesarOrden(50));
    }
}

