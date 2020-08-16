package com.company.utils;
import java.util.Scanner;

public class MyScanner {
    private final static Scanner scanner = new Scanner(System.in);

    public static Scanner getScanner() {
        return scanner;
    }
}

