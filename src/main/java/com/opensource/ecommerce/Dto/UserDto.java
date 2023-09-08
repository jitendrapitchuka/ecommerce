package com.opensource.ecommerce.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto {

    private int id;
    private String name;
    private String email;

    private String password;
    private String mobileNo;
    private Boolean isEmailVerified;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private LocalDate lastLoginTime;
}
