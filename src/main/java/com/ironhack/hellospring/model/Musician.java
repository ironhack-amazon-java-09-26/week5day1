package com.ironhack.hellospring.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Musician {
    private int id;
    private String name;
    private String nationality;
}
