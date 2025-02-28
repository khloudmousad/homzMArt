package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.homepage;

public class test  extends testbase {
    homepage home;
    SoftAssert soft;
    @Test
    public void  testp()  {
        soft=new SoftAssert();
        home=new homepage(driver);
        home.hoverOnELectronicsCategory();
        home.clickOnGamingConsole();
       String beforeClick =home.retriveDataOfThirdproduct();
        home.openThirdProduct();
        String afterClick=home.thidProductAfterClick();
        soft.assertEquals(beforeClick,afterClick);
        soft.assertAll();

//setTimeout(function() {
//    debugger;
//}, 5000);


    }

}
