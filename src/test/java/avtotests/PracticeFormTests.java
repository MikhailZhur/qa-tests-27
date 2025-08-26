package avtotests;

import org.junit.jupiter.api.Test;


public class PracticeFormTests extends BaseTest {


    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void successfulFillPracticeForm() {

        registrationPage.openPage()
                .setFirstName("Mikhail")
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


        registrationPage.verifyResultsModalAppears()
                .verifyResult("Student Name", "Mikhail Zhuravlev")
                .verifyResult("Student Email", "miha99_66@mail.ru")
                .verifyResult("Gender", "Male")
                .verifyResult("Mobile", "9126298333")
                .verifyResult("Date of Birth", "27 May,1988")
                .verifyResult("Subjects", "Maths")
                .verifyResult("Hobbies", "Sports, Reading, Music")
                .verifyResult("Picture", "Crazy_Frog.jpg")
                .verifyResult("Address", "Dubrovka")
                .verifyResult("State and City", "NCR Gurgaon")
        ;
    }

    @Test
    void firstNameIsRequired(){
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