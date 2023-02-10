package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Certificate {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions opt = new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://expired.badssl.com/");
		
//		ProfilesIni p = new ProfilesIni();
//		FirefoxProfile fp = p.getProfile("user");
//		fp.setAcceptUntrustedCertificates(true);
		
		
		
		
	}
}
