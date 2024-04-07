package steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pages.FormularioPage;
import runner.Executa;

public class PrimeiroTeste {
	
	FormularioPage formulario = new FormularioPage();
	
	

	@Before
	public void antesDoTeste() {
		Executa.abrirNavegador();
	}
	
	@After
	public void depoisDoteste() {
		Executa.fecharNavegador();
	}
	
	
	@Test
	public void teteCadastrar() {
		
		String msgEsperada = "Cadastro realizado com sucesso.\n"
				+ "\n"
				+ "Nome: Arthur\n"
				+ "Sobrenome: Correa\n"
				+ "Data de Nascimento: 1993-07-13\n"
				+ "Whatsapp: 11983335970";
				
				formulario.cadastrar("Arthur", "Correa", "13-07-1993", "11983335970", msgEsperada);
		
	}
}
