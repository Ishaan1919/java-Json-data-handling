package com.bridgelabz.practiceProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ExtractSpecificFields {
    public static void main(String[] args) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            JsonNode node = mapper.readTree(new File("C:\\Users\\dell\\Desktop\\bridgelabz-workspace\\java-json-file-handling\\src\\main\\java\\com\\bridgelabz\\practiceProblems\\jsonData.json"));

            if(node.has("name")){
                System.out.println("Name: " + node.get("name"));
            }

            if(node.has("email")){
                System.out.println("Email: " + node.get("email"));
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
