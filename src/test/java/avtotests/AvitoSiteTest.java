package avtotests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AvitoSiteTest {

    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager"; // �� ���� ������ �������� ��������, ������� �������� DOM
        Configuration.holdBrowserOpen = true; // ������� �� �����������
    }

    @Test
    void fillFormtest(){
        open("https://www.avito.ru/");
        $(byText("�������")).click();
        $(byText("��������")).click();
        $(".styles-module-closeIcon-TKFIs").click();
        $(byText("����� ��� ������")).setValue("������������").click();
//        $("#userEmail").setValue("miha99_66@mail.ru");
//        $("#currentAddress").setValue("some street");
//        $("#permanentAddress").setValue("street");
//        $("#submit").click();
//
//        $("#output #name").shouldHave(text("Mikhail"));
//        $("#output #email").shouldHave(text("miha99_66@mail.ru"));
//        $("#output #currentAddress").shouldHave(text("some street"));
//        $("#output #permanentAddress").shouldHave(text("street"));

    }
}

