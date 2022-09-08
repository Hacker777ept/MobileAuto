import Lib.CoreTestCase;
import Lib.ui.MainPageObject;
import io.appium.java_client.TouchAction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


    public class Photo_delete extends CoreTestCase {
        private Lib.ui.MainPageObject MainPageObject;

        protected  void setUp() throws Exception{
            super.setUp();
            MainPageObject = new MainPageObject(driver);
        }


        @Test
        public void testPhotoDelete()
        {
// Нажимаем кнопку разрешить
            MainPageObject.waitForElementAndClick(
                    By.id("com.android.packageinstaller:id/permission_allow_button"),
                    "Кнопка разрешить доступ к файлам не доступна(Появляется в момент первого запуска приложения)",
                    5
            );
// Нажимаем кнопку разрешить
            MainPageObject.waitForElementAndClick(
                    By.id("com.android.packageinstaller:id/permission_allow_button"),
                    "Кнопка разрешить к видеосъемке не доступна(Появляется в момент первого запуска приложения)",
                    5
            );
// Нажимаем кнопку разрешить
            MainPageObject.waitForElementAndClick(
                    By.id("com.android.packageinstaller:id/permission_allow_button"),
                    "Кнопка разрешить доступ к местоположению не доступна(Появляется в момент первого запуска приложения)",
                    5
            );



// Нажимаем кнопку Далее на стартовом экране
            MainPageObject.waitForElementAndClick(
                    By.id("com.shw.applications.birjaapp:id/bt_next"),
                    "Не найдена кнопка 'Далее' на первой странице ",
                    5
            );


// Выбираем фотографа
            MainPageObject.waitForElementAndClick(
                    By.id("com.shw.applications.birjaapp:id/iv_worker"),
                    "Элемент с выбором фотографа не доступен",
                    5
            );


// Нажимаем кнопку Далее
            MainPageObject.waitForElementAndClick(
                    By.id("com.shw.applications.birjaapp:id/btNext"),
                    "Не найдена кнопка 'Далее' на странице с выбором типа осмотра",
                    5
            );


            //проверяем что поле с выбором фотографа не доступно
            MainPageObject.waitForElementNotPresent(
                    By.id("com.shw.applications.birjaapp:id/iv_worker"),
                    "Элемент с выбором фотографа доступен",
                    5
            );
            // Вводим Логин(почту)



            MainPageObject.waitForElementAndSendKeys(
                    By.id("com.shw.applications.birjaapp:id/et_email"),
                    "photo1@inbox.ru",
                    "Поле ввода почты не доступно",
                    5
            );


            MainPageObject.waitForElementAndSendKeys(
                    By.id("com.shw.applications.birjaapp:id/et_password"),
                    "123qweASD",
                    "Поле ввода пароля не доступно",
                    5
            );

            MainPageObject.waitForElementAndClick(
                    By.id("com.shw.applications.birjaapp:id/btLogIn"),
                    "Не найдена кнопка 'Войти' на странице авторизации ",
                    5
            );


            WebElement error_element = MainPageObject.waitForElementPresent(
                    By.id("com.shw.applications.birjaapp:id/buttonTab1"),
                    //By.xpath("//*[contains(@text,'Введите отсутствующие данные…')]"),
                    "Текст ошибки не найден",
                    3
            );

            String article_element = error_element.getText();
            Assert.assertEquals(
                    "Доступен раздел 'Назначенные'",
                    "Назначенные",
                    article_element
            );
            MainPageObject.waitForElementAndClick(
                    By.id("com.shw.applications.birjaapp:id/buttonTab2"),
                    "Не найдена кнопка 'Подтвержденные заказы'",
                    5
            );



            MainPageObject.waitForElementAndClick(
                    By.id("com.shw.applications.birjaapp:id/tv_open_details"),
                    "Не найдена кнопка 'Показать подробности' ",
                    5
            );

            MainPageObject.waitForElementAndClick(
                    By.id("com.shw.applications.birjaapp:id/bt_confirm"),
                    "Не найдена кнопка 'Продолжить осмотр' ",
                    5
            );
// простой свайп
            //  swipeUp (2000);
            //  swipeUp (2000);
            // swipeUp (2000);
            // swipeUp (2000);
            // swipeUp (2000);

            MainPageObject.swipeUpToFindElement(
                    By.id("com.shw.applications.birjaapp:id/tv_comment_text"),
                    "Комментарий проверяющего не найден",
                    10
            );


//            waitForElementAndClick(
 //                   By.id(""),
 //                   "Поле коридор не найдено",
  //                  5
  //          );


            MainPageObject.waitForElementAndClick(
                    By.id("com.shw.applications.birjaapp:id/fl_take_photo"),
                    "Иконка/кнопка не найдена",
                    5

            );

        }


    }


