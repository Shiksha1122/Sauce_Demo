package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {
	private WebDriver driver;	
	
	private By breadCrumbIconLocator = By.xpath("//div[@class='bm-burger-button']");
	private By logOutLocator = By.id("logout_sidebar_link");
	
	public LogoutPage( WebDriver driver) {
		this.driver = driver;
		 
	}
	
	public void clickOnBreadCrumbIcon() {
		WebElement breadcrumbIcon = driver.findElement(breadCrumbIconLocator);
		breadcrumbIcon.click();
	}
	 public void logout() {
		 WebElement logouttext = driver.findElement(logOutLocator);
		 logouttext.click();
	 }

}
