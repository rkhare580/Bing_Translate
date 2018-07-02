import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppTest {
	
	App appObject = new App();	
	
 @Test (priority = 0)
 public void InputDrop() {
	 appObject.inputSelection();
 }

 @Test (priority = 1)
 public void OutputDrop() {
	 appObject.outputSelection();
 }
 
 @Test (priority = 2)
 public void sendText()
 {
	 appObject.sendtext();
 }
  
 @Test (priority = 3)
 public void checkTranslation() throws InterruptedException {
	Assert.assertTrue(appObject.translation());
 }
	
  @BeforeClass
  public void beforeClass() {
	  appObject.launchBrowser();
  }

  @AfterClass
  public void afterClass() {
	  appObject.closeBrowser();
  }


  
}