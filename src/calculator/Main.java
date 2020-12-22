package calculator;

import calculator.operations.Add;
import calculator.operations.Divide;
import calculator.operations.Multiply;
import calculator.operations.Subtract;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        float numberA = scan.nextFloat();
        scan.nextLine();
        System.out.println("Enter 2nd number:");
        float numberB = scan.nextFloat();
        System.out.println("Enter +, -, *, or /:");
        scan.nextLine();
        char operation = scan.nextLine().charAt(0);
        float result = 0;
        switch (operation) {
            case '+':
                Add add = new Add(numberA, numberB);
                result = add.result();
                break;
            case '-':
                Subtract subtract = new Subtract(numberA, numberB);
                result = subtract.result();
                break;
            case '*':
                Multiply multiply = new Multiply(numberA, numberB);
                result = multiply.result();
                break;
            case '/':
                Divide divide = new Divide(numberA, numberB);
                result = divide.result();
                break;
        }
        printResults(numberA, numberB, operation, result);
    }

    private static void printResults (float a, float b, char o, float r) {
        DecimalFormat display = new DecimalFormat("0.######");
        System.out.println(display.format(a) + " " + o + " " + display.format(b) + " = " + display.format(r));
    }
}
