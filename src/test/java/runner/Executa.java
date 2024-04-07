package runner;

import org.openqa.selenium.edge.EdgeDriver;

import drivers.DriversFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Executa extends DriversFactory {

	public static void abrirNavegador() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("Adicionar diretório do arquivo html");
	}

	public static void fecharNavegador() {
		driver.quit();
	}

}
