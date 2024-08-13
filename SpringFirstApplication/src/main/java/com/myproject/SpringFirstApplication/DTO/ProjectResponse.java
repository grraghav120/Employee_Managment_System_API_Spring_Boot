package com.myproject.SpringFirstApplication.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectResponse {
    private int id;
    private String Name;
    private String status;
    private Date startTime;
    private Date EndTime;
}
