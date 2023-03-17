package org.Baseclass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclassnew {
	static WebDriver driver;

	// 1.Browser launch
	public static void browserconfigchrome() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
	}

	// 2.get url
	public static  void openurl(String url) {
		driver.get(url);
	}

	// 3.maximize the window
	public static  void maximizeWindow() {
		driver.manage().window().maximize();

	}

	// 4.get currenturl
	public static void getcurrenturl() {
		driver.getCurrentUrl();

	}

	// 5.get title
	public String getTitle() {
		String title = driver.getTitle();
		return title;

	}

	// 6.find the static element usingid
	public WebElement locatebyid(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;

	}

	// 7.find the element usingXpath
	public WebElement locatebyXpath(String Xpath) {
		WebElement element = driver.findElement(By.xpath(Xpath));
		return element;

	}

	// 8.find the Element usingname
	public WebElement locatebyname(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;

	}

	// 9.get the Element usingsendkeys
	public static void textinput(WebElement element, String Value) {
		element.sendKeys(Value);

	}

	// 10.click method
	public static void click(WebElement element) {
		element.click();
	}

	// #11.get the value using attribute
	public String getAttribute(WebElement element) {
		String attribute = element.getAttribute("Value");
		System.out.println(attribute);
		return attribute;

	}

	// #12.get the text from the webpage
	public String gettext(WebElement element) {
		String text = element.getText();
		return text;
	}

	// 13.move To element
	public void movetoelement(WebElement element, String Xpath) {
		Actions x = new Actions(driver);
		x.moveToElement(element).perform();
	}

	// 14.drag And Drop
	public void dragAndDrop(WebElement source, WebElement target) {
		Actions x = new Actions(driver);
		x.dragAndDrop(source, target).perform();

	}

	// 15.takescreenshot
	public void takescreenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(Source, destination);

	}

	// 16.Keyboard actions
	private void Keyboardactions() {

	}

	// 17.doubleclick
	private void doubleclick(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();

	}

	// 18.Alert and accept
	public void alertaccept() {
		Alert al = driver.switchTo().alert();
		al.accept();

	}

	// 19.Alert and Dissmiss
	public void alertdismiss() {
		Alert al = driver.switchTo().alert();
		al.accept();

	}

	// 20
	public Alert alert(String input) {
		Alert al = driver.switchTo().alert();
		return al;

	}

	// 21
	public void jssetattribute(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object obj = js.executeScript("arguments[0].setAttribute('value','abi')", element);

	}

	// 22
	public void jsgetattribute(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object obj = js.executeScript("arguments[0].getAttribute('value')", element);
	}

	// 23
	public void jsclick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

	}

	// 24
	public void jsScrolldown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object obj = js.executeScript("arguments[0].Scrollintoview(true)", element);

	}

	// 25
	public void jsScrollup(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object obj = js.executeScript("arguments[0].Scrollintoview(frue)", element);
	}

	// 26
	public void frameid(String id) {
		driver.switchTo().frame(id);

	}

	// 27
	public void frameelement(WebElement element) {
		driver.switchTo().frame(element);

	}

	// 28
	public void frameindex(int index) {
		driver.switchTo().frame(index);

	}

	// 29
	public void parentframe() {
		driver.switchTo().parentFrame();

	}

	// 30
	public List<WebElement> noofframes(String id) {
		List<WebElement> list = (List<WebElement>) driver.findElement(By.tagName(id));
		int Size = list.size();
		return list;

	}

	// 31
	private void navigateTo(String url) {
		driver.navigate().to(url);

	}

	// 32
	private void navigateBack() {
		driver.navigate().back();

	}

	// 33
	private void navigateForward() {
		driver.navigate().forward();

	}

	// 34
	public static void navigatRefresh() {
		driver.navigate().refresh();

	}

	// 35
	public void SelectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);

	}

	// 36
	public void SelectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);

	}

	// 37
	public void deselectAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();

	}

	// 38
	public void SelectByVisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	// 39
	public void deselectByindex(WebElement element, int index) {
		Select s = new Select(element);
		s.deselectByIndex(index);
	}

	// 40
	public void deselectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByValue(value);
	}

	// 41
	public void deselectByVisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.deselectByVisibleText(text);
	}

	// 42
	public boolean isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean b = s.isMultiple();
		return b;

	}

	// 43
	public void getFirstSelectedOption(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption);

	}

	// 44
	public void getoptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			options.get(i);
		}
	}

	// 45
	public void quit() {
		driver.quit();

	}

	// 46
	public void close() {
		driver.close();

	}

	// 47
	public String excelRead(String path, String SheetName, int rowIndex, int cellIndex) throws IOException {

		String Value = null;
		File f = new File(path);
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet(SheetName);
		Row r = s.getRow(rowIndex);
		Cell c = r.getCell(cellIndex);
		//System.out.println(c);

		int cellType = c.getCellType();
		//System.out.println("cellType:" + cellType);
		if (cellType == 1) {
			Value = c.getStringCellValue();

			//System.out.println(Value);

		}

		else if (cellType == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue = c.getDateCellValue();

				SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");

				Value = sim.format(dateCellValue);
				//System.out.println(Value);

			} else {
				double numericCellValue = c.getNumericCellValue();

				long l = (long) numericCellValue;
				Value = String.valueOf(l);
				//System.out.println(Value);

			}
		}
		return Value;
	}

	// 48
	public void excelWrite(String path, String SheetName, int rowIndex, int cellIndex, String Value)
			throws IOException {

		File f = new File(path);

		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet(SheetName);
		Row r = s.getRow(rowIndex);
		Cell c = r.getCell(cellIndex);
		c.setCellValue(Value);
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);
	}
}






