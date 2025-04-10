package com.bridgelabz.practiceProblems;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.JsonObject;
import org.json.JSONObject;

public class MergeJsonObjects {
    public static void main(String[] args) throws JsonProcessingException {
//        ObjectMapper mapper = new ObjectMapper();
//        String json1 = "{\"name\": \"Alice\", \"age\": 25}";
//        String json2 = "{\"email\": \"alice@example.com\", \"age\": 30}";
//
//        ObjectNode obj1 = (ObjectNode) mapper.readTree(json1);
//        ObjectNode obj2 = (ObjectNode) mapper.readTree(json2);
//
//        obj1.setAll(obj2); // this works if both are ObjectNode
//        System.out.println("Merged object: " + obj1.toPrettyString());

        JSONObject node1 = new JSONObject("{\"name\": \"Ishaan\", \"age\": 21}");
        JSONObject node2 = new JSONObject("{\"name\": \"Alice\", \"age\": 25}");

        for(String i:node1.keySet()){
            node2.put(i,node1.get(i));
        }

        System.out.println(node2.toString(2));
    }
}
