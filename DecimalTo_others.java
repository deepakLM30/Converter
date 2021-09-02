//program to convert decimal number to others number such as binary ,octal and hexadecimal.
package com.company;

import java.util.Scanner;

public class DecimalTo_others {//create the Main class
    //create method for convert decimal to others number(binary and decimal numbers).
    public int decimalTo_others(int decimalNumber, int destinationNumber){//this method take to arguments decimal value and number for convert
        // if destinationNumber is 16 than it convert into hexadecimal number.
        // than here assign required variables and their value.
        ConvertInTo_decimal obj_convert_in_decimal = new ConvertInTo_decimal();
        int quotation = decimalNumber;
        int[] destination_number = new int[100];//this array store the reminder but for real answer we must reverse the array.
        int bohxNumber = 0;
        int reminder;
        int i = 0;
        int value;
        String hexaPosition = "0123456789ABCDEF";//we can display the character as well in hexadecimal number using it .
        //this while loop help to find out the reminder and store that reminder in array.
        while (quotation != 0) {
            reminder = quotation % destinationNumber;
            destination_number[i++] = reminder;
            quotation = quotation / destinationNumber;
        }
        //hexadecimal number contains characters(A to F) so we must display output with related character
        if (destinationNumber == 16) { //check the number is hexadecimal or not if ture than
            System.out.print("Hexadecimal number: ");
            for (int j = i-1; j >=0; j--) {//use loop for access elements of array destination_number from last position
                // because it help to reverse the value
                value = destination_number[j];//find the value in related index or position of array
                System.out.print(hexaPosition.charAt(value));//print the value according to the value by using string hexaPosition
                // for e.g. if value is 15 it print F according to the index in above string hexaPosition.
            }
            System.out.println("\n");
        } else {//if destination number is 2 or 8 than
            System.out.print(obj_convert_in_decimal.type_check(destinationNumber));
            for (int j = i - 1; j >= 0; j--) {//this loop help to reverse the array and store value in one variable than
                bohxNumber = bohxNumber * 10 + destination_number[j];

            }
            return bohxNumber;// we return the value of that variable like bohxNumber.
        }
        return bohxNumber;
    }
    //create the method for
    public static void main(String[] args) {
        DecimalTo_others obj_new = new DecimalTo_others();//create the object of DecimalTo_others class for access method of that class.
        Scanner scan = new Scanner(System.in);//create the object of Scanner class to get input from user.
        // than get the two value decimal number and destination number.
        System.out.print("Decimal number: ");
        int decimal_number = scan.nextInt();
        System.out.print("Destination number(2,8,16): ");
        int dstNumber = scan.nextInt();
        // than call the  method decimalTo_others with two value.
        System.out.println(obj_new.decimalTo_others(decimal_number,dstNumber));
    }
}