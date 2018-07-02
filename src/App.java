
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class App 
{
	static WebDriver driver;
	String translatedText;
	Boolean condi = false;
	
	
	public void inputSelection() {
		  Select iValue = new Select(driver.findElement(By.id("t_sl")));
	       iValue.selectByVisibleText("Spanish");
			System.out.println(iValue);
		}

		public void outputSelection() {
			Select oValue = new Select(driver.findElement(By.id("t_tl")));
			oValue.selectByVisibleText("English");
			System.out.println(oValue);

		}	
	
	public void launchBrowser()  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rohitkhare\\eclipse-workspace\\BingTranslate\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.bing.com/translator");
		
	}
	
	public void closeBrowser() {
		driver.quit();
	}

	public void sendtext() {
driver.findElement(By.id("t_sv")).sendKeys("Hola");		
	}

	public boolean translation() throws InterruptedException {
Thread.sleep(5000);
		WebElement translatedtext = driver.findElement(By.id("t_tv"));
		System.out.println(translatedtext.getAttribute("value").toString());
		String translateText = translatedtext.getAttribute("value");
		System.out.println(translateText);
		if(translateText.equals("Hello"))
			condi = true;
		return condi;
	}
	
	
	
}