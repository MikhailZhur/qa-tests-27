package testData;

import com.github.javafaker.Faker;

public class TestData {

    Faker faker = new Faker();

    public String firstName = faker.name().firstName();
    public String lastName = faker.name().lastName();
    public String userEmail = faker.internet().emailAddress();
    public String gender = getRandomGender();
    public String streetAddress = faker.address().streetAddress();
    public String userNumber = faker.phoneNumber().subscriberNumber(10);
    public String birthMonth = getRandomMonth();
    public String birthYear = String.format("%s",faker.number().numberBetween(1980,2020));
    public String birthDay = String.format("%s",faker.number().numberBetween(1,28));


    public String getRandomGender() {
        gender = faker.options().option("Male", "Female", "Other");
        return gender;
    }

    public String getRandomMonth(){
        birthMonth = faker.options().option("December","January","February","March","April","May","June","July","August","September","October","November");
        return birthMonth;
    }
}



