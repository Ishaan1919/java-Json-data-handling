package com.bridgelabz.practiceProblems;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.Serializable;


class Car{
    String name;
    String brand;

    public Car(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

public class JavaObjectToJson {

    public static void main(String[] args) throws JsonProcessingException {


//            Car person = new Car("Alice", "25");
//            Gson gson = new Gson();
//
//            String json = gson.toJson(person);
//            System.out.println(json);

            Car car = new Car("Taigun","VoxWagon");
            ObjectMapper map = new ObjectMapper();
            String json = map.writeValueAsString(car);
            System.out.println(json);

    }
}
