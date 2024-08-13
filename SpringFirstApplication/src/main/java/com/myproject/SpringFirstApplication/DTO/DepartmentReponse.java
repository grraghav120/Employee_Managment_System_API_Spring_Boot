package com.myproject.SpringFirstApplication.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentReponse {
    private int id;
    private String Name;
    private String HOD;
}
