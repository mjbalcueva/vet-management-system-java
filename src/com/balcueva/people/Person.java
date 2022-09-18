package com.balcueva.people;

import com.balcueva.date.MyDate;
import com.balcueva.utils.Util;
import com.balcueva.utils.Enums.Gender;

public abstract class Person {
  protected MyDate birthDate;
  protected Gender gender;
  protected String firstName;
  protected String lastName;
  protected String contact;
  protected String personID;
  protected String fullName;

  protected Person(MyDate birthDate, Gender gender, String firstName, String lastName, String contact) {
    this.birthDate = birthDate;
    this.gender = gender;
    this.firstName = firstName;
    this.lastName = lastName;
    this.fullName = firstName + " " + lastName;
    this.contact = contact;
    this.personID = generatePersonID(6);
  }

  private String generatePersonID(int n) {
    StringBuilder id = new StringBuilder();
    id.append(gender.equals(Gender.MALE) ? "1" : "2");
    id.append(birthDate.formatForPersonalID);
    id.append(Util.getRandomNumbers(n));
    return id.toString();
  }
}
