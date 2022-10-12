package testeLogin;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testeLoginSite {
private WebDriver driver;

@Before
public void abrirNavegador () {
	System.setProperty("webdriver.chrome.driver","C:\\Arquivos de Programas\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver ();
	driver.manage().window().maximize();
}
@Test 
public void testeNavegador (){
	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	
	driver.get("http://localhost:4200/login");
	
	WebElement inputEmail = driver.findElement(By.id("email_login"));
	WebElement inputSenha = driver.findElement(By.id("password_login"));
	WebElement botaoLogin = driver.findElement(By.id("submit_login"));
	
	String[] listaSenhas = {"senha1", "senhaerrada", "teste1", "test", "senhaerradaoutravez", "raianeoliveira"};
 	for (int tentativas = 0; tentativas < listaSenhas.length; tentativas++) {
 		try {
 		inputEmail.clear();
 		inputSenha.clear();
	
		inputEmail.sendKeys("raiane@outlook.com");
		inputSenha.sendKeys(listaSenhas[tentativas]);
		botaoLogin.click();
		
		Thread.sleep(3000);
 			}catch(InterruptedException e) {
 		e.printStackTrace();	
 											}
 		
 		   																	}
    						}

}
