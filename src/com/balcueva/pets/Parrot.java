package com.balcueva.pets;

import java.util.ArrayList;
import com.balcueva.date.MyDate;
import com.balcueva.utils.Util;
import com.balcueva.utils.Enums.BodyType;
import com.balcueva.utils.Enums.PetType;
import com.balcueva.utils.Enums.Seriosity;
import com.balcueva.utils.Enums.Taxonomy;

public class Parrot extends Pet {
  private ArrayList<String> alreadyKnownWords = new ArrayList<>();
  private boolean canSpeak;
  private BodyType bodyType;
  private PetType patientType;
  private Seriosity seriosityOfCase;
  private Taxonomy taxonomy;

  public Parrot(boolean canSpeak, MyDate birthDate, String petName, double currentWeight) {
    super(birthDate, petName, currentWeight);
    this.canSpeak = canSpeak;
    bodyType = BodyType.values()[Util.getRandom().nextInt(BodyType.values().length)];
    patientType = PetType.PARROT;
    taxonomy = Taxonomy.BIRDS;
    if (canSpeak)
      initializeKnownWords();
  }

  private void initializeKnownWords() {
    if (Util.getCommonWords().isEmpty())
      Util.readCommonWordsFromFiles("assets/commonWords.txt");

    int randomNumberOfKnownWords = Util.getRandom().nextInt(Util.getCommonWords().size());
    for (int i = 0; i < randomNumberOfKnownWords; i++) {
      int generatedIndex = Util.getRandom().nextInt(Util.getCommonWords().size());
      this.alreadyKnownWords.add(Util.getCommonWords().get(generatedIndex));
    }
  }

  @Override
  public String speak() {
    if (canSpeak) {
      StringBuilder sb = new StringBuilder();
      sb.append("This parrot can speak and already knows the following words: ");
      sb.append("\n\t\t");
      for (String word : alreadyKnownWords) {
        sb.append(word + " ");
      }
      return sb.toString();
    } else
      return "This parrot can't speak";
  }

  @Override
  public String toString() {
    return "a " + bodyType + " size parrot, named " + petName + " born in " + birthDate.toString();
  }
}
