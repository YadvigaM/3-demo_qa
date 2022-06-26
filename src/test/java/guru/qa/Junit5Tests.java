package guru.qa;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;

public class Junit5Tests {
    @Test
    void assertTest() {
        Selenide.open("https://ya.ru");
        WebDriverRunner.closeWebDriver();
    }
}
