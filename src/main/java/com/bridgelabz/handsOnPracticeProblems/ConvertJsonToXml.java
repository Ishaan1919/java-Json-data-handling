package com.bridgelabz.handsOnPracticeProblems;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class ConvertJsonToXml {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper map = new ObjectMapper();
        JsonNode node = map.readTree("{\n" +
                "  \"id\": 101,\n" +
                "  \"name\": \"Ishaan\",\n" +
                "  \"age\": 22,\n" +
                "  \"email\": \"ishaan@example.com\",\n" +
                "  \"skills\": [\"Java\", \"Spring Boot\"]\n" +
                "}\n");

        XmlMapper xmlMap = new XmlMapper();
        String xmlFormat = xmlMap.writeValueAsString(node);
        System.out.println(xmlFormat.toString());
    }
}
