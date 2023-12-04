/* Hecho por Dairon Rico, escenario de prueba loguearse con un usuario en la página https://www.saucedemo.com/*/

package org.example.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.SouceHome;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    @Test
    public void login() {
        WebDriverManager.chromedriver().setup();

        // Inicializar ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Inicializar Pages
        SouceHome souceHome = new SouceHome(driver);

        // Ir a la página principal
        souceHome.openPage();

        // Ingresar credenciales
        souceHome.usuario("standard_user");
        souceHome.clave("secret_sauce");
        souceHome.clickLoginButton();

        // Verificar login
        Assert.assertTrue(souceHome.products());
        driver.quit();
    }
}
