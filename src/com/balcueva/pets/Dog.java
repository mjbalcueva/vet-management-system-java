package com.balcueva.pets;

import com.balcueva.date.MyDate;
import com.balcueva.utils.Util;
import com.balcueva.utils.Enums.DogBreed;
import com.balcueva.utils.Enums.PetType;
import com.balcueva.utils.Enums.Seriosity;
import com.balcueva.utils.Enums.Taxonomy;

public class Dog extends Pet {
  private boolean goodHouseKeeper;
  private DogBreed dogBreed;
  private Seriosity seriosityOfCase;
  private Taxonomy taxonomy;

  public Dog(boolean goodHouseKeeper, MyDate birthDate, String petName, double currentWeight) {
    super(birthDate, petName, currentWeight, PetType.DOG);
    this.goodHouseKeeper = goodHouseKeeper;
    dogBreed = DogBreed.values()[Util.getRandom().nextInt(DogBreed.values().length)];
    taxonomy = Taxonomy.MAMMALS;
  }

  @Override
  public String speak() {
    return "Wuff wuff";
  }

  @Override
  public String toString() {
    return "a " + dogBreed + " dog, named " + petName + " born in " + birthDate.toString();
  }
}
