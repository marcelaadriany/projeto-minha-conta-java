package com.ions.lightdealer.sdk.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The type Address.
 */
public class Address {

  private String street;
  private Integer number;
  private String district;
  private String registration;

  private List<ElectronicDevice> devices = new ArrayList<>();

  public void addDevice(ElectronicDevice device) {
    devices.add(device);
  }

  public boolean removeDevice(ElectronicDevice device) {
    return devices.remove(device);
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public String getRegistration() {
    return registration;
  }

  public void setRegistration(String registration) {
    this.registration = registration;
  }

  public ElectronicDevice[] getDevicesAsArray() {
    return devices.toArray(new ElectronicDevice[0]);
  }

  @Override
  public String toString() {
    return "Address{" + "street='" + street + '\''
        + ", number=" + number + ", district='"
        + district + '\'' + ", registration='" + registration + '\''
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

    Address address = (Address) o;

    if (!Objects.equals(street, address.street)) {
      return false;
    }
    if (!Objects.equals(number, address.number)) {
      return false;
    }
    if (!Objects.equals(district, address.district)) {
      return false;
    }
    return Objects.equals(registration, address.registration);
  }
}
