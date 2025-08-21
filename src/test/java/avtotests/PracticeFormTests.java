package avtotests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTests {
    @BeforeAll
    static void BeforeAll(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void fillPracticeForm(){
        open("/automation-practice-form");
        $("#firstName").setValue("Mikhail");
        $("#lastName").setValue("Zhuravlev");
        $("#userEmail").setValue("miha99_66@mail.ru");
        $(byText("Male")).click();
        $("#userNumber").setValue("+79126298333");


    }
}
