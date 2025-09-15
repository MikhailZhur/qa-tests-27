package textBoxTests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
@Tag("textbox")
public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        //    Configuration.browserSize = "1920x1080";
        //  Configuration.baseUrl= "https://demoqa.com";
        //  Configuration.pageLoadStrategy = "eager";
        // Configuration.holdBrowserOpen = true;
    }
    @Disabled
    @Test
    void fillFormtest() {
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Mikhail");
        $("#userEmail").setValue("miha99_66@mail.ru");
        $("#currentAddress").setValue("some street");
        $("#permanentAddress").setValue("street");
        $("#submit").click();

        $("#output #name").shouldHave(text("Mikhail"));
        $("#output #email").shouldHave(text("miha99_66@mail.ru"));
        $("#output #currentAddress").shouldHave(text("some street"));
        $("#output #permanentAddress").shouldHave(text("street"));

    }

    @Test
    void visibleCooliePopup() {
        open("https://www.otpbank.ru/");
        $(".main-hero__big-card-title").shouldBe(visible);
//        $("a strong").click();
//        withText("Выбирайте из лучших продуктов")
//        $(byText("Защита персональных данных")).shouldBe(visible);
    }

}
