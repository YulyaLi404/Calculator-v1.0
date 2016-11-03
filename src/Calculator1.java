package Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * My first calculator
 * Created by Crow on 01.11.2016.
 */

public class Calculator1 {

    public static void main(String[] args) throws IOException {

        System.out.println("Calculator v1.0\n");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String line = "------------------------------" + "\n";

        System.out.print("Введите число: ");
        int num1 = Integer.parseInt(reader.readLine());

        System.out.println(line);

            System.out.println("1: " + "'*'\n" + "2: " + "'/'\n" + "3: " + "'+'\n" + "4: " + "'-'");
            System.out.print("Введите цифру нужной операции: ");
            int act = Integer.parseInt(reader.readLine());

            System.out.println(line);


            if (act == 1 || act == 2 || act == 3 || act == 4) {

                System.out.print("Введите число: ");
                int num2 = Integer.parseInt(reader.readLine());

                if (act == 1) {
                    System.out.println(line + "result: " + (num1 * num2));
                } else if (act == 2) {

                    try {
                        System.out.println(line + "result: " + (num1 / num2));
                    } catch (ArithmeticException e) {
                        System.out.println(line + "На ноль делить нельзя!" + "\n" + "result: ∞");
                    }

                } else if (act == 3) {
                    System.out.println(line + "result: " + (num1 + num2));
                } else {
                    System.out.println(line + "result: " + (num1 - num2));
                }
            } else {
                System.out.println(line + "Такой операции нет!");
            }
    }
}

/* Output:

Calculator v1.0

Введите число: 4
------------------------------

1: '*'
2: '/'
3: '+'
4: '-'
Введите цифру нужной операции: 2
------------------------------

Введите число: 2
------------------------------
result: 2 */ 
