package be.intecbrussel;

import java.util.Arrays;
import java.util.Scanner;


public class SumUtility {


    public static void main(String[] args) {


        Scanner keyboard = new Scanner((System.in));



        System.out.println("Fill in the hour you started working. [0-23] ");
        int hour1 = keyboard.nextInt();

        System.out.println("Fill in the minutes you started working. [0-59] ");
        int minutes1 = keyboard.nextInt();

        System.out.println("Fill in the hour you stopped working. [0-23] ");
        int hour2 = keyboard.nextInt();

        System.out.println("Fill in the minutes you stopped working [0-59]");
        int minutes2 = keyboard.nextInt();

        // Thanks, I will commence the calculation.


        int Sum1 = hour2 - hour1;

        if (hour1 > hour2) {
            Sum1 = (hour2 + 24) - hour1;
        }


        int Sum2 = minutes2 - minutes1;
        if (minutes1 > minutes2) {
            Sum2 = (minutes2 + 60) - minutes1;
            --Sum1;
        }





        System.out.println("You have worked: " + Sum1 + " hours " + " and " + Sum2 + " minutes ");


        System.out.println("Please fill in the number of the day you started working: ");


        String[] my_array = {
                "Monday[1]",
                "Tuesday[2]",
                "Wednesday[3]",
                "Thursday[4]",
                "Friday[5]",
                "Saturday[6]",
                "Sunday[7]",
        };
        System.out.println(Arrays.toString(my_array));
        // Declare string object
        String StringValue = " [Monday[1], Tuesday[2], Wednesday[3], Thursday[4], Friday[5], Saturday[6], Sunday[7]]";
        // define the regex parameter
        String regex = ",";
        //split the string object
        String[] output = StringValue.split(regex);
        System.out.println();
        // printing the array contents
        System.out.println(output[0]);
        System.out.println(output[1]);
        System.out.println(output[2]);
        System.out.println(output[3]);
        System.out.println(output[4]);
        System.out.println(output[5]);
        System.out.println(output[6]);
        System.out.println();

        int days = keyboard.nextInt();

        int day1 = 24 - hour1;
        int day2 = hour2;

        if( hour2 > hour1){
            day1 = hour2 - hour1;
            day2 = 0;
        }
        double pay = 0;
        switch(days){
            case 1:
            case 2:
            case 3:
            case 4:pay = day1*11.5+day2*11.5;break;
            case 5:pay = day1*11.5+day2*11.5*1.25;break;
            case 6:pay = day1*11.5*1.25+day2*11.5*1.5;break;
            case 7:pay = day1*11.5*1.5+day2*11.5;break;

        }
        System.out.println("you have earned: " + pay);



        System.out.println();
    }

}






