package com.balcueva.interfaces;

import java.util.ArrayList;
import com.balcueva.utils.Enums.PetType;

public interface IMedicalCenter {
  public int getNumberOfPatients = 0;
  public int numberOfDoctors = 0;
  public String getMedCenterInformation = null;

  private void hireDoctor(IDoctor doctor) {};

  private void fireDoctor(IDoctor doctor) {};

  private IDoctor assignPatientToDoctor(IPatient patient) {
    return null;
  }

  private ArrayList<IDoctor> getDoctorByPatientType(PetType petType) {
    return new ArrayList<>();
  }

  private int getNumberOfFreeAppointmentsByPatient(IPatient patient) {
    return 0;
  }

  private boolean getAvailabilityByDoctor(IDoctor doctor) {
    return false;
  }
}
