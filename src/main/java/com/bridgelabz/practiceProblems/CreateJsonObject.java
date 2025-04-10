package com.bridgelabz.practiceProblems;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonObject {
    public static void main(String[] args) {
        JSONObject student = new JSONObject();
        student.put("name","Ishaan");
        student.put("age",21);

        JSONArray subjects = new JSONArray();
        subjects.put("java");
        subjects.put("c++");
        subjects.put("javaScript");
        subjects.put("ruby");
        subjects.put("python");

        student.put("subjects",subjects);

        System.out.println(student);
    }
}
