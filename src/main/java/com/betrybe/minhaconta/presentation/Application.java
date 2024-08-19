package com.betrybe.minhaconta.presentation;

import com.betrybe.minhaconta.business.EnergyAccount;
import com.ions.lightdealer.sdk.model.ElectronicDevice;
import com.ions.lightdealer.sdk.service.LightDealerApi;

/**
 * The type Application.
 */
public class Application {

  ConsoleUserInterface ui;
  LightDealerApi api;

  /**
   * Constructor that instantiates a new Application.
   */
  public Application(ConsoleUserInterface ui) {
    this.ui = ui;
    this.api = new LightDealerApi();
  }

  /**
   * Req. 4 – Creates CLI menu.
   */
  public void run() {
  }

  /**
   * Req. 5 – Run menu options.
   */
  public void runOptionAction(char option) {
  }

  /**
   * Req. 6 – Register client.
   */
  public void registerClient() {
  }

  /**
   * Req. 7 – Register client address.
   */
  public void registerClientAddress() {
  }

  /**
   * Req. 8 – Register address devices.
   */
  public void registerAddressDevices() {
  }

  /**
   * Req. 9 – Estimates the address energy bill.
   */
  public void estimateAddressBill() {
  }

  /**
   * Req. 10 – Optimizes the energy bill.
   */
  public void optimizeEnergyBill() {
  }

  /**
   * Req 10 - Aux. Method to display high consumptions devices.
   */
  public void suggestReducedUsage(EnergyAccount energyAccount) {
  }
}
