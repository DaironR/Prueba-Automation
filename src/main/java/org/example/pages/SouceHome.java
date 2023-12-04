package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SouceHome {
    private final WebDriver driver;

    // Web elements
    private final By usuario = By.id("user-name");
    private final By clave = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By productsInventory = By.id("inventory_container");

    public SouceHome(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get("https://www.saucedemo.com/");
    }

    public void usuario(String keyword) {
        driver.findElement(usuario).sendKeys(keyword);
    }

    public void clave(String keyword) {
        driver.findElement(clave).sendKeys(keyword);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public boolean products() {
        return driver.findElement(productsInventory).isDisplayed();
    }

}
