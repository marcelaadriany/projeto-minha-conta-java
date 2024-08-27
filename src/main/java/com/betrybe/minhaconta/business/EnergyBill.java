package com.betrybe.minhaconta.business;

import com.ions.lightdealer.sdk.model.Address;
import com.ions.lightdealer.sdk.model.ElectronicDevice;

/**
 * The type Energy bill.
 */
public class EnergyBill {
  // Req. 1 – Create class constructor and attributes.

  protected Address address;
  protected boolean residentialPlan;
  protected  double rate = 0.15;

  public  EnergyBill(Address address, boolean residentialPlan) {
    this.address = address;
    this.residentialPlan = residentialPlan;
  }

  /**
   * Req. 2 – Calculates an adjusted tariff for non-residential plans.
   */
  public double adjustedTariff(double value) {
    if (!residentialPlan) {
      return value * 1.2;
    }
    return value;
  }

  /**
   * Req. 3 – Calculates the total usage of a collection of devices.
   */
  public static int calculateTotalUsage(ElectronicDevice[] devices) {
    return 0;
  }

  /**
   * Aux. Method that estimates the energy bill value.
   */
  public double estimate() {
    double value = calculateTotalUsage(address.getDevicesAsArray()) * rate;

    return adjustedTariff(value);
  }
}