package test;

import java.util.Scanner;

public class Add1ToInsertedNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number, total = 0;
        System.out.println("Insert a number greater than 1:");
        number = keyboard.nextInt();
        do{
            System.out.println("Try again and insert a number greater than 1 please");
            number = keyboard.nextInt();
        }while(number < 1);
        for (int i = 1; i <= number; i++) {
            
            total += i;
            
        }
        
        System.out.println("Total = " + total);
    }
}
