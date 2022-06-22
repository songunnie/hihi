package com.example.prac01.dto;

import lombok.Getter;

@Getter
public class MemberRequestDto {
    private String email;
    private String name;
    private int age;
    private int gender;

    public MemberRequestDto(String email, String name, int age, int gender) {
        this.email = email;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
