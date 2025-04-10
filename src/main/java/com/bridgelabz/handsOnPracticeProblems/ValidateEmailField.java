package com.bridgelabz.handsOnPracticeProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

import java.io.File;
import java.io.IOException;

public class ValidateEmailField {
    public static void main(String[] args) {
        try{
            ObjectMapper map = new ObjectMapper();
            JsonNode schemaNode = map.readTree(new File("C:\\Users\\dell\\Desktop\\bridgelabz-workspace\\java-json-file-handling\\src\\main\\java\\com\\bridgelabz\\handsOnPracticeProblems\\schema.json"));
            JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
            JsonSchema schema = factory.getJsonSchema(schemaNode);

            JsonNode userNode = map.readTree(new File("C:\\Users\\dell\\Desktop\\bridgelabz-workspace\\java-json-file-handling\\src\\main\\java\\com\\bridgelabz\\handsOnPracticeProblems\\user.json"));
            ProcessingReport report = schema.validate(userNode);

            if(report.isSuccess()){
                System.out.println("This is a valid json schema for email");
            }
            else{
                System.out.println("This is not a valid json schema for email");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ProcessingException e) {
            e.printStackTrace();
        }
    }
}
