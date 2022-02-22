package com.mycompany.propertymanagement.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDTO {
    private String houseNo;
    private String street;
    private String city;
    private String postalCode;
    private String state;
    private String landmark;
    private String country;
}
