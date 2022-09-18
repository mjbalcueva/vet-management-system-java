package com.balcueva.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Util {
  protected static final ArrayList<String> commonWords = new ArrayList<>();
  public static final Random random = new Random();

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

  public static String generateRandomNumber(int n) {
    StringBuilder number = new StringBuilder();
    for (int i = 0; i < n; i++)
      number.append(random.nextInt(10));
    return number.toString();
  }
}