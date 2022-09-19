package com.balcueva.pets;

import java.util.ArrayList;
import com.balcueva.date.MyDate;
import com.balcueva.interfaces.IPatient;
import com.balcueva.utils.Enums.Taxonomy;
import com.balcueva.utils.Util.Disease;

public abstract class Pet implements IPatient {
  private int petId;
  private Taxonomy taxonomy;
  private boolean isHealthy;
  protected MyDate birthDate;
  protected String petName;
  private double currentWeight;
  private ArrayList<Disease> diseases;
  private static int numPets;

  protected Pet(MyDate birthDate, String petName, double currentWeight) {
    this.birthDate = birthDate;
    this.petName = petName;
    this.currentWeight = currentWeight;
    isHealthy = true;
    petId = numPets++;
  }

  public String speak() {
    return null;
  }

  public void unexpectedIllnessOccured() {}

  public void checkHealthStatus() {}

  public void healing() {}

  public int getNumPets() {
    return numPets;
  }
}
