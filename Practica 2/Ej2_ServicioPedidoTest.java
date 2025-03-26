package tema3_cajaNegra;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Ej2_ServicioPedidoTest {
    @Test
    public void crearYEnviarPedidoTest() {
    	Ej2_ServicioEnvio Envio = new Ej2_ServicioEnvio();
    	Ej2_ServicioPedido Pedido = new Ej2_ServicioPedido(Envio);
    	assertTrue(Pedido.crearYEnviarPedido("Tomate"));
    	
    }
}

