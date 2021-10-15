import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;

public class DriverTest {
    public void openPage(){
        $("div.MainMenu__link").click();
        $(By.xpath(".//span[contains(text(),'Акции')]")).click();
        assertEquals($("div.MainMenu__link").getText().trim(), "Журнал");
    }

}