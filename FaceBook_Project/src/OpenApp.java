import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenApp {

	public static void main(String[] args) {

		FirefoxDriver driver =new FirefoxDriver();
		
		driver.get("http://facebook.com/");
		
		driver.getTitle();
		System.out.println("Facebook page is opened");
		System.out.println("Facebook main page  is opened");
	}

}
