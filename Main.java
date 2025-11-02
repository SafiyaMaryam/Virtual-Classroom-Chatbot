package com.classroom;

import com.classroom.chatbot.SimpleQASystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimpleQASystem qaSystem = new SimpleQASystem();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("🤖 Virtual Classroom Chatbot Assistant");
        System.out.println("===============================");
        System.out.println("Ask me questions about Java programming!");
        System.out.println("Type 'help' for commands or 'quit' to exit\n");
        
        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine().trim();
            
            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Chatbot: Goodbye! Happy learning! 🎓");
                break;
            } else if (input.equalsIgnoreCase("help")) {
                showHelp();
            } else if (!input.isEmpty()) {
                String answer = qaSystem.getAnswer(input);
                System.out.println("Chatbot: " + answer);
            }
        }
        
        scanner.close();
    }
    
    public static void showHelp() {
        System.out.println(
            "🤖 Available Commands:\n" +
            "- help: Show this message\n" +
            "- quit: Exit the program\n\n" +
            
            "💡 Try asking:\n" +
            "- What is Java?\n" +
            "- What is OOP?\n" +
            "- What is a class?\n" +
            "- What is inheritance?"
        );
    }
}
