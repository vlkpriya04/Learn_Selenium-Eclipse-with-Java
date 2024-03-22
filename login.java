package org.app.adactin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) throws AWTException, InterruptedException {
		//set the property of the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-workspace\\Selenium_Intro\\driver\\chromedriver.exe");
		//initialize webdriver interface
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	
		WebElement userName = driver.findElement(By.id("username"));
		userName.click();
		Robot robot = new Robot();
	      robot.keyPress(KeyEvent.VK_V);
	      robot.keyPress(KeyEvent.VK_L);
	      robot.keyPress(KeyEvent.VK_K);
	      robot.keyPress(KeyEvent.VK_P);
	      robot.keyPress(KeyEvent.VK_R);
	      robot.keyPress(KeyEvent.VK_I);
	      robot.keyPress(KeyEvent.VK_Y);
	      robot.keyPress(KeyEvent.VK_A);
	      robot.keyPress(KeyEvent.VK_0);
	      robot.keyPress(KeyEvent.VK_4);
	      
	      WebElement pass = driver.findElement(By.id("password"));
			pass.click();
			
		      robot.keyPress(KeyEvent.VK_P);
		      robot.keyPress(KeyEvent.VK_R);
		      robot.keyPress(KeyEvent.VK_I);
		      robot.keyPress(KeyEvent.VK_Y);
		      robot.keyPress(KeyEvent.VK_A);
		      robot.keyPress(KeyEvent.VK_0);
		      robot.keyPress(KeyEvent.VK_4);
		      
		      WebElement login = driver.findElement(By.id("login"));
		      login.click();
	      }
	}
