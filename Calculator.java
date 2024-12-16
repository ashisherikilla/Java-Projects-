import java.util.*;

class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a symbol for algebraic operation");
        System.out.println("Enter\na for addition\ns for subtraction\nd for division\nm for multiplication");
        String symbol = sc.next();
        System.out.println("Enter the first number");
        float a = sc.nextFloat();
        System.out.println("Enter the secomd number");
        float b = sc.nextFloat();
        if (symbol.charAt(0) == 'a') {
            float add = a + b;
            System.out.println("addition of the entered numbers is:" + add);
        }
        if (symbol.charAt(0) == 's') {
            float min = a - b;
            System.out.println("Subtraction of the entered numbers is:" + min);
        }
        if (symbol.charAt(0) == 'd') {
            float div = a / b;
            System.out.println("division of the entered numbers is:" + div);
        }
        if (symbol.charAt(0) == 'm') {
            float mul = a * b;
            System.out.println("multiplication of the entered numbers is:" + mul);
        } else {
            System.out.println("Enter the valid operations symbol ");
        }
        sc.close();
    }

}