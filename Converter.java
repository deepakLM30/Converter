package com.company;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        //create the object of scanner class to access the method of that class
        Scanner scan = new Scanner(System.in);
        //create object of decimalTo_others and ConvertInTo_decimal class to access that method and attributes.
        DecimalTo_others obj_decimalTo_others = new DecimalTo_others();
        ConvertInTo_decimal obj_ConvertTo_decimal = new ConvertInTo_decimal();
        // Aslo  create the of object of Mix_conversion class
        Mix_conversion obj_mix_conversion = new Mix_conversion();
        System.out.println("Provides following information:");
        System.out.print("Base of Source number(2,8,10,16): ");
        int base_sourceNumber = scan.nextInt();
        System.out.print("Base of Destination number(2,8,10,16): ");
        int base_destinationNumber = scan.nextInt();
        //if there is different base of source and destination number
        // number with same base does not need to convert .
        if (base_sourceNumber != base_destinationNumber){
            if (base_sourceNumber == 10){
                System.out.print("Decimal number: ");
                int decimal_number = scan.nextInt();
                System.out.print(obj_decimalTo_others.decimalTo_others(decimal_number,base_destinationNumber));
            }
            else if (base_sourceNumber !=10 && base_destinationNumber == 10){
                obj_ConvertTo_decimal.inDecimal(base_sourceNumber);
            }
            else if(base_sourceNumber == 2 && base_destinationNumber !=10){
                obj_mix_conversion.binary_to_others(base_destinationNumber);
            }
            else if(base_sourceNumber == 8 && base_destinationNumber !=10){
                obj_mix_conversion.octal_to_others(base_destinationNumber);
            }
            else if (base_sourceNumber == 16 && base_destinationNumber !=10){
                obj_mix_conversion.hexadecimal_to_others(base_destinationNumber);
            }
        }
        else {
            System.out.println("Invalid Input.");
            System.out.println("Number with same base unable to convert.");
        }
    }
}