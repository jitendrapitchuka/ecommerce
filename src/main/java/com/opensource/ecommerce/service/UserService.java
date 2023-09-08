package com.opensource.ecommerce.service;

import com.opensource.ecommerce.Dto.UserDto;
import com.opensource.ecommerce.Entity.User;
import com.opensource.ecommerce.Repo.UserRepo;
import com.opensource.ecommerce.Utils.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    public ApiResponse save(UserDto userDto){
        ApiResponse apiResponse=new ApiResponse();
        LocalDate lastLogin= LocalDate.now();
        User user=new User(userDto.getId(), userDto.getName(), userDto.getEmail(), userDto.getMobileNo(), userDto.getPassword(),
                userDto.getIsEmailVerified(),lastLogin);
        System.out.println(user.toString());
        logger.info(userDto.getName());
        userRepo.save(user);
        apiResponse.setData("User Created Successfully");

        return apiResponse;

    }
}
