package com.aphelium.testautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriveFactory {

	private static WebDriver _driver;

	public static void startDriver() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		_driver = new ChromeDriver();
		_driver.manage().window().maximize();
	}

	public static void quitDriver() {
		driver().close();
		driver().quit();
	}
	
	public static WebDriver driver() {
		return _driver;
	}

}
