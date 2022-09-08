package Lib.ui;

        import io.appium.java_client.AppiumDriver;
        import org.openqa.selenium.By;

public class OrdersPage extends MainPageObject
{
    private  static  final String
            /*Кнопка Менеджер загрузок*/
            BUTTON_MANAGER_LOAD = "com.shw.applications.birjaapp:id/navigation_bookmarks",
    /*Кнопка Нотификации*/
    BUTTON_NOTIFICATION = "com.shw.applications.birjaapp:id/navigation_notifications",
    /*Кнопка назначенные*/
    BUTTON_APPOINTED = "com.shw.applications.birjaapp:id/buttonTab1",
    /*Кнопка подтвержденные */
    BUTTON_CONFIRMED = "com.shw.applications.birjaapp:id/buttonTab2",
    BUTTON_ORDERS = "com.shw.applications.birjaapp:id/navigation_commands",
    BUTTON_HISTORY = "com.shw.applications.birjaapp:id/navigation_history",
    BUTTON_PROFILE = "com.shw.applications.birjaapp:id/navigation_user",
    BUTTON_ICON_MAP = "com.shw.applications.birjaapp:id/utv_on_map",
    BUTTON_ICON_SMS = "com.shw.applications.birjaapp:id/utv_representer_sms",
    BUTTON_ICON_PHONE = "com.shw.applications.birjaapp:id/utv_representer_phone",
    BUTTON_ICON_MANAGER_EMAIL = "com.shw.applications.birjaapp:id/utv_manager_email",
    BUTTON_ICON_MANAGER_PHONE = "com.shw.applications.birjaapp:id/utv_manager_phone",
    BUTTON_ICON_CHAT = "com.shw.applications.birjaapp:id/utv_chat",
    BUTTON_CONTINUE_VIEWING = "com.shw.applications.birjaapp:id/bt_confirm",
    BUTTON_CANCELED_ORDER = "com.shw.applications.birjaapp:id/bt_cancel",
    BUTTON_OPEN_DETAILS = "com.shw.applications.birjaapp:id/tv_open_details",


    
            ERROR_RESULT_BY_SUBSTRING_TPL = "//*[contains(@text,'{SUBSTRING}')]";


    public OrdersPage(AppiumDriver driver){
        super(driver);
    }



    /* TEMPLATES METHODS*/
    private  static  String getErrorResult(String substring)
    {
        return ERROR_RESULT_BY_SUBSTRING_TPL.replace("{SUBSTRING}",substring);
    }
    /* TEMPLATES METHODS*/



    // метод нажимаем на закладки/менеджер загрузок
    public  void initButtonManagerLoad()
    {
        // делаем клик
        this.waitForElementAndClick(By.id(BUTTON_MANAGER_LOAD),"Кнопка Закладки не доступна(Менеджер загрузок)",5);
        // проверяем что клик был
        this.waitForElementPresent(By.id(BUTTON_MANAGER_LOAD),"Не произошел клик на кнопку Закладки");
    }
    // метод нажимает 'Назначенные'
    public  void initButtonAppoined()
    {
        this.waitForElementAndClick(By.id(BUTTON_APPOINTED),"Не найдена кнопка 'Далее' на первой странице",5);
        //       this.waitForElementPresent(By.id(BUTTON_NEXT_START),"Не произошел клик на кнопку 'Далее'");
    }

    // Метод нажимает на кнопку уведомления "Уведомления"
    public  void initButtonNotification()
    {
        this.waitForElementAndClick(By.id(BUTTON_NOTIFICATION),"Элемент с выбором уведомлений не доступен",5);
        this.waitForElementPresent(By.id(BUTTON_NOTIFICATION),"Не произошел клик на кнопку 'Уведомления'");
    }
    // Выбираем тип Подтвержденные
    public  void initButtonConfirmed()
    {
        this.waitForElementAndClick(By.id(BUTTON_CONFIRMED),"Не найдена кнопка 'назначенные'",5);
        //      this.waitForElementPresent(By.id(BUTTON_NEXT_CHOICE),"Не произошел клик на кнопку 'Далее' на странице с выбором типа осмотра ");
    }

    // Нажимаем продолжить осмотр
    public  void initButtonContine()
    {
        this.waitForElementAndClick(By.id(BUTTON_CONTINUE_VIEWING),"Не найдена кнопка 'Продолжить осмотр'",5);
         // this.waitForElementPresent(By.id(BUTTON_CONTINUE_VIEWING),"Не произошел клик на кнопку 'Продолжить осмотр'");
    }


    // метод нажимает кнопку войти
    public  void initButtonOpenDetails()
    {
        this.waitForElementAndClick(By.id(BUTTON_OPEN_DETAILS),"Не найдена кнопка 'Открыть детали' на странице авторизации",5);
        //       this.waitForElementPresent(By.id(BUTTUN_LOGIN_IN),"Не произошел клик на кнопку 'Далее'");
    }

    // Метод проверяет текст ошибки
    public  void errorTextResoultAuth(String substring)
    {
        String search_result_xpath = getErrorResult(substring);
        this.waitForElementPresent(By.xpath(search_result_xpath),"Текст ошибки не найден" + substring);
    }
}
