package com.ironhack.hellocrud.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Coffee {
    private Long id;
    private String name;
    private String origin;
    private CoffeeProcess process;
}
