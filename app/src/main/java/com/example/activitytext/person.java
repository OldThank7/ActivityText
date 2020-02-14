package com.example.activitytext;

import java.io.Serializable;

public class person implements Serializable {

    private String Name;
    private int age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
