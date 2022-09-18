package com.balcueva.date;

import com.balcueva.utils.DateUtil;
import com.balcueva.utils.Util;

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

  public static MyDate randomDate(int fromYear, int toYear) {
    int randYear = Util.getRandom().nextInt(fromYear, toYear + 1);
    int randMonth = Util.getRandom().nextInt(1, 12);
    int randDay = Util.getRandom().nextInt(1, 31);
    if (!DateUtil.isValidDate(randYear, randMonth, randDay))
      return randomDate(fromYear, toYear);
    return new MyDate(randYear, randMonth, randDay);
  }

  @Override
  public String toString() {
    return String.format("%04d-%02d-%02d", year, month, day);
  }
}
