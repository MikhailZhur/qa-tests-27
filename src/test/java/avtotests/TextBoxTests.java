package avtotests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 70000;
        Configuration.baseUrl= "https://demoqa.com";
    }

    @Test
    void fillFormtest(){
        open("/text-box");
        $("#userName").setValue("Mikhail");
        $("#userEmail").setValue("miha99_66@mail.ru");
        $("#currentAddress").setValue("some street");
        $("#permanentAddress").setValue("street");

    }
}
