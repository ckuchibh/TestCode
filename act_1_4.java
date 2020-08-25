package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class act_1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		//Open browser
		driver.get("https://the-internet.herokuapp.com/login");
			
		//Print title of page and heading on page
		System.out.println("Page title is: " + driver.getTitle());
		String loginHeading = driver.findElement(By.tagName("h2")).getText();
		System.out.println("We are in: " + loginHeading);
			
		//Find the username field
		driver.findElement(By.id("username")).sendKeys("tomsmith");
			
		//Find the password field
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
			
		//Submit
		driver.findElement(By.tagName("button")).click();
			
		//Read the heading of the page and click logout
		String secureAreaHeading = driver.findElement(By.tagName("h2")).getText();
		System.out.println("After Logging in: " + secureAreaHeading);
		//driver.findElement(By.tagName("a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/a")).click();
			
		//Close the Browser
		//driver.close();
		
	//	.button
	//	html.no-js body div.row div#content.large-12.columns div.example a.button.secondary.radius
	//	/html/body/div[2]/div/div/a
		
	}

}

