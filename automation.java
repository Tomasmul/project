package automationQa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation {

	public static void main(String[] args) {
		Object sysyem;
		// TODO Auto-generated method stub
		
	//	System.out.println ("test");
	//	System.out.println("I am the fist Java guy");
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\tomas\\Desktop\\chromedriver.exe");
	//	
	//	WebDriver driver= new ChromeDriver();
		
	//	driver.get("www.facebook.com");
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tomas\\Desktop\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.gmail.com");
			driver.findElement(By.id(id))
		//	driver.get("https://www.facebook.com/");
			System.out.println(driver.getCurrentUrl());
			driver.findElement(By.id("email")).sendKeys("My username");
			driver.findElement(By.id("pass")).sendKeys("password");
			driver.findElement(By.id("u_0_b")).click();
//			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			driver.navigate().forward();
		//	driver.quit();
			driver.close();
			
		
		
	//Locator session	
/*		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tomas\\Desktop\\chromedriver.exe");
		
		// We create a webdriver object
		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://eaapp.somee.com/");
		// Get the element by ID
		driver1.findElement(By.id("registerLink")).click();
		System.out.println(driver1.getCurrentUrl());
		//Get the element by Link text
		driver1.findElement(By.linkText("Login")).click();
		System.out.println(driver1.getCurrentUrl());
		driver1.findElement(By.id("registerLink")).click();
		//Get the element by Name
		driver1.findElement(By.name("UserName")).sendKeys("Tester");
		
		// Get the element by xpath
		driver1.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("password");
		
		//Get the element by cssselector
		driver1.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("testing");

*/
			/*
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tomas\\Desktop\\chromedriver.exe");
		// We create a webdriver object
		WebDriver driver = new ChromeDriver();
 		driver.findElement(By.xpath(""));
		driver.get("https://www.spicejet.com/");
		//driver.manage().window().maximize();
		
		Select s = new Select(driver.findElement(By.xpath("//body/form/div/div/div/div/div/div/div/div/div/div/div/select[1]")));
		
		s.selectByVisibleText("USD");
		s.selectByIndex(0);
		s.selectByValue("AED");
		
		//driver.findElement(By.xpath("//body/form/div/div/div/div/div/div/div/div/div/div/div[1]/div[1]/span[1]")).click();
		//driver.findElement(By.xpath("//div//div//div//div//div//div//div//div//div//div//div//div[1]//div[2]//div[1]//table[1]//tbody[1]//tr[2]//td[2]//div[3]//div[1]//div[1]//ul[1]//li[9]//a[1]")).click();
		//driver.findElement(By.xpath("//body//div//div//div//div//div//div//div//div[2]//div[2]//div[1]//table[1]//tbody[1]//tr[2]//td[2]//div[3]//div[1]//div[1]//ul[1]//li[11]//a[1]")).click();

*/

	

}
	}

