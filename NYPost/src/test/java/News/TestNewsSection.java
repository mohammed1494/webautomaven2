package News;

import Base.CommonApi;
import features.AllFunctionality;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SectionPage;

import java.io.IOException;

public class TestNewsSection extends CommonApi {


    @Test
    public void allFeatures() throws InterruptedException, IOException {
        AllFunctionality functionality = PageFactory.initElements(driver, AllFunctionality.class);
        functionality.runAllTheFeaturesTest(driver);
    }
}
