package com.balcueva.date;

import com.balcueva.utils.DateUtil;

public class MyDate {
  private int year;
  private int month;
  private int day;
  public final String formatForPersonalID;

  public MyDate(int year, int month, int day) {
    if (!DateUtil.isValidDate(year, month, day))
      throw new IllegalStateException("Invalid date!");
    this.year = year;
    this.month = month;
    this.day = day;
    this.formatForPersonalID = String.format("%02d%02d%02d", year % 100, month, day);
  }

  @Override
  public String toString() {
    return String.format("%04d-%02d-%02d", year, month, day);
  }
}
