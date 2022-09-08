import Lib.CoreTestCase;
import Lib.ui.*;
import org.openqa.selenium.By;



public class MainTest extends CoreTestCase
    {
        private MainPageObject MainPageObject;

        protected  void setUp() throws Exception{
        super.setUp();
        MainPageObject = new MainPageObject(driver);
    }
    public void testFirst()
    {
        PageObject PageObject = new PageObject(driver);
        StartPage StartPage = new StartPage(driver);
        OrdersPage OrdersPage = new OrdersPage(driver);
        SystemPageObject SystemPageObject = new SystemPageObject(driver);
        FormPage FormPage = new FormPage(driver);


// Нажимаем кнопку разрешить
        SystemPageObject.initAproveButton();
        // Нажимаем кнопку разрешить
        SystemPageObject.initAproveButton();
        // Нажимаем кнопку разрешить
        SystemPageObject.initAproveButton();
        // Нажимаем кнопку Далее на стартовом экране
        StartPage.initButtonNextStart();
        // Выбираем фотографа и проверяем что поле с выбором фотографа не доступно (waitForElementNotPresent)
        PageObject.initButtonPhotoType();
        // Нажимаем кнопку Далее
        PageObject.initButtonNextChoiceType();
        // Вводим Логин(почту)
        PageObject.initTypeEmailLine("autotestBirja@inbox.ru");
        // Вводим Пароль
        PageObject.typePasswordLine("Qq123456");
        PageObject.initButtonLoginIn();
        //Проверяем наличие раздела "Назначенные"
        OrdersPage.errorTextResoultAuth("Назначенные");
       //Выбираем тип Подтвержденные
        OrdersPage.initButtonConfirmed();
        // Открываем детали заказа
        OrdersPage.initButtonOpenDetails();
        // Нажимаем кнопку продолжить осмотр
        OrdersPage.initButtonContine();
        // Раскрываем поле "Внешний фасад дома"
        FormPage.initButtonFacade();
        // Нажимаем на иконку фото
        FormPage.initButtonPhoto();
        // Фотографируем
        FormPage.initButtonGate();
        //Подтверждаем снимок
        FormPage.initButtonPhotoOk();
        //Скрываем поле "Внешний фасад дома"
        FormPage.initButtonFacade();
        // Раскрываем поле "Адресный указатель"
        FormPage.initButtonAdressIndex();
        // Нажимаем на иконку фото
        FormPage.initButtonPhoto();
        // Фотографируем
        FormPage.initButtonGate();
        //Подтверждаем снимок
        FormPage.initButtonPhotoOk();
        // скрываем поле "Адресный указатель"
        FormPage.initButtonAdressIndex();
        // Раскрываем поле "Прилегающая территория"
        FormPage.initSurroundingArea();
        // Нажимаем на иконку фото
        FormPage.initButtonPhoto();
        // Фотографируем
        FormPage.initButtonGate();
        //Подтверждаем снимок
        FormPage.initButtonPhotoOk();
        // Завершаем визит
        FormPage.initButtonVizitFinish();
        // Подтверждаем завершение визита
        FormPage.initButtonVizitFinishOk();






    }

}
