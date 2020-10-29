package pruebas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Padre {
static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Anotaci�n: @BeforeClass");
		System.setProperty("webdriver.chrome.driver", "..\\TestVideo\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
	}

	@Before
	public void before() {
		System.out.println("Anotaci�n: @Before");
		driver.get("http://automationpractice.com/index.php");
	}
	
	@After
	public void after() {
		System.out.println("Anotaci�n: @After");

	}

	@AfterClass
	public static void afterClass() {
		System.out.println("Anotaci�n: @AfterClass");
		driver.quit();

	}
}
