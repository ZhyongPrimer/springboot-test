package com.example.springboot.demomybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hero {
    
    private int number;
    
    private String name;
    
    private String country;
    
}
