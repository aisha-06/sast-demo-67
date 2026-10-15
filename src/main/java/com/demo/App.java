package com.demo;

public class App {

    public static void main(String[] args) {

        System.out.println("SAST Demo Application");

        if (args.length == 0 || args[0].isBlank()) {
            System.err.println("Please provide a username.");
            return;
        }
    
        String username = args[0];
        System.out.println("Welcome " + username);
    }
}
