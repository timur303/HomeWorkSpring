package com.peaksoft.spring;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class Cow implements Animals{
    private String name;
    private String color;
    private int age;
    private String breed;

    @Override
    public void animalPlus() {
        System.out.println("Кунуно 20 литр сут берет");
    }

    @Override
    public void animalMinus() {
        System.out.println("Эт багытында эмес");
    }
}
