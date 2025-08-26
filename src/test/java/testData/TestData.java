package testData;

import com.github.javafaker.Faker;

public class TestData {
    Faker faker = new Faker();

    public String firstName = faker.name().firstName();
    public String lastName = faker.name().lastName();
    public String streetAddress = faker.address().streetAddress();

}
