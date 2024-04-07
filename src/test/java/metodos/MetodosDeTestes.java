package metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import drivers.DriversFactory;

public class MetodosDeTestes extends DriversFactory{
	
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	
	}
	
public void clicar(By elemento) {
	driver.findElement(elemento).click();
		
	}

public void validarTexto(By elemento, String textoEsperado) {
	String textoCapturado = driver.findElement(elemento).getText();
	assertEquals(textoEsperado, textoCapturado);
	
}
public void validarMsgAlert(String textoEsperado) {
	String msgAlert = driver.switchTo().alert().getText();
	System.out.println(msgAlert);
	assertTrue(msgAlert.contains(textoEsperado));
	
}

}
