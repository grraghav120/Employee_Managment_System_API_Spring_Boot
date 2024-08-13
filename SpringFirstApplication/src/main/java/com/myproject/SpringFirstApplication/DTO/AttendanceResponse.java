package com.myproject.SpringFirstApplication.DTO;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceResponse {
    private int id;
    private EmployeeResponse employee;
    private String status; //-->0/1
    private Date AttendanceDate;
}
