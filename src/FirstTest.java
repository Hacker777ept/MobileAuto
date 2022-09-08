import Lib.CoreTestCase;
import Lib.ui.MainPageObject;
import Lib.ui.PageObject;
import org.junit.Test;

public class FirstTest extends CoreTestCase
{
    private MainPageObject MainPageObject;

    protected  void setUp() throws Exception{
        super.setUp();
        MainPageObject = new MainPageObject(driver);
    }

    @Test
    public void testHZ() {
        PageObject PageObject = new PageObject(driver);

        PageObject.initAproveButton();
        PageObject.initAproveButton();
        PageObject.initAproveButton();
        PageObject.initButtonNextStart();
        PageObject.initButtonPhotoType();
        PageObject.initButtonNextChoiceType();
        PageObject.initTypeEmailLine("photo1@inbox.ru");
        PageObject.typePasswordLine("123qweASD");
        PageObject.initTypeEmailLineClear();
        PageObject.initButtonLoginIn();
        PageObject.errorTextResoultAuth("Введите отсутствующие данные…");
        System.out.println("Тест пройден,при авторизации отображается ошибка 'Введите отсутствующие данные…'");


    }
}
