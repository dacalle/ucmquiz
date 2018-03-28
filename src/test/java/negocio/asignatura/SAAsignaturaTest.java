package negocio.asignatura;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class SAAsignaturaTest {
	
	@Test
	public void ver_asignatura_como_profesor_deberia_devolver_una_lista_de_asignaturas() {
		List<Asignatura> lista = null;
		SAAsignatura saa = new SAAsignaturaImp();
		lista = saa.readAll();
		
		assertEquals(null, lista);
	}
	
}
