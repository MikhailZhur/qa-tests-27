package tests;

import components.RegistrationPage;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import testData.TestData;


public class PracticeFormTests extends BaseTest {


    RegistrationPage registrationPage = new RegistrationPage();
    TestData testData = new TestData();

    @Test
    @Tag("SMOKE")
    void successfulFillPracticeForm() {

        registrationPage.openPage()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setUserEmail(testData.userEmail)
                .choseUserGender(testData.gender)
                .setUserNumber(testData.userNumber)
                .chooseDateBirthday(testData.birthDay, testData.birthMonth, testData.birthYear)
                .setSubjects("Maths")
                .chooseHobbies()
                .uploadFile()
                .setCurrentAdress(testData.streetAddress)
                .setState("NCR")
                .setCity()
                .clickSubmit();


        registrationPage.verifyResultsModalAppears()
                .verifyResult("Student Name", testData.firstName + " " + testData.lastName)
                .verifyResult("Student Email", testData.userEmail)
                .verifyResult("Gender", testData.gender)
                .verifyResult("Mobile", testData.userNumber)
                .verifyResult("Date of Birth",  String.format("%s %s,%s",testData.birthDay,testData.birthMonth,testData.birthYear))
                .verifyResult("Subjects", "Maths")
                .verifyResult("Hobbies", "Sports, Reading, Music")
                .verifyResult("Picture", "Crazy_Frog.jpg")
                .verifyResult("Address", testData.streetAddress)
                .verifyResult("State and City", "NCR Gurgaon")
        ;
    }
    @Disabled("swffwfwfe")
    @Test
    void firstNameIsRequired() {
        registrationPage.openPage()
                .setLastName("Zhuravlev")
                .setUserEmail("miha99_66@mail.ru")
                .choseUserGender("Male")
                .setUserNumber("9126298333")
                .chooseDateBirthday("27", "May", "1988")
                .setSubjects("Maths")
                .chooseHobbies()
                .uploadFile()
                .setCurrentAdress("Dubrovka")
                .setState("NCR")
                .setCity()
                .clickSubmit();

        registrationPage.verifyResultsModalNotVisble();
    }
}