package com.company;

import java.util.Scanner;

public class ConvertInTo_decimal {
    //crate the method for find out power of integer numbers
    private int pow(int base , int power){
        if (power == 0){
            return 1;
        }
        else {
            return base * pow(base ,power -1);
        }
    }
// create separate method to convert hex to decimal because hex decimal number can contains character(A,to F)
    public int hexToDecimal(String hexnum) {
        String hstring = "0123456789ABCDEF";
        hexnum = hexnum.toUpperCase();
        int decimal_value = 0;
        for (int i = 0; i < hexnum.length(); i++) {
            char ch = hexnum.charAt(i);
            int n = hstring.indexOf(ch);
            decimal_value = 16 * decimal_value + n;
        }
        return decimal_value;
    }
    //create the method to convert binary to decimal
    public int othersToDecimal(int sourceNumber, int number_type){
        int i = 0;
        int reminder;
        int raw_decimal;
        int decimal =0;
        while (sourceNumber >0){
            reminder = sourceNumber % 10;
            raw_decimal = reminder * pow(number_type,i++);
            decimal +=raw_decimal;
            sourceNumber /=10;
        }
        return decimal;
    }
    //method for find out which number
    public String type_check(int number){
        String number_type;
        switch (number){
            case 2:
                number_type ="Binary number:";
                break;
            case 8:
                number_type = "Octal number:";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + number);
        }
        return number_type;
    }
    //check validity of base
    private void base_check(int base){
        if (base ==2 || base ==8 || base ==16){
        }
        else {
            System.out.println("invalid base.");
        }
    }
    //create method for display output
    public void inDecimal(int number_base){
        //crate the object for access the method of ConvertInto_decimal class
        Scanner input = new Scanner(System.in);
        int source_number;
//        int number_base;
//        System.out.print("Base of number(2,8,16):");
////        number_base = input.nextInt();
        base_check(number_base);//call the base_check method to find valid or invalid base
        if (number_base == 16){
            System.out.println("Hexadecimal number to decimal number");
            System.out.print("Hexadecimal number: ");
           String hexDecimal = input.next();
           input.close();
            System.out.printf("Decimal number: %d",hexToDecimal(hexDecimal));
        }
        else {
            if (number_base == 2){
                System.out.println("Binary number to decimal number");
            }else {
                System.out.println("Octal number to decimal number");
            }
            System.out.print(type_check(number_base));
            source_number = input.nextInt();
            System.out.printf("Decimal numbers: %d", othersToDecimal(source_number, number_base));
        }
    }
    public static void main(String[] args) {
        //main method
        Scanner input = new Scanner(System.in);
        ConvertInTo_decimal obj_convert = new ConvertInTo_decimal();
        System.out.print("Base of number(2,8,16):");
        int  number_base = input.nextInt();
        obj_convert.inDecimal(number_base);
    }
}