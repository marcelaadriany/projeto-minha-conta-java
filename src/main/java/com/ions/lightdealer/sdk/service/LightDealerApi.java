package com.ions.lightdealer.sdk.service;

import com.ions.lightdealer.sdk.model.Address;
import com.ions.lightdealer.sdk.model.Client;
import com.ions.lightdealer.sdk.model.ElectronicDevice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The type Light dealer api.
 */
public class LightDealerApi {

  private final List<Client> clients = new ArrayList<>();

  /**
   * Find address by registration.
   */
  public Address findAddress(String registration) {
    return clients.stream()
        .flatMap(client -> Arrays.stream(client.getAddressesAsArray()))
        .filter(address -> address.getRegistration().equals(registration))
        .findFirst()
        .orElse(null);
  }

  /**
   * Find client by cpf.
   */
  public Client findClient(String cpf) {
    return clients.stream()
        .filter(client -> client.getCpf().equals(cpf))
        .findFirst()
        .orElse(null);
  }

  public boolean addClient(Client client) {
    return clients.add(client);
  }

  public boolean removeClient(Client client) {
    return clients.remove(client);
  }

  public void addAddressToClient(Address address, Client client) {
    client.addAddress(address);
  }

  /**
   * Transfer address from a client to another.
   */
  public boolean transferAddress(Address address, Client oldClient, Client newClient) {
    if (!oldClient.removeAddress(address)) {
      return false;
    }

    newClient.addAddress(address);
    return true;
  }

  public void addDeviceToAddress(ElectronicDevice device, Address address) {
    address.addDevice(device);
  }
}
