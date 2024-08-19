package com.betrybe.minhaconta.presentation;

import com.ions.lightdealer.sdk.model.Address;
import com.ions.lightdealer.sdk.model.Client;
import com.ions.lightdealer.sdk.model.ElectronicDevice;
import java.util.Scanner;

/**
 * The type Console user interface.
 */
public class ConsoleUserInterface {

  private final Scanner scanner;

  /**
   * Instantiates a new Console user interface.
   *
   * @param scanner the scanner
   */
  public ConsoleUserInterface(Scanner scanner) {
    this.scanner = scanner;
  }

  /**
   * Menu.
   */
  public char inputMenuOption(String[] options) {
    for (String option : options) {
      System.out.println(option);
    }

    return scanner.nextLine().charAt(0);
  }

  /**
   * Fill client data.
   */
  public void fillClientData(Client client) {
    System.out.println("Entre com o nome da pessoa cliente que deseja cadastrar:");
    client.setName(scanner.nextLine());

    System.out.println("Entre com o CPF da pessoa cliente que deseja cadastrar:");
    client.setCpf(scanner.nextLine());
  }

  /**
   * Fill address data.
   */
  public void fillAddressData(Address address) {
    System.out.println("Entre com o número da matrícula do imóvel que deseja cadastrar:");
    address.setRegistration(scanner.nextLine());

    System.out.println("Entre com o nome da rua do imóvel que deseja cadastrar:");
    address.setStreet(scanner.nextLine());

    System.out.println("Entre com o número do imóvel que deseja cadastrar:");
    address.setNumber(Integer.parseInt(scanner.nextLine()));

    System.out.println("Entre com o nome do bairro do imóvel que deseja cadastrar:");
    address.setDistrict(scanner.nextLine());
  }

  /**
   * Fill device data.
   */
  public void fillDeviceData(ElectronicDevice device) {
    System.out.println("Entre com o nome do dispositivo que deseja cadastrar:");
    device.setName(scanner.nextLine());

    System.out.println("Entre com a potência do dispositivo que deseja cadastrar:");
    device.setPower(Integer.parseInt(scanner.nextLine()));

    System.out.println("Entre com o número de horas por dia que planeja utilizar o dispositivo:");
    device.setHoursUsedDaily(Integer.parseInt(scanner.nextLine()));

    System.out.println("Entre com o número de dias por mês que planeja utilizar o dispositivo:");
    device.setDaysUsedMonthly(Integer.parseInt(scanner.nextLine()));
  }

  /**
   * Input client cpf.
   */
  public String inputClientCpf() {
    System.out.println("Entre com o CPF da pessoa cliente:");
    return scanner.nextLine();
  }

  /**
   * Input address registration.
   */
  public String inputAddressRegistration() {
    System.out.println("Entre com o número da matrícula do imóvel:");
    return scanner.nextLine();
  }

  /**
   * Input devices amount.
   */
  public int inputNumberOfDevices() {
    System.out.println("Entre com o número de dispositivos que pretende cadastrar:");
    return Integer.parseInt(scanner.nextLine());
  }

  /**
   * Show any message.
   */
  public void showMessage(String message) {
    System.out.println(message);
  }
}
