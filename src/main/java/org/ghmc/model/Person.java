package org.ghmc.model;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    
    private int age;
    private boolean adult;
    private List<String> fired = new ArrayList<>();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public List<String> getFired() {
        return fired; 
    }

    public void setFired(List<String> fired) {
        this.fired = fired;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", adult=" + adult + "]";
    }

}
