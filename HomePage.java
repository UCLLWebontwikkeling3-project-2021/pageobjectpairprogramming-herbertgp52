import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends Page{
    public HomePage(WebDriver driver) {
        super(driver);
        this.driver.get(getPath()+"?command=LogIn"); //TODO verandeer command naar action als nodig
    }

    public void signIn(String userId, String pass){
        //TODO verander id naar eigen id
        fillOutField("email", userId);
        fillOutField("password", pass);

        WebElement button=driver.findElement(By.id("logIn"));
        button.click();
    }

    private void fillOutField(String name,String value) {
        WebElement field=driver.findElement(By.id(name));
        field.clear();
        field.sendKeys(value);
    }


}
