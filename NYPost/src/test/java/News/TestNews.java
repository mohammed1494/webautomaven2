package News;

import Base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestNews extends CommonApi {

    @Test
    public void test1() {
        driver.findElement(By.cssSelector("svg.menu-icon-svg")).click();


    }
}
