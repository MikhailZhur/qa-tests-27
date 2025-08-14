package avtotests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll(){
    //    Configuration.browserSize = "1920x1080";
      //  Configuration.baseUrl= "https://demoqa.com";
      //  Configuration.pageLoadStrategy = "eager";
       // Configuration.holdBrowserOpen = true;
    }

    @Disabled
    @Test
    void fillFormtest(){
        open("/text-box");
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
    void visibleCooliePopup(){
        open("https://www.otpbank.ru/");
        $(withText("Продолжая просмотр сайта")).shouldBe(visible);
        $("a strong").click();
        $(byText("Защита персональных данных")).shouldBe(visible);
    }

}
