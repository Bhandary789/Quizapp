package com.jwt.example.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class user {
    private String userId;

    private String name;

    private String email;
}
