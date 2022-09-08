package Lib.ui;

        import io.appium.java_client.AppiumDriver;
        import org.openqa.selenium.By;

public class SystemPageObject extends MainPageObject
{
    private  static  final String

            //Кнопки Разрешения доступа
            BUTTON_APROVE_ACCESS = "com.android.packageinstaller:id/permission_allow_button",
            //Кнопка Запретить доступ
            BUTTON_BAN_ACCESS = "com.android.packageinstaller:id/permission_deny_button",
    //Кнопка настроить геолакацию
    BUTTON_GEO_ACCESS_TUNE = "com.shw.applications.birjaapp:id/buttonEnableGeo",
    //Константа используется для получения
            ERROR_RESULT_BY_SUBSTRING_TPL = "//*[contains(@text,'{SUBSTRING}')]";


    public SystemPageObject(AppiumDriver driver){
        super(driver);
    }
    /* TEMPLATES METHODS*/
    private  static  String getErrorResult(String substring)
    {
        return ERROR_RESULT_BY_SUBSTRING_TPL.replace("{SUBSTRING}",substring);
    }
    /* TEMPLATES METHODS*/

    // метод при старте нажимает кнопку разрешить
    public  void initAproveButton()
    {
        // делаем клик
        this.waitForElementAndClick(By.id(BUTTON_APROVE_ACCESS),"Кнопка разрешить доступ к файлам не доступна(Появляется в момент первого запуска приложения)",5);
        // проверяем что клик был
        // this.waitForElementPresent(By.id(BUTTON_APROVE_ACCESS),"Не произошел клик на кнопку разрешить");
    }

    public  void initBanButton()
    {
        // делаем клик
        this.waitForElementAndClick(By.id(BUTTON_BAN_ACCESS),"Кнопка Запретить доступ к файлам не доступна(Появляется в момент первого запуска приложения)",5);
        // проверяем что клик был
        // this.waitForElementPresent(By.id(BUTTON_BAN_ACCESS),"Не произошел клик на кнопку разрешить");
    }

    public  void initGeoButton()
    {
        // делаем клик
        this.waitForElementAndClick(By.id(BUTTON_GEO_ACCESS_TUNE),"Кнопка Запретить доступ к файлам не доступна(Появляется в момент первого запуска приложения)",5);
        // проверяем что клик был, т.е элемент пропал
        this.waitForElementPresent(By.id(BUTTON_GEO_ACCESS_TUNE),"Не произошел клик на кнопку разрешить");
    }

    // Метод проверяет текст ошибки
    public  void errorTextResoultAuth(String substring)
    {
        String search_result_xpath = getErrorResult(substring);
        this.waitForElementPresent(By.xpath(search_result_xpath),"Текст ошибки не найден" + substring);
    }
}
