package com.betrybe.minhaconta.business;

import com.ions.lightdealer.sdk.model.Address;
import com.ions.lightdealer.sdk.model.ElectronicDevice;

/**
 * The type Energy bill.
 */
public class EnergyBill {
  // Atributos da classe
  private Address address;
  private boolean residentialPlan;
  private double rate;

  // Req. 1 – Criar o construtor da classe e inicializar os atributos
  public EnergyBill(Address address, boolean residentialPlan) {
    this.address = address;
    this.residentialPlan = residentialPlan;
    this.rate = 0.15;
  }

  // Req. 2 – Calcula a tarifa ajustada para planos não-residenciais
  public double adjustedTariff(double value) {
    if (!residentialPlan) {
      // Implementar a lógica de ajuste de tarifa para planos comerciais
      return value * 1.2; // Exemplo de ajuste para planos comerciais (20% a mais)
    }
    return value;
  }

  // Req. 3 – Calcula o uso total de uma coleção de dispositivos
  public static int calculateTotalUsage(ElectronicDevice[] devices) {
    int totalUsage = 0;
    for (ElectronicDevice device : devices) {
      totalUsage += device.getUsage(); // Supondo que há um método getUsage() em ElectronicDevice
    }
    return totalUsage;
  }

  // Método auxiliar que estima o valor da conta de luz
  public double estimate() {
    double value = calculateTotalUsage(address.getDevicesAsArray()) * rate;
    return adjustedTariff(value);
  }
}
