package base;

import java.nio.file.Paths;
import java.util.ArrayList;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class Base {

	public static Page page;

	
	
	public void tearDown() {
		
		System.out.println("AfterSuite");
		page.close();
	}

	// public static void shut(){
	// System.out.println("tarek");
	// page.close();
	// }

	// print method

	public static void print(String s) {
		System.out.println(s);
	}

	// get any filed attribute

	public static String hasText(String locator, String Key) {
		return page.locator(locator).getAttribute(Key);
	}

	// CLick Method
	public static void click(String locator) {
		page.locator(locator).click();
	}

	// navigate method
	public static void navigate(String n) {
		page.navigate(n);
	}

	// fill method
	public static void fill(String locator, String value) {
		page.locator(locator).fill(value);
	}

	public static String innerText(String locator) {
		String s = page.locator(locator).innerText();
		return s;
	}

}
