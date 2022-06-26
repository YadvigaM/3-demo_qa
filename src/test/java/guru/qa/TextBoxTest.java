package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest {

    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest() {

        String name = "Petya Ivanov"; // todo make with other test data

        open("/text-box");
        $("[id=userName]").setValue(name);
        $("[id=userEmail]").setValue("pochta@gmai.com");
        $("[id=currentAddress]").setValue("St.Peterburg");
        $("[id=permanentAddress]").setValue("St.Peterburg");
        $("[id=submit]").click();

        $("[id=output]").shouldHave(text(name), text("pochta@gmai.com"),
                text("St.Petersburg").text("St.Petersburg"));

        $("[id=output]").shouldHave(text(name));
        $("[id=output]").$("[id=name]").shouldHave(text(name));

    }
}
