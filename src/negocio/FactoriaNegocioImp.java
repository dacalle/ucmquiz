package negocio;

import negocio.pregunta.SAPregunta;
import negocio.pregunta.SAPreguntaImp;
import negocio.usuario.SAUsuario;
import negocio.usuario.SAUsuarioImp;

public class FactoriaNegocioImp extends FactoriaNegocio {
	
	public SAUsuario generateSAUsuario() {
		return new SAUsuarioImp();
	}

	public SAPregunta generateSAPregunta() {
		return new SAPreguntaImp();
	}

	
}