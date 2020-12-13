package search;

import Base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestSearch extends CommonApi {

    @Test
    public void test1(){
        driver.findElement(By.id("twotabsearchtextbox"))
                .sendKeys("Books", Keys.ENTER);
        driver.findElement(By.id("twotabsearchtextbox")).clear();
        driver.findElement(By.id("searchDropdownBox"))
                .sendKeys("ALL", Keys.ENTER);
        driver.findElement(By.id("twotabsearchtextbox"))
                .sendKeys("OnePlus 8", Keys.ENTER);
        //sendkeys is the computer keys for the web browser
        //using testNG jar file to run the test
    }
    @Test
    public void test2() {
        driver.findElement(By.id("twotabsearchtextbox"))
                .sendKeys("Laptops", Keys.ENTER);
        driver.findElement(By.id("twotabsearchtextbox")).clear();
        driver.findElement(By.id("searchDropdownBox"))
                .sendKeys("ALL", Keys.ENTER);
        driver.findElement(By.id("twotabsearchtextbox"))
                .sendKeys("Monitors", Keys.ENTER);
        //sendkeys is the computer keys for the web browser
        //using testNG jar file to run the test
    }
}
