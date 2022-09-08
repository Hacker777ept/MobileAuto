package Lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class FormPage extends MainPageObject
{
    private  static  final String
            /*Внешний фасад дома */
            BUTTON_FACADE_OF_THE_HOUSE = "//*[@class='android.widget.TextView' and @text='Внешний фасад дома *']",
    /*Адресный указатель*/
    BUTTON_ADRESS_INDEX = "//*[@class='android.widget.TextView' and @text='Адресный указатель']",
    /*Адресный указатель*/
    BUTTON_SURRAUND_AREA = "//*[@class='android.widget.TextView' and @text='Прилегающая территория *']",
    /*Кнопка назначенные*/
    BUTTON_PHOTO= "com.shw.applications.birjaapp:id/fl_take_photo",
    BUTTON_GATE= "//android.widget.ImageView[@content-desc=\"Затвор\"]",
    BUTTON_OK_PHOTO = "com.android.camera2:id/done_button",
    BUTTON_VIZIT_FINISH = "com.shw.applications.birjaapp:id/bt_finish",
    BUTTON_VIZIT_FINISH_OK = "android:id/button1",

        ERROR_RESULT_BY_SUBSTRING_TPL = "//*[contains(@text,'{SUBSTRING}')]";


    public FormPage(AppiumDriver driver){
        super(driver);
    }
//android.widget.ImageView[@content-desc="Затвор"]


    // метод нажимаем на Внешний фасад
    public  void initButtonFacade()
    {
        // делаем клик
        this.waitForElementAndClick(By.xpath(BUTTON_FACADE_OF_THE_HOUSE),"Кнопка Внешний фасад дома не доступна",5);
        // проверяем что клик был
        //this.waitForElementPresent(By.id(BUTTON_FACADE_OF_THE_HOUSE),"Не произошел клик на кнопку Закладки");
    }
    // метод нажимает 'Адресный указатель'
    public  void initButtonAdressIndex()
    {
        this.waitForElementAndClick(By.xpath(BUTTON_ADRESS_INDEX),"Не найдена кнопка 'Адресный указатель'",5);
        //       this.waitForElementPresent(By.id(BUTTON_NEXT_START),"Не произошел клик на кнопку 'Далее'");
    }

    // метод нажимает 'Прилегающая территория'
    public  void initSurroundingArea()
    {
        this.waitForElementAndClick(By.xpath(BUTTON_SURRAUND_AREA),"Не найдена кнопка 'Прилегающая территория *'",5);
        //       this.waitForElementPresent(By.id(BUTTON_NEXT_START),"Не произошел клик на кнопку 'Далее'");
    }

    // метод нажимает 'Назначенные'
    public  void initButtonPhoto()
    {
        this.waitForElementAndClick(By.id(BUTTON_PHOTO),"Не найдена кнопка 'Фото'",5);
        //       this.waitForElementPresent(By.id(BUTTON_NEXT_START),"Не произошел клик на кнопку 'Далее'");
    }

    public  void initButtonGate()
    {
        this.waitForElementAndClick(By.xpath(BUTTON_GATE),"Не найдена кнопка 'Затвор'",5);
        //       this.waitForElementPresent(By.id(BUTTON_NEXT_START),"Не произошел клик на кнопку 'Далее'");
    }

    public  void initButtonPhotoOk()
    {
        this.waitForElementAndClick(By.id(BUTTON_OK_PHOTO),"Не найдена кнопка 'Галочка'",5);
        //       this.waitForElementPresent(By.id(BUTTON_NEXT_START),"Не произошел клик на кнопку 'Далее'");
    }

    public  void initButtonVizitFinish()
    {
        this.waitForElementAndClick(By.id(BUTTON_VIZIT_FINISH),"Не найдена кнопка 'Завершить Визит'",5);
        //       this.waitForElementPresent(By.id(BUTTON_NEXT_START),"Не произошел клик на кнопку 'Далее'");
    }

    public  void initButtonVizitFinishOk()
    {
        this.waitForElementAndClick(By.id(BUTTON_VIZIT_FINISH_OK),"Не найдена кнопка 'ОК при завершении визита'",5);
        //       this.waitForElementPresent(By.id(BUTTON_NEXT_START),"Не произошел клик на кнопку 'Далее'");
    }






}
