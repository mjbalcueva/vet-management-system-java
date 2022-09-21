package com.balcueva;

import com.balcueva.date.MyDate;
import com.balcueva.people.Owner;
import com.balcueva.pets.Cat;
import com.balcueva.pets.Dog;
import com.balcueva.pets.Parrot;
import com.balcueva.pets.Turtle;
import com.balcueva.utils.Enums.Gender;
import com.balcueva.utils.Util;

public class App {
  public static void main(String[] args) {
    Owner owner1 = new Owner(new MyDate(1997, 7, 8), Gender.FEMALE, "Anne", "SMITH", "+40-741-234-567");
    System.out.println(owner1);
    System.out.println(owner1.noiseInOwnersHouse());
    Cat pet1 = new Cat(true, MyDate.randomDate(2018, 2020), "Joe", Util.getRandom().nextDouble(7));
    Dog pet2 = new Dog(true, MyDate.randomDate(2018, 2020), "Lizzie", Util.getRandom().nextDouble(6));
    Parrot pet3 = new Parrot(true, MyDate.randomDate(2018, 2020), "Pityu", Util.getRandom().nextDouble(5));
    Turtle pet4 = new Turtle(5, MyDate.randomDate(2018, 2020), "Tim", Util.getRandom().nextDouble(8));
    owner1.addNewPets(pet1, pet2, pet3, pet4);
    System.out.println(owner1);
    System.out.println(owner1.noiseInOwnersHouse());
  }
}
