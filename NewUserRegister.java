package org.app.adactin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewUserRegister {
	public static void main(String[] args) throws AWTException, InterruptedException {
		//set the property of the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-workspace\\Selenium_Intro\\driver\\chromedriver.exe");
		//initialize webdriver interface
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement newUser = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
		newUser.click();
		
		WebElement username = driver.findElement(By.id("username"));
		username.click();
		
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
	      
	      WebElement password = driver.findElement(By.id("password"));
			password.click();
		      robot.keyPress(KeyEvent.VK_P);
		      robot.keyPress(KeyEvent.VK_R);
		      robot.keyPress(KeyEvent.VK_I);
		      robot.keyPress(KeyEvent.VK_Y);
		      robot.keyPress(KeyEvent.VK_A);
		      robot.keyPress(KeyEvent.VK_0);
		      robot.keyPress(KeyEvent.VK_4);
		      
		      WebElement repass = driver.findElement(By.id("re_password"));
				repass.click();
			      robot.keyPress(KeyEvent.VK_P);
			      robot.keyPress(KeyEvent.VK_R);
			      robot.keyPress(KeyEvent.VK_I);
			      robot.keyPress(KeyEvent.VK_Y);
			      robot.keyPress(KeyEvent.VK_A);
			      robot.keyPress(KeyEvent.VK_0);
			      robot.keyPress(KeyEvent.VK_4);
			


		      WebElement fullname = driver.findElement(By.id("full_name"));
				fullname.click();
				robot.keyPress(KeyEvent.VK_L);
			      robot.keyPress(KeyEvent.VK_A);
			      robot.keyPress(KeyEvent.VK_K);
			      robot.keyPress(KeyEvent.VK_S);
			      robot.keyPress(KeyEvent.VK_H);
			      robot.keyPress(KeyEvent.VK_M);
			      robot.keyPress(KeyEvent.VK_I);
			      robot.keyPress(KeyEvent.VK_SPACE);
			      robot.keyPress(KeyEvent.VK_P);
			      robot.keyPress(KeyEvent.VK_R);
			      robot.keyPress(KeyEvent.VK_I);
			      robot.keyPress(KeyEvent.VK_Y);
			      robot.keyPress(KeyEvent.VK_A);
			      
				
			      WebElement email = driver.findElement(By.id("email_add"));
			      email.click();
			      
			      robot.keyPress(KeyEvent.VK_CAPS_LOCK);
			     
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
			     robot.keyPress(KeyEvent.VK_SHIFT);
			     robot.keyPress(KeyEvent.VK_2);
			     robot.keyRelease(KeyEvent.VK_SHIFT);
			     robot.keyRelease(KeyEvent.VK_2);
			      robot.keyPress(KeyEvent.VK_G);
			      robot.keyPress(KeyEvent.VK_M);
			      robot.keyPress(KeyEvent.VK_A);
			      robot.keyPress(KeyEvent.VK_I);
			      robot.keyPress(KeyEvent.VK_L);
			      robot.keyPress(KeyEvent.VK_PERIOD); //dot
			      robot.keyPress(KeyEvent.VK_C);
			      robot.keyPress(KeyEvent.VK_O);
			      robot.keyPress(KeyEvent.VK_M);
			      robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
			      
			      Thread.sleep(30000);
			      
			      WebElement agreeCheckbox = driver.findElement(By.id("tnc_box"));
			      agreeCheckbox.click();
			      WebElement submit = driver.findElement(By.id("Submit"));
			      submit.click();
		
			      
		
}
}
