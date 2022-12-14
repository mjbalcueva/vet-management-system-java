package com.balcueva.pets;

import com.balcueva.date.MyDate;
import com.balcueva.utils.Util;
import com.balcueva.utils.Enums.CatBreed;
import com.balcueva.utils.Enums.PetType;
import com.balcueva.utils.Enums.Seriosity;
import com.balcueva.utils.Enums.Taxonomy;

public class Cat extends Pet {
  private boolean hasPedigree;
  private CatBreed catBreed;
  private PetType patientType;
  private Seriosity seriosityOfCase;
  private Taxonomy taxonomy;

  public Cat(boolean hasPedigree, MyDate birthDate, String petName, double currentWeight) {
    super(birthDate, petName, currentWeight);
    this.hasPedigree = hasPedigree;
    catBreed = CatBreed.values()[Util.getRandom().nextInt(CatBreed.values().length)];
    patientType = PetType.CAT;
    taxonomy = Taxonomy.MAMMALS;
  }

  @Override
  public String speak() {
    return "Miau";
  }

  @Override
  public String toString() {
    return "a " + catBreed + " cat, named " + petName + " born in " + birthDate.toString();
  }
}
