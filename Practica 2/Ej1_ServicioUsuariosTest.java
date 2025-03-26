package tema3_cajaNegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Ej1_ServicioUsuariosTest {
    @Test
    public void testearUsuario() {
		Ej1_BaseDeDatos baseDeDatos = new Ej1_BaseDeDatos();
		Ej1_ServicioUsuarios test = new Ej1_ServicioUsuarios(baseDeDatos);
		test.registrarUsuario("Alfonso");
		assertTrue(test.usuarioRegistrado("Alfonso"));
    }
}

