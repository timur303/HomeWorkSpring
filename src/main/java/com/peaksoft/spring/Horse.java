package com.peaksoft.spring;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Horse implements Animals {
    private String name;
    private String breed;
    private int age;
    private String color;


    public void animalPlus() {
        System.out.println("Speed 40/1 km");
    }

    public void animalMinus() {
        System.out.println("don't game playing kok-boru");
    }
}
