package com.balcueva.utils;

public class DateUtil {
  private DateUtil() {
    throw new IllegalStateException("Utility class");
  }

  public static boolean isValidDate(int year, int month, int day) {
    if (year <= 0)
      return false;
    if (month < 1 || month > 12)
      return false;
    if (day < 1 || day > 31)
      return false;
    if (month == 2)
      return day <= (isLeapYear(year) ? 29 : 28);
    if (month == 4 || month == 6 || month == 9 || month == 11)
      return day <= 30;
    return true;
  }

  private static boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
  }
}
