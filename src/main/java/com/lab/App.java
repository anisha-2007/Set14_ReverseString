package com.lab;

public class App {

    public static String reverseString(String text) {
        if (text == null) {
            throw new IllegalArgumentException(
                    "String must not be null");
        }

        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {
        String text = "Hello World";

        System.out.println("Original string: " + text);
        System.out.println("Reversed string: " + reverseString(text));
    }
}