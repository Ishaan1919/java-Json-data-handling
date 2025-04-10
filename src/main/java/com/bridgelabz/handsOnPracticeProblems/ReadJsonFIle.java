package com.bridgelabz.handsOnPracticeProblems;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ReadJsonFIle {
    public static void main(String[] args) {
        try{

            ObjectMapper map = new ObjectMapper();
            JsonNode node = map.readTree(new File("C:\\Users\\dell\\Desktop\\bridgelabz-workspace\\java-json-file-handling\\src\\main\\java\\com\\bridgelabz\\practiceProblems\\jsonData.json"));

            System.out.println(node.toPrettyString());

        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
