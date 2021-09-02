package com.company;

import java.util.Scanner;

public class Mix_conversion {
    // create method to convert binary to octal and hexadecimal.
    public void binary_to_others(int destinationNumber){
        Scanner scan = new Scanner(System.in);
        System.out.print("Binary number: ");
        int binaryValue= scan.nextInt();
        // to convert binary into octal and hexadecimal number
        // first we need to convert binary into decimal than can convert to others.
        ConvertInTo_decimal obJ_first = new ConvertInTo_decimal();
       int binary_in_decimal = obJ_first.othersToDecimal(binaryValue, 2);
//        System.out.println("Binary number: "+binaryValue);
       // than convert it in to octal /hexadecimal numbers
        //create the object of DecimalTo_others class to access method and attributes of that class
        DecimalTo_others obj_second = new DecimalTo_others();
        int decimal_to_others = obj_second.decimalTo_others(binary_in_decimal,destinationNumber);
        if (destinationNumber == 8){
            System.out.println("Octal number: "+decimal_to_others);
        }
    }
    // create method to convert octal to binary and hexadecimal
    public void octal_to_others(int destination_number) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Octal number: ");
        int octal_number = scan.nextInt();
        // to convert octal into binary and hexadecimal number
        // first we need to convert octal into decimal than can convert to others.
        ConvertInTo_decimal obJ_first = new ConvertInTo_decimal();
        int octal_to_decimal = obJ_first.othersToDecimal(octal_number, 8);
        //than convert decimal to binary
        DecimalTo_others obj_second = new DecimalTo_others();
        int decimal_to_others = obj_second.decimalTo_others(octal_to_decimal, destination_number);
        if (destination_number == 2) {
            System.out.println("Binary number: " + decimal_to_others);
        }
    }
    // create method to convert octal to binary and hexadecimal
    public void hexadecimal_to_others(int destination_number){
        Scanner scan = new Scanner(System.in);
        System.out.print("Hexadecimal number: ");
        String hexadecimal_number = scan.next();
        // to convert octal into binary and hexadecimal number
        // first we need to convert octal into decimal than can convert to others.
        ConvertInTo_decimal obJ_first = new ConvertInTo_decimal();
        int hexadecimal_to_decimal = obJ_first.hexToDecimal(hexadecimal_number);
        //than convert decimal to binary
        DecimalTo_others obj_second = new DecimalTo_others();
        int decimal_to_others = obj_second.decimalTo_others(hexadecimal_to_decimal,destination_number);
        System.out.println(decimal_to_others);
    }
    public static void main(String[] args) {
        Mix_conversion obj_mix = new Mix_conversion();
//        obj_mix.binary_to_others(111,16);
    }
}