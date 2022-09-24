package com.balcueva;

import com.balcueva.date.MyDate;
import com.balcueva.medcenters.Veterinary;
import com.balcueva.people.Owner;
import com.balcueva.pets.Cat;
import com.balcueva.pets.Dog;
import com.balcueva.pets.Parrot;
import com.balcueva.pets.Pet;
import com.balcueva.pets.Turtle;
import com.balcueva.utils.Enums.Gender;
import com.balcueva.utils.Enums.PetType;
import com.balcueva.utils.Util;

public class App {
  public static void main(String[] args) {
    // part one, create owners
    Owner owner1 = new Owner(new MyDate(1997, 7, 8), Gender.FEMALE, "Anne", "Smith", "+40-741-234-567");
    System.out.println(owner1);
    System.out.println(owner1.noiseInOwnersHouse());
    Pet pet1 = new Cat(true, MyDate.randomDate(2018, 2020), "Joe", Util.getRandom().nextDouble(7));
    Pet pet2 = new Dog(true, MyDate.randomDate(2018, 2020), "Lizzie", Util.getRandom().nextDouble(6));
    Pet pet3 = new Parrot(true, MyDate.randomDate(2018, 2020), "Pityu", Util.getRandom().nextDouble(5));
    Pet pet4 = new Turtle(5, MyDate.randomDate(2018, 2020), "Tim", Util.getRandom().nextDouble(8));
    owner1.addNewPets(pet1, pet2, pet3, pet4);
    System.out.println(owner1);
    System.out.println(owner1.noiseInOwnersHouse());

    // part two, create veterinary centers
    Veterinary medicalCenter =
        new Veterinary("str. Suceava Nr. 4 Targu Mures 540366 Romania", "0740 491 345", "AssisiVet");
    System.out.println(medicalCenter);
    Util.readDiseasesAndTreatmentsFromFile("assets/diseases.csv");
    Util.printAllDiseasesByPetType(PetType.DOG);

    // part three, pet gets sick
    owner1.getPet("Lizzie").unexpectedIllnessOccured();
    System.out.println(owner1.getPet("Lizzie"));
    owner1.getPet("Lizzie").checkHealthStatus();
  }
}
