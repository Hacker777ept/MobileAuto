package Lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class PageObject extends MainPageObject
{
    private  static  final String
            BUTTON_APROVE_ACCESS = "com.android.packageinstaller:id/permission_allow_button",
    BUTTON_NEXT_START = "com.shw.applications.birjaapp:id/bt_next",
    BUTTON_PHOTO_TYPE = "com.shw.applications.birjaapp:id/iv_worker",
    BUTTON_NEXT_CHOICE = "com.shw.applications.birjaapp:id/btNext",
    BUTTUN_LOGIN_IN = "com.shw.applications.birjaapp:id/btLogIn",
    INPUT_EMAIL_LINE = "com.shw.applications.birjaapp:id/et_email",
    INPUT_PASSWORD_LINE = "com.shw.applications.birjaapp:id/et_password",
            ERROR_RESULT_BY_SUBSTRING_TPL = "//*[contains(@text,'{SUBSTRING}')]";


    public PageObject(AppiumDriver driver){
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
 //       this.waitForElementPresent(By.id(BUTTON_APROVE_ACCESS),"Не произошел клик на кнопку разрешить");
    }
// метод нажимает кнопку старт
    public  void initButtonNextStart()
    {
        this.waitForElementAndClick(By.id(BUTTON_NEXT_START),"Не найдена кнопка 'Далее' на первой странице",5);
 //       this.waitForElementPresent(By.id(BUTTON_NEXT_START),"Не произошел клик на кнопку 'Далее'");
    }

    // Выбираем тип осмотра "фотограф"
    public  void initButtonPhotoType()
    {
        this.waitForElementAndClick(By.id(BUTTON_PHOTO_TYPE),"Элемент с выбором фотографа не доступен",5);
        this.waitForElementPresent(By.id(BUTTON_PHOTO_TYPE),"Не произошел клик на кнопку 'Фотограф'");
    }
    // Выбираем тип осмотра "фотограф"
    public  void initButtonNextChoiceType()
    {
        this.waitForElementAndClick(By.id(BUTTON_NEXT_CHOICE),"Не найдена кнопка 'Далее' на странице с выбором типа осмотра",5);
  //      this.waitForElementPresent(By.id(BUTTON_NEXT_CHOICE),"Не произошел клик на кнопку 'Далее' на странице с выбором типа осмотра ");
    }
// метод ввода данных в поле почта
    public void initTypeEmailLine(String email_line)
    {
        this.waitForElementAndSendKeys(By.id(INPUT_EMAIL_LINE),email_line,"Поле ввода почты не доступно",5);
    }

    // метод удаление введенных данных в поле почта
    public void initTypeEmailLineClear()
    {
        this.waitForElementAndClear(By.id(INPUT_EMAIL_LINE), "Текст ошибки не найден",5);
    }
    // метод ввода данных в поле пароль
    public void typePasswordLine(String password_line)
    {
        this.waitForElementAndSendKeys(By.id(INPUT_PASSWORD_LINE),password_line,"Поле ввода пароля не доступно",5);
    }

   // метод нажимает кнопку войти
    public  void initButtonLoginIn()
    {
        this.waitForElementAndClick(By.id(BUTTUN_LOGIN_IN),"Не найдена кнопка 'Далее' на странице авторизации",5);
        //       this.waitForElementPresent(By.id(BUTTUN_LOGIN_IN),"Не произошел клик на кнопку 'Далее'");
    }
   // Метод проверяет текст ошибки
    public  void errorTextResoultAuth(String substring)
    {
        String search_result_xpath = getErrorResult(substring);
        this.waitForElementPresent(By.xpath(search_result_xpath),"Текст ошибки не найден" + substring);
    }
}
