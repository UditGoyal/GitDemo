import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hotelbids.com/");
		System.out.println("adding some lines");
		System.out.println("for demo purpose");
		System.out.println("changes by x ");
		System.out.println("x");
		System.out.println("on github");
		String strYear = "September 2019";
		driver.findElement(By.name("start")).click();
		while(!driver.findElement(By.className("datepicker-switch")).getText().equalsIgnoreCase(strYear))
		{
			driver.findElement(By.className("next")).click();
		}
		driver.findElement(By.xpath("//td[text()='19']")).click();
<<<<<<< HEAD
		
		
=======
		System.out.println("architect changes");
>>>>>>> 01977528b5e1f72a334fd326ac6d4fd80c1c0719
	}
		

}
