package com.balcueva.medcenters;

import com.balcueva.interfaces.IMedicalCenter;

public class Veterinary implements IMedicalCenter {
  private String address;
  private String contact;
  private String name;
  private int numberOfPatients = 0;
  private int numberOfDoctors = 0;
  private String medCenterInformation = null;
  private static int veterinaryId;

  public Veterinary(String address, String contact, String name) {
    this.address = address;
    this.name = name;
    this.contact = contact;
    Veterinary.veterinaryId++;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(name + " veterinary");
    sb.append("\n\tAddress: " + address);
    sb.append("\n\tContact: " + contact);
    sb.append("\n\tNumber of doctors: " + numberOfDoctors);
    sb.append("\n\tNumber of current patients: " + numberOfPatients);
    sb.append("\n");
    return sb.toString();
  }
}
