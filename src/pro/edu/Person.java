package pro.edu;

import java.time.LocalDate;

// super class
public class Person {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String gender;
    private LocalDate birthday;

    public Person() {
    }

    // TODO:
    public Boolean isAdult(){
        return null;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBiurthday() {
        return birthday;
    }

    public void setBiurthday(LocalDate biurthday) {
        this.birthday = biurthday;
    }
}
