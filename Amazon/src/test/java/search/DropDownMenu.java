package search;

import Base.CommonApi;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownMenu extends CommonApi {


    @Test
    public void dropDown() {
        List<String> textList = getListOfText(".nav-search-dropdown.searchSelect option");
        printText(textList);
        }


}

