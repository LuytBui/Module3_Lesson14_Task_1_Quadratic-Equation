package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class QuadraticEquation {
    public static void main(String[] args) {
        //
    }

    public static final String EQUATION_STATUS_INFINITE_NUMBER_OF_ROOTS = "This equation has infinite number of roots. Any real number satifies this equation";
    public static final String EQUATION_STATUS_NO_ROOT = "This equation has no root";
    public static final String EQUATION_STATUS_ONE_ROOT = "This equation has one root";
    public static final String EQUATION_STATUS_TWO_ROOTS = "This equation has two roots";
    private double a;
    private double b;
    private double c;
    private double delta;
    List<Double> root;
    private String solveStatus;
    boolean hasRoot;


    public void solve() {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    // Equation: 0 = 0;
                    this.hasRoot = true;
                    this.solveStatus = EQUATION_STATUS_INFINITE_NUMBER_OF_ROOTS;
                    return;
                }
                // Equation: c = 0; c!= 0
                this.hasRoot = false;
                this.solveStatus = EQUATION_STATUS_NO_ROOT;
                return;
            }
            // Equation: bx + c = 0; b!= 0
            this.hasRoot = true;
            this.solveStatus = EQUATION_STATUS_ONE_ROOT;
            this.root.add(-c / b);
            return;
        }

        // Equation: ax^2 + bx + c = 0; a != 0;
        this.delta = b*b - 4 * a * c;
        if (delta < 0){
            this.hasRoot = false;
            this.solveStatus = EQUATION_STATUS_NO_ROOT;
            return;
        }

        if (delta == 0){
            this.hasRoot = true;
            this.solveStatus = EQUATION_STATUS_ONE_ROOT;
            this.root.add(-b / (2 * a));
            return;
        }

        // Equation: ax^2 + bx + c = 0; a != 0; delta > 0;
        this.hasRoot = true;
        this.solveStatus = EQUATION_STATUS_TWO_ROOTS;
        double firstRoot = (-b - Math.sqrt(delta) / (2 * a));
        double secondRoot = (-b + Math.sqrt(delta) / (2 * a));
        this.root.add(firstRoot);
        this.root.add(secondRoot);
    }

    public boolean hasRoot() {
        return hasRoot;
    }

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.root = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "" + a + "x^2 "+
                (b < 0 ? "" : "+") + b + "x"+
                (c < 0 ? "" : "+") + c;
    }

    public String printRootList(){
        switch (root.size()){
            case 0:
                return "";
            case 1:
                return "" + root.get(0);
            case 2:
                return "" + root.get(0) + ", " + root.get(1);
            default:
                return "";
        }
    }

    public String getStatus() {
        return solveStatus;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
