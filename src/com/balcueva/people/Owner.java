package com.balcueva.people;

import com.balcueva.date.MyDate;
import com.balcueva.utils.Enums.Gender;

public class Owner extends Person {
  public Owner(MyDate birthDate, Gender gender, String firstName, String lastName, String contact) {
    super(birthDate, gender, firstName, lastName, contact);
  }

  @Override
  public String toString() {
    return fullName + " is an owner" + "\n\tContact information:" + "\n\t\tPersonal Id: " + personID
        + "\n\t\tDate of Birth: " + birthDate;
  }
}
