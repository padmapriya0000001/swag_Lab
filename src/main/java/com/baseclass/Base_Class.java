package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static void launchurl(WebDriver driver, String url) {

		driver.get(url);
	}

	public static void maxi(WebDriver d) {

		d.manage().window().maximize();

	}
	
	public static void timeouts(WebDriver d, int k ) {

		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(k));
		
	}

	public static void send_Keys(WebElement h, String value) {
		h.sendKeys(value);

	}

	public static void click(WebElement l) {

		l.click();

	}

	public static void select_index(WebElement si, int value) {

		Select s = new Select(si);
		s.selectByIndex(value);

	}

	public static void select_value(WebElement sv, String value) {
		Select s = new Select(sv);
		s.selectByValue(value);
	}

	public static void select_text(WebElement st, String value) {
		Select s = new Select(st);
		s.selectByVisibleText(value);
	}

	public static void clear(WebElement c) {
		c.clear();
	}
	
	public static void scroll(WebDriver d, WebElement e) {

		JavascriptExecutor js = (JavascriptExecutor) d;
		
		js.executeScript("arguments[0].scrollIntoView()", e);
	}
	
	public static void js_Click(WebDriver d, WebElement e) {

JavascriptExecutor js = (JavascriptExecutor) d;
		
		js.executeScript("arguments[0].click()", e);
	}
	
	public static void js_sendkey(WebDriver d, WebElement g,String value) {
JavascriptExecutor js = (JavascriptExecutor) d;
		
		js.executeScript(value, g);
	}
	
	public static void alert_accept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public static void screenshot(WebDriver driver, String path) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		FileUtils.copyFile(src, des);
	}

	public static void incognito() {

		ChromeOptions op= new ChromeOptions();
		op.addArguments("incognito");
		
	}
	
}
