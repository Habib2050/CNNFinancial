package Practice.FinanciacAutomation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.config.ObjectMap;
import com.masterPageFactory.MasterPageFactory;

public class FinancialAutomationn {


		WebDriver  driver;
		MasterPageFactory pf;
		
		
		@BeforeTest
		
		public void setup() {
		
			System.setProperty("webdriver.chrome.driver", "/Users/habib/Desktop/chromedriver");
			
			//WebDriver driver = new ChromeDriver();// upcasting
			
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		}
		@Test //TestCase 1
		
		public void login() throws Throwable  {
			
			ObjectMap obj= new ObjectMap();
			
			driver.get(obj.getconfig("URL"));
			
			//driver.navigate().to("https://www.cnn.com/business");
			Thread.sleep(3000);
			
			
		pf=PageFactory.initElements(driver, MasterPageFactory.class);
		
		}
			
			@Test (dependsOnMethods= "login") //TestCase 2
			public void cnnPages() throws Throwable {
			
				//Market
			pf.getMarket().click(); //driver.findElement(By.xpath("(//*[@name='markets'])[1]")).click();
			Thread.sleep(2000);
	        String actualTitle = driver.getTitle();
			String expectedTitle = "Stock Market Data - Dow Jones, Nasdaq, S&P 500 - CNNMoney";
			//assertEquals(expectedTitle,actualTitle);
			
			//String title= driver .getTitle();
			System.out.println("Marrket title is: " + actualTitle);
			Assert.assertEquals(actualTitle,"Stock Market Data - Dow Jones, Nasdaq, S&P 500 - CNNMoney" );
	

		
			//Tech
			pf.getTech().click(); //driver.findElement(By.xpath("(//*[text()='Tech'])[1]")).click();
			Thread.sleep(2000);
			
			String techtitle= driver.getTitle();
			System.out.println("Tech title is: " +techtitle);
			Assert.assertEquals(techtitle,"Tech News - Latest Technology Headlines and Trends on CNN Business - CNN" );
            
            
            //Media
            pf.getMedia().click();//driver.findElement(By.xpath("(//*[text()='Media'])[1]")).click();
			Thread.sleep(2000);
			String mediatitle= driver.getTitle();
			System.out.println("Media title is: " +mediatitle);
			Assert.assertEquals(mediatitle,"Media News - Latest Headlines on CNN Business - CNN" );
            
            
            
            //Success
            pf.getSuccess().click();//driver.findElement(By.xpath("(//*[text()='Success'])[1]")).click();
			Thread.sleep(2000);
			String successtitle= driver.getTitle();
			System.out.println("Success title is: " +successtitle);
			Assert.assertEquals(successtitle,"Careers - News for Entrepreneurs and Leaders on CNN Business - CNN" );
            Thread.sleep(2000);
            
            
          //Perspectives
            pf.getPerspective().click();//driver.findElement(By.xpath("(//*[text()='Perspectives'])[1]")).click();
			Thread.sleep(3000);
			String perspectivesstitle= driver.getTitle();
			System.out.println("Perspective title is: " + perspectivesstitle);
			Assert.assertEquals(perspectivesstitle,"Analysis – CNN Business - CNN" );
            Thread.sleep(2000);
            
            
            //Video
            pf.getVideos().click();//driver.findElement(By.xpath("(//*[text()='Videos'])[1]")).click();
			Thread.sleep(3000);
			String videostitle= driver.getTitle();
			System.out.println("Videos title is: " +videostitle);
			Assert.assertEquals(videostitle,"Videos - CNN Business - CNN" );
            Thread.sleep(2000);
            
          
            
 
            
	}
			@Test(dependsOnMethods= "cnnPages") //Test Case- 3
			public void testcasenumber3() throws Throwable {
				pf.getMarket().click();
				Thread.sleep(2000);
			
				List<String> listofdata= new ArrayList<>();
				for(int i=0; i < pf.getTopSection().size(); i++) {
					
					listofdata.add(pf.getTopSection().get(i).getText());
					
					
				}
				System.out.println("Data of Top Section :" + listofdata);
				
			}
			
			@Test(dependsOnMethods="testcasenumber3" )//Test case-4
			public void testcasenumber4() {
				List<String> listofmostpopular=new ArrayList<>();
				
				for(int i=0; i<pf.getMostPopular().size(); i++) {
					
					listofmostpopular.add(pf.getMostPopular().get(i).getText());
					
				}
				
				System.out.println("List Of Most popular :" + listofmostpopular);
				
			}
		@Test (dependsOnMethods="testcasenumber4")// Test case-5
		public void testcasenumber5() {
			
		}
		@Test (dependsOnMethods="testcasenumber5") //Test case-6
		public void testcase6() {
			
		}
		@Test(dependsOnMethods="testcase6")//Teast case-7
		public void testcasenumber7() {
			
		}
		@Test(dependsOnMethods="testcasenumber7")//Test case-8
		public void testcasenumber8() {
			
		}
		@Test(dependsOnMethods="testcasenumber8")//Test case-9
		public void testcase9() {
			
		}
		@Test(dependsOnMethods="testcase9")//Test case-10
		public void testcasenumber10()
		{
			
		}
		
	@AfterTest
	
	public void teardown()
	{
		driver.quit();
	}
		
		

}
