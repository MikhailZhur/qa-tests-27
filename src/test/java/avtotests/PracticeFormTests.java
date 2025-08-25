package avtotests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTests {
    @BeforeAll
    static void BeforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillPracticeForm() {
        open("/automation-practice-form");
        executeJavaScript("$('#RightSide_Advertisement').remove()");
        executeJavaScript("$('footer').remove()");

        $("#firstName").setValue("Mikhail");
        $("#lastName").setValue("Zhuravlev");
        $("#userEmail").setValue("miha99_66@mail.ru");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("9126298333");

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("May");
        $(".react-datepicker__year-select").selectOption("1988");
        $(".react-datepicker__day.react-datepicker__day--027").click();

        $("#subjectsInput").setValue("Maths").pressEnter();
        $(byText("Sports")).click();
        $(byText("Reading")).click();
        $(byText("Music")).click();

        $("#uploadPicture").uploadFile(new File("src/test/resources/Crazy_Frog.jpg"));

        $("#currentAddress").setValue("Dubrovka");

        $("#state").click();
        $(byText("NCR")).click();

        $("#city").click();
        $("#react-select-4-option-1").click();

        $("#submit").click();

        $(".table-responsive").shouldHave(text("Mikhail Zhuravlev"),
                text("miha99_66@mail.ru"),
                text("Male"),
                text("9126298333"),
                text("27 May,1988"),
                text("Maths"),
                text("Sports, Reading, Music"),
                text("Crazy_Frog.jpg"),
                text("Dubrovka"),
                text("NCR Gurgaon"));
    }
}