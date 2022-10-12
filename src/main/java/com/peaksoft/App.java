package com.peaksoft;

import com.peaksoft.spring.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("Person", Person.class);
        Person person1 = context.getBean("Person1", Person.class);
        System.out.println(person.getName() + " " + person.getAge() + " " + person.getAnimals());
        //methodHorse
        person.getAnimals().animalMinus();
        person.getAnimals().animalPlus();
        System.out.println("______________________________________________");
        //person2
        System.out.println(person1.getName() + " " + person1.getAge() + " " + person1.getAnimals());
        //methodCow
        person1.getAnimals().animalMinus();
        person1.getAnimals().animalPlus();

    }
}
