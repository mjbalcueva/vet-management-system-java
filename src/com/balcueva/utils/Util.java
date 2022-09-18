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
  private ArrayList<Disease> diseases;

  private Util() {
    throw new IllegalStateException("Utility class");
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

  public class Disease {
    private ArrayList<String> treatments;
    private String disease;
    private PetType petType;

    public Disease(String disease, PetType petType) {
      this.disease = disease;
      this.petType = petType;
      treatments = new ArrayList<>();
    }
  }
}
