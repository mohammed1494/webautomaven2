package features;

import datafetch.FetchTheSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.SearchPage;
import pages.SectionPage;
import pages.SignUpPage;
import pages.landingPage;
import Base.CommonApi;

import java.io.IOException;

public class AllFunctionality {

    landingPage landingPage = null;
    SectionPage sectionPage = null;
    SearchPage searchPage = null;
    SignUpPage signUpPage = null;

    public AllFunctionality() throws IOException {
    }

    public void signUp(WebDriver driver) {
        landingPage = PageFactory.initElements(driver, landingPage.class);
        signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        landingPage.clickOnSignUp();
        signUpPage.enterEmailAddress("moali@gmail.com");
        signUpPage.clickOnSignUp();
    }

    public void search(WebDriver driver) {
        landingPage = PageFactory.initElements(driver, landingPage.class);
        landingPage.clickOnSearch();
        searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.clickOnSearchButton();
    }

    public void clickOnSectionMenu(WebDriver driver) throws InterruptedException {
        landingPage = PageFactory.initElements(driver, landingPage.class);
        landingPage.clickOnSectionMenu();
    }

    public void sectionsMenu(WebDriver driver) throws InterruptedException {
        clickOnSectionMenu(driver);
        sectionPage = PageFactory.initElements(driver,SectionPage.class);
        sectionPage.goToMetroPage(driver).getHeadLineNewsText();
       //System.out.println(headLineNews);
        clickOnSectionMenu(driver);
        sectionPage.goToBusinessPage(driver).clickOnHeadLineNews();
        clickOnSectionMenu(driver);
        sectionPage.goToEntertainmentPage(driver).clickOnHeadLineNews();
    }

    public void runAllTheFeaturesTest(WebDriver driver) throws InterruptedException, IOException {

        FetchTheSteps fetchTheSteps = new FetchTheSteps();
        String[] featureSteps = fetchTheSteps.getDataFromExcelFile();
        for (int i = 0; i<featureSteps.length; i++){
            select(featureSteps[i], driver);
        }
    }


    public void select(String featureName, WebDriver driver) throws InterruptedException, IOException {
        switch (featureName) {
            case "signUp":
                signUp(driver);
                break;
            case "sectionsMenu":
                sectionsMenu(driver);
                break;
            case "search":
                search(driver);
                break;
            default:

        }
    }
}
