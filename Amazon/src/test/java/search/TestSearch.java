package search;

import Base.CommonApi;
import datasupply.DataReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import searchP.searchItems;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class TestSearch extends CommonApi {

    DataReader dataReader = new DataReader();

    @Test
    public void test1() throws Exception {
        List<String> list = dataReader.getItemListFromDB();
        for(String items:list) {
            typeOnWebElement("#twotabsearchtextbox", items);
            //clickOnWebElement("#nav-search-submit-text");
            clearInputField("#twotabsearchtextbox");
        }


//        driver.findElement(By.id("twotabsearchtextbox"))
//                .sendKeys("Books", Keys.ENTER);
//        driver.findElement(By.id("twotabsearchtextbox")).clear();
//        driver.findElement(By.id("searchDropdownBox"))
//                .sendKeys("ALL", Keys.ENTER);
//        driver.findElement(By.id("twotabsearchtextbox"))
//                .sendKeys("OnePlus 8", Keys.ENTER);
        //sendkeys is the computer keys for the web browser
        //using testNG jar file to run the test
    }


//    @Test
//    public void test1A(){
//        typeOfWebElementNEnter("#twotabsearchtextbox", "One Plus 8 pro" );
//        clickOnWebElement("#nav-search-submit-text");
//        clearInputField("#twotabsearchtextbox");
//    }

//    @Test
//    public void test2() {
//        driver.findElement(By.id("twotabsearchtextbox"))
//                .sendKeys("Laptops", Keys.ENTER);
//        driver.findElement(By.id("twotabsearchtextbox")).clear();
//        driver.findElement(By.id("searchDropdownBox"))
//                .sendKeys("ALL", Keys.ENTER);
//        driver.findElement(By.id("twotabsearchtextbox"))
//                .sendKeys("Monitors", Keys.ENTER);
        //sendkeys is the computer keys for the web browser
        //using testNG jar file to run the test
    }

