package com.balcueva.pets;

import com.balcueva.date.MyDate;
import com.balcueva.utils.Util;
import com.balcueva.utils.Enums.PetType;
import com.balcueva.utils.Enums.Seriosity;
import com.balcueva.utils.Enums.Taxonomy;
import com.balcueva.utils.Enums.TurtleClassification;

public class Turtle extends Pet {
  private int numHibernatingMonths;
  private PetType patientType;
  private Seriosity seriosityOfCase;
  private Taxonomy taxonomy;
  private TurtleClassification classification;

  public Turtle(int numHibernatingMonths, MyDate birthDate, String petName, double currentWeight) {
    super(birthDate, petName, currentWeight, PetType.TURTLE);
    this.numHibernatingMonths = numHibernatingMonths;
    classification =
        TurtleClassification.values()[Util.getRandom().nextInt(TurtleClassification.values().length)];
    taxonomy = Taxonomy.REPTILES;
  }

  @Override
  public String speak() {
    return "You cannot hear the voice of this turtle";
  }

  @Override
  public String toString() {
    return "a " + classification + " turtle, named " + petName + " born in " + birthDate.toString();
  }
}
