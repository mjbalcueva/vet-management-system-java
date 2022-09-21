package com.balcueva.utils;

public class Enums {
  public enum Seriosity {
    GREEN, YELLOW, RED;
  }

  public enum BodyType {
    SMALL("Small"), MEDIUM("Medium"), LARGE("Large");

    private String value;

    private BodyType(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return value;
    }
  }

  public enum PetType {
    DOG("Dog"), CAT("Cat"), PARROT("Parrot"), TURTLE("Turtle");

    private String value;

    private PetType(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return value;
    }
  }

  public enum Taxonomy {
    MAMMALS, BIRDS, REPTILES, FISH, AMPHIANS, INVERTEBRATES
  }

  public enum Gender {
    MALE, FEMALE
  }

  public enum TurtleClassification {
    // @formatter:off
    TESTUDINOIDEA("Testudinoidea"), EMYDIDAE("Emydidae"), TESTUDINIDAE("Testudinidae"),
    GEOEMYDIDAE("Geoemydidae"), TRIONYCHIDAE("Trionychidae");
    // @formatter:on

    private String value;

    private TurtleClassification(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return value;
    }
  }

  public enum CatBreed {
    // @formatter:off
    POLYDACTYL("Polydactyl"), SNOWSHOE("Snowshoe"), CALICO("Calico"),
    BRITISHSHORTHAIR("British Shorthair"), SIAMESE("Siamese"), JAPANESEBOBTAIL("Japanese Bobtail"),
    PERSIAN("Persian"), SCOTTISHFOLD("Scottish Fold"), GRAYTABBY("Gray Tabby");
    // @formatter:on

    private String value;

    private CatBreed(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return value;
    }
  }

  public enum DogBreed {
    // @formatter:off
    LABRADORRETRIEVER("Labrador Retriever"), GERMANSHEPPERD("German Shepperd"),
    GOLDENRETRIEVER("Golden Retriever"), FRENCHBULLDOG("French Bulldog"), BEAGLE("Beagle"),
    BULLDOG("Bulldog"), POODLES("Poodles");
    // @formatter:on

    private String value;

    private DogBreed(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return value;
    }
  }
}
