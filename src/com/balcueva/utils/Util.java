package com.balcueva.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.balcueva.utils.Enums.PetType;

public class Util {
  private static Random random = new Random();
  private static ArrayList<String> commonWords = new ArrayList<>();
  private static ArrayList<Disease> diseases = new ArrayList<>();

  private Util() {
    throw new IllegalStateException("Utility class");
  }

  public static void readDiseasesAndTreatmentsFromFile(String filename) {
    try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
      String line;
      while ((line = br.readLine()) != null) {
        String[] values = line.split(", ");
        Disease disease = new Disease(PetType.valueOf(values[0].toUpperCase()), values[1]);
        if (values.length >= 2)
          for (int i = 2; i < values.length; i++)
            disease.treatments.add(values[i]);
        else
          disease.treatments.add("No treatment available");
        diseases.add(disease);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void printAllDiseasesByPetType(PetType petType) {
    System.out.println("All diseases in case of " + petType);
    for (Disease disease : diseases) {
      if (disease.petType == petType) {
        System.out.println("\t~ Treatments for " + disease.diseaseType + " Disease:");
        for (String treatment : disease.treatments)
          System.out.println("\t\t- " + treatment);
        System.out.println();
      }
    }
  }

  public static List<Disease> getDiseasesByPetType(PetType petType) {
    ArrayList<Disease> diseasesByPetType = new ArrayList<>();
    for (Disease disease : diseases)
      if (disease.petType == petType)
        diseasesByPetType.add(disease);
    return diseasesByPetType;
  }

  public static int getNumberOfDiseasesByPet(PetType petType) {
    int count = 0;
    for (Disease disease : diseases)
      if (disease.petType == petType)
        count++;
    return count;
  }

  public static void readCommonWordsFromFiles(String fileName) {
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
      String line;
      while ((line = br.readLine()) != null) {
        commonWords.add(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static Random getRandom() {
    return random;
  }

  public static List<String> getCommonWords() {
    return commonWords;
  }

  public static class Disease {
    private PetType petType;
    private String diseaseType;
    private ArrayList<String> treatments;

    public Disease(PetType petType, String diseaseType) {
      this.petType = petType;
      this.diseaseType = diseaseType;
      treatments = new ArrayList<>();
    }

    public String getDiseaseType() {
      return diseaseType;
    }
  }
}
