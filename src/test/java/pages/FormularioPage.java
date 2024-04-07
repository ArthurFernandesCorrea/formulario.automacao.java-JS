package pages;

import org.openqa.selenium.By;

import metodos.MetodosDeTestes;

public class FormularioPage {
	
	By nome = By.id("nome");
	By sobrenome = By.id("sobrenome");
	By dataNascimento = By.id("dataNascimento");
	By whatsapp = By.id("whatsapp");
	By cadastrar = By.xpath("//button[text() ='Cadastrar']");

	
	MetodosDeTestes metodo = new MetodosDeTestes();
	
	public void cadastrar(String nome, String sobrenome, String dataNascimento, String whatsapp, String textoParaValidar) {
		
		//preencher o nome
		metodo.escrever(this.nome, nome);
		
		//preencher o sobrenome
		metodo.escrever(this.sobrenome, sobrenome);
		
		//preencher o dataNascimento
		metodo.escrever(this.dataNascimento, dataNascimento);
		
		//preencher o whatsapp
		metodo.escrever(this.whatsapp, whatsapp);
		
		//clicar no botão
		metodo.clicar(this.cadastrar);
		
		//validar a Alert
		metodo.validarMsgAlert(textoParaValidar);
		
	}

}
