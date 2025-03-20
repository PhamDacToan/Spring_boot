package com.example.demo.dto.request;
import lombok.*;

@Getter
@Setter
public class UserCreationRequest {
    private String name;
    private String password;
    private String email;
}
