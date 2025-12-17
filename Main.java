import java.util.Scanner;

abstract class Calculator {
    abstract void add();
    abstract void sub();
    abstract void mul();
    abstract void div();
}

class MyCalculator extends Calculator {
    void add() {
        int number1 = 20;
        int number2 = 30;
        int sum = number1 + number2;
        System.out.println("the sum is: " + sum);
    }

    void sub() {
        int number1 = 20;
        int number2 = 30;
        int diff = number1 - number2;
        System.out.println("the sub is: " + diff);
    }

    void mul() {
        int number1 = 20;
        int number2 = 30;
        int mul = number1 * number2;
        System.out.println("the mul is: " + mul);
    }

    void div() {
        int number1 = 20;
        int number2 = 30;
        int div = number1 / number2;
        System.out.println("the div is: " + div);
    }
}

public class Main {
    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator();
        
        mc.add();
        mc.sub();
        mc.mul();
        mc.div();
    }
}