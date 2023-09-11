package com.jodos;

import java.util.Scanner;

public class calculatorInJava {
    public  static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        Double number1=scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter second number : ");
        Double number2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter operator you want to use : ");
        String operator =scanner.nextLine();


        if (operator.equals( "+")){
            double result = addNumbers(number1,number2);
            System.out.println("the addition result is " + result);
        }else if (operator.equals("-")){
            double result =substractNumbers(number1,number2);
            System.out.println("the substraction result is " + result);
        } else if ( operator.equals( "/")) {
            double result =  divideNumbers(number1,number2);
            System.out.println("the multiplication result is " + result);
        } else if ( operator == "*") {
            double result = multiplyNumbers(number1,number2);
            System.out.println("the division  result is " + result);
        }
        else  {
            System.out.println("you entered incorrect operator");
        }

    }

    static  double addNumbers(double number1 , double number2 ){
         return  number1 + number2;
    }
    static  double substractNumbers(double number1 , double number2 ){
        return  number1 - number2;
    }

    static  double divideNumbers(double number1 , double number2 ){
        return  number1 / number2;
    }
    static  double multiplyNumbers(double number1 , double number2 ){
        return  number1 * number2;
    }



}
