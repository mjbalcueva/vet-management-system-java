package com.balcueva.people;

import java.util.ArrayList;
import com.balcueva.date.MyDate;
import com.balcueva.pets.Pet;
import com.balcueva.utils.Enums.Gender;

public class Owner extends Person {
  private ArrayList<Pet> pets = new ArrayList<>();
  private String pronoun = gender.equals(Gender.MALE) ? "He" : "She";

  public Owner(MyDate birthDate, Gender gender, String firstName, String lastName, String contact) {
    super(birthDate, gender, firstName, lastName, contact);
  }

  public void addNewPets(Pet... pets) {
    for (Pet pet : pets) {
      this.pets.add(pet);
    }
  }

  public String noiseInOwnersHouse() {
    StringBuilder noise = new StringBuilder();
    if (pets.isEmpty()) {
      noise.append(fullName + "'s house is quiet because ");
      noise.append(pronoun.toLowerCase() + " doesn't have any pets");
    } else {
      noise.append(pronoun + "'s house is noisy. Listen...");
      for (Pet pet : pets) {
        noise.append("\n\t- " + pet.speak());
      }
    }
    noise.append("\n");
    return noise.toString();
  }

  @Override
  public String toString() {
    StringBuilder owner = new StringBuilder();
    owner.append(fullName + " is an owner");
    owner.append("\n\tContact information: ");
    owner.append("\n\t\t- Personal Id: " + personID);
    owner.append("\n\t\t- Date of Birth: " + birthDate);
    if (pets.isEmpty()) {
      owner.append("\n\t\t- " + pronoun + " doesn't have any pets");
    } else {
      owner.append("\n\t\t- " + pronoun + " has " + pets.size() + " pets:");
      for (Pet pet : pets) {
        owner.append("\n\t\t\t~ " + pet);
      }
    }
    owner.append("\n");
    return owner.toString();
  }
}
