package Lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class StartPage extends MainPageObject {
    private static final String
            BUTTON_NEXT_START = "com.shw.applications.birjaapp:id/bt_next",
            ERROR_RESULT_BY_SUBSTRING_TPL = "//*[contains(@text,'{SUBSTRING}')]";


    public StartPage(AppiumDriver driver) {
        super(driver);
    }

    /* TEMPLATES METHODS*/
    private static String getErrorResult(String substring) {
        return ERROR_RESULT_BY_SUBSTRING_TPL.replace("{SUBSTRING}", substring);
    }
    /* TEMPLATES METHODS*/


    // метод нажимает кнопку старт
    public  void initButtonNextStart()
    {
        this.waitForElementAndClick(By.id(BUTTON_NEXT_START),"Не найдена кнопка 'Далее' на стартовой странице",5);
        //       this.waitForElementPresent(By.id(BUTTON_NEXT_START),"Не произошел клик на кнопку 'Далее'");
    }

    // Метод проверяет текст ошибки
    public  void errorTextResoultAuth(String substring)
    {
        String search_result_xpath = getErrorResult(substring);
        this.waitForElementPresent(By.xpath(search_result_xpath),"Текст ошибки не найден" + substring);
    }
}
