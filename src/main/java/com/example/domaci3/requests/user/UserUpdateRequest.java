package com.example.domaci3.requests.user;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class UserUpdateRequest {
    private Integer userId;

    private String firstName;

    private String lastName;

    private String email;

    private List<String> permissions = new ArrayList<>();
}
