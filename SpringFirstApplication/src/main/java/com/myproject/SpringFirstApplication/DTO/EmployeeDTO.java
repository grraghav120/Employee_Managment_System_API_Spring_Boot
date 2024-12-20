package com.myproject.SpringFirstApplication.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private String Name;
    private int phoneno;
    private String Email;
    private Date DOB;
    private Date DOJ;
    private int Salary;
    private int addressid;
}
