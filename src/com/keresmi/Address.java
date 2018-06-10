package com.keresmi;

/**
 * Created by keresmi on 10.06.18.
 */
public class Address {

    private String street;
    private String city;
    private String postCode;
    private int houseNumber;

    public Address(String street, String city, String postCode, int houseNumber) {
        this.street = street;
        this.city = city;
        this.postCode = postCode;
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPostCode() {
        return postCode;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", postCode='" + postCode + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
