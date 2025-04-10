package com.bridgelabz.practiceProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class FilterJsonRecords {
    public static void main(String[] args) {
        try{
            ObjectMapper map = new ObjectMapper();

            JsonNode node = map.readTree(new File("C:\\Users\\dell\\Desktop\\bridgelabz-workspace\\java-json-file-handling\\src\\main\\java\\com\\bridgelabz\\practiceProblems\\jsonData.json"));
            for(JsonNode i:node){
                String age = i.get("age").toString();

                if(age.compareTo("25")>0){
                    System.out.println(i.toPrettyString());
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
