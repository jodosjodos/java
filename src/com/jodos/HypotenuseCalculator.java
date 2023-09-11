package com.jodos;

import java.util.Scanner;

public class HypotenuseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side x :");
        double sideX = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter side Y : ");
        double sideY = scanner.nextDouble();
//        scanner.nextLine();
        double sideZ = Math.sqrt(Math.pow(sideX,2)+ Math.pow(sideY,2));
        System.out.println("The hypotenus of "+ sideX + "  and  " + sideY + "  is  " + sideZ);
    }
}
