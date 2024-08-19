package com.ions.lightdealer.sdk.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The type Client.
 */
public class Client {

  private String name;
  private String cpf;
  private final List<Address> addresses = new ArrayList<>();

  public void addAddress(Address address) {
    addresses.add(address);
  }

  public boolean removeAddress(Address address) {
    return addresses.remove(address);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Address[] getAddressesAsArray() {
    return addresses.toArray(new Address[0]);
  }

  @Override
  public String toString() {
    return "Client{"
        + "name='" + name + '\''
        + ", cpf='" + cpf + '\''
        + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Client client = (Client) o;

    if (!Objects.equals(name, client.name)) {
      return false;
    }
    return Objects.equals(cpf, client.cpf);
  }
}
