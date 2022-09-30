package com.balcueva.people;

import java.util.ArrayList;
import com.balcueva.date.MyDate;
import com.balcueva.interfaces.IDoctor;
import com.balcueva.interfaces.IPatient;
import com.balcueva.utils.Enums.Gender;

public class Veterinarian extends Person implements IDoctor {
  private int max_patients_per_day;
  private ArrayList<IPatient> patients = new ArrayList<>();

  protected Veterinarian(MyDate birthDate, Gender gender, String firstName, String lastName, String contact) {
    super(birthDate, gender, firstName, lastName, contact);
  }

  public void addNewPatient(IPatient patient) {
    patients.add(patient);
  }

  public boolean treatPatient(IPatient patient) {
    return false;
  }
}
