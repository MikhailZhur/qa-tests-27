package avtotests;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage {

    RegistrationResultsModal registrationResultsModal = new RegistrationResultsModal();

    private final SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            userNumberInput = $("#userNumber");


    public RegistrationPage openPage() {
        open("/automation-practice-form");
        executeJavaScript("$('#RightSide_Advertisement').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public RegistrationPage choseUserGender(String value) {
        $(byText(value)).click();
        return this;
    }

    public RegistrationPage setUserNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }

    public RegistrationPage chooseDateBirthday(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day.react-datepicker__day--0" + day).click();
        return this;
    }

    public RegistrationPage setSubjects(String value) {
        $("#subjectsInput").setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage chooseHobbies() {
        $(byText("Sports")).click();
        $(byText("Reading")).click();
        $(byText("Music")).click();
        return this;
    }

    public RegistrationPage uploadFile() {
        $("#uploadPicture").uploadFile(new File("src/test/resources/Crazy_Frog.jpg"));
        return this;
    }

    public RegistrationPage setCurrentAdress(String value) {
        $("#currentAddress").setValue(value);
        return this;
    }

    public RegistrationPage setState(String value) {
        $("#state").click();
        $(byText(value)).click();
        return this;
    }

    public RegistrationPage setCity() {
        $("#city").click();
        $("#react-select-4-option-1").click();
        return this;
    }

    public void clickSubmit() {
        $("#submit").click();
    }

    public RegistrationPage verifyResultsModalAppears() {
        registrationResultsModal.verifyModalAppears();
        return this;
    }

    public RegistrationPage verifyResult(String key, String value) {
        registrationResultsModal.verifyResults(key, value);
        return this;
    }

    public RegistrationPage verifyResultsModalNotVisble(){
        registrationResultsModal.verifyModalNotVisble();
        return this;
    }


}
