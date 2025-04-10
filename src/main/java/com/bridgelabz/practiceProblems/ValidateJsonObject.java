package com.bridgelabz.practiceProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ValidateJsonObject {
    public static void main(String[] args) {
        try{
            ObjectMapper map = new ObjectMapper();
            JsonNode node = map.readTree(new File("C:\\Users\\dell\\Desktop\\bridgelabz-workspace\\java-json-file-handling\\src\\main\\java\\com\\bridgelabz\\practiceProblems\\jsonData.json"));
            System.out.println("The json object has a valid structure");
        } catch (IOException e){
            System.out.println("The json object does not have valid structure");
            e.printStackTrace();
        }
    }
}
