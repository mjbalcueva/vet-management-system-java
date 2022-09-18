package com.balcueva.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Util {
  private static Random random = new Random();
  private ArrayList<String> commonWords = new ArrayList<>();

  private Util() {
    throw new IllegalStateException("Utility class");
  }

  public void readCommonWordsFromFiles(String fileName) {
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
      String line;
      while ((line = br.readLine()) != null) {
        commonWords.add(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static String getRandomNumbers(int n) {
    StringBuilder number = new StringBuilder();
    for (int i = 0; i < n; i++)
      number.append(random.nextInt(10));
    return number.toString();
  }
}
