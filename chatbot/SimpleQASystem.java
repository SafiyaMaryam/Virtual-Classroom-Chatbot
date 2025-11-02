package com.classroom.chatbot;

import java.util.HashMap;
import java.util.Map;

public class SimpleQASystem {
    private Map<String, String> qaMap;
    
    public SimpleQASystem() {
        qaMap = new HashMap<>();
        setupBasicQA();
    }
    
    private void setupBasicQA() {
        // Add some basic questions and answers
        qaMap.put("what is java", "Java is a programming language used for building applications.");
        qaMap.put("what is oop", "OOP stands for Object-Oriented Programming.");
        qaMap.put("what is a class", "A class is a blueprint for creating objects in Java.");
        qaMap.put("what is inheritance", "Inheritance allows one class to acquire properties of another class.");
    }
    
    public String getAnswer(String question) {
        String questionLower = question.toLowerCase();
        
        // Check if we have an answer
        if (qaMap.containsKey(questionLower)) {
            return qaMap.get(questionLower);
        }
        
        // Try partial match
        for (String key : qaMap.keySet()) {
            if (questionLower.contains(key)) {
                return qaMap.get(key);
            }
        }
        
        return "I don't know the answer to that yet. Try asking about Java or OOP.";
    }
}
