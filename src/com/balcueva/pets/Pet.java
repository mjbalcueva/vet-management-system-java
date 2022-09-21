package com.balcueva.pets;

import java.util.ArrayList;
import com.balcueva.date.MyDate;
import com.balcueva.interfaces.IPatient;
import com.balcueva.utils.Util;
import com.balcueva.utils.Enums.PetType;
import com.balcueva.utils.Enums.Taxonomy;
import com.balcueva.utils.Util.Disease;

public abstract class Pet implements IPatient {
  private int petId;
  private Taxonomy taxonomy;
  private boolean isHealthy;
  private PetType patientType;
  protected MyDate birthDate;
  protected String petName;
  private double currentWeight;
  private ArrayList<Disease> diseases = new ArrayList<>();
  private static int numPets;

  protected Pet(MyDate birthDate, String petName, double currentWeight, PetType patientType) {
    this.birthDate = birthDate;
    this.petName = petName;
    this.currentWeight = currentWeight;
    isHealthy = true;
    petId = numPets++;
    this.patientType = patientType;
  }

  public String speak() {
    return null;
  }

  public void unexpectedIllnessOccured() {
    int randomIllness = Util.getRandom().nextInt(Util.getNumberOfDiseasesByPet(patientType));
    for (int i = 0; i < randomIllness; i++) {
      Disease disease;
      do {
        int randomDisease = Util.getRandom().nextInt(Util.getNumberOfDiseasesByPet(patientType));
        disease = Util.getDiseasesByPetType(patientType).get(randomDisease);
      } while (diseases.contains(disease));
      diseases.add(disease);
    }
    if (!diseases.isEmpty())
      isHealthy = false;
  }

  public void checkHealthStatus() {
    if (isHealthy) {
      System.out.println("The pet is healthy");
    } else {
      System.out.println(petName + " is suffering from the following disease:");
      for (Disease disease : diseases)
        System.out.println("\t- " + disease.getDiseaseType());
    }

  }

  public void healing() {}

  public int getNumPets() {
    return numPets;
  }

  public String getName() {
    return petName;
  }
}
