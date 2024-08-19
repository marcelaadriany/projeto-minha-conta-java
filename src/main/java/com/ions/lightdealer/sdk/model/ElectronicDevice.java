package com.ions.lightdealer.sdk.model;

import java.util.Objects;

/**
 * The type Electronic device.
 */
public class ElectronicDevice {

  private String name;
  private double power;
  private int hoursUsedDaily;
  private int daysUsedMonthly;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPower() {
    return power;
  }

  public void setPower(double power) {
    this.power = power;
  }

  public int getHoursUsedDaily() {
    return hoursUsedDaily;
  }

  public void setHoursUsedDaily(int hoursUsedDaily) {
    this.hoursUsedDaily = hoursUsedDaily;
  }

  public int getDaysUsedMonthly() {
    return daysUsedMonthly;
  }

  public void setDaysUsedMonthly(int daysUsedMonthly) {
    this.daysUsedMonthly = daysUsedMonthly;
  }

  public double monthlyKwh() {
    return power * hoursUsedDaily * daysUsedMonthly / 1000;
  }

  @Override
  public String toString() {
    return "ElectronicDevice{"
        + "name='" + name + '\''
        + ", power=" + power
        + ", hoursUsedDaily=" + hoursUsedDaily
        + ", daysUsedMonthly=" + daysUsedMonthly + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    ElectronicDevice device = (ElectronicDevice) o;

    if (Double.compare(device.power, power) != 0) {
      return false;
    }
    if (hoursUsedDaily != device.hoursUsedDaily) {
      return false;
    }
    if (daysUsedMonthly != device.daysUsedMonthly) {
      return false;
    }
    return Objects.equals(name, device.name);
  }
}
