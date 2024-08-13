package com.myproject.SpringFirstApplication.DTO;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressResponse {
    private int id;
    private String Line1;
    private String city;
    private String state;
    private int pincode;
}