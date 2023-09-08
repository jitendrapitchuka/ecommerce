package com.opensource.ecommerce.controller;

import com.opensource.ecommerce.Dto.UserDto;
import com.opensource.ecommerce.Utils.ApiResponse;
import com.opensource.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signUp")
    public ResponseEntity<ApiResponse> save(@RequestBody UserDto userDto){
        ApiResponse apiResponse=userService.save(userDto);
        return ResponseEntity.ok().body(apiResponse);
    }

}
