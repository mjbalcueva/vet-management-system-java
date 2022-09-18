package com.balcueva.utils;

public class Enums {
  public enum Seriosity {
    GREEN, YELLOW, RED;
  }

  public enum BodyType {
    SMALL, MEDIUM, LARGE;
  }

  public enum PetType {
    DOG, CAT, PARROT, TURTLE
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
    LABRADORRETRIEVER("Labrador Retriever"), GERMANSHEPPERDS("German Shepperds"),
    GOLDENRETRIEVER("Golden Retriever"), FRENCHBULLDOGS("French Bulldogs"), BEAGLES("Beagles"),
    BULLDOGS("Bulldogs"), POODLES("Poodles");
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
