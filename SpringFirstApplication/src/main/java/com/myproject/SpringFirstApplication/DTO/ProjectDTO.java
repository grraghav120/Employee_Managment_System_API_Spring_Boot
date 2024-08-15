package com.myproject.SpringFirstApplication.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDTO {
    private String Name;
    private String status;
    private Date starttime;
    private Date endtime;
}
