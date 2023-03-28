package com.oops_problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<String> portfolio = new ArrayList<>();

    public static void addmethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Stock Name = ");
        String stockName = sc.next();
        System.out.println("Enter Number of shares = ");
        String numberOfShares = sc.next();
        System.out.println("Enter share price = ");
        String sharePrice = sc.next();

        StockReport report = new StockReport(stockName, numberOfShares, sharePrice);
        System.out.println(report.toString());
        portfolio.add(report.toString());
    }

    public static void main(String[] args) {
        addmethod();
    }
}
