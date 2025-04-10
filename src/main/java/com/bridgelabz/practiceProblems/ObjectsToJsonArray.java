package com.bridgelabz.practiceProblems;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class ObjectsToJsonArray {
    public static void main(String[] args) throws JsonProcessingException {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Ishaan",21));
        list.add(new Student("Sid",22));
        list.add(new Student("Nash",23));


        ObjectMapper map = new ObjectMapper();

        JSONArray arr = new JSONArray();

        for(Student i:list){
            arr.put(map.writeValueAsString(i));
        }

        System.out.println(arr.toString(20));
    }
}
