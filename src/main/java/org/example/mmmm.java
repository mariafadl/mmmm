package org.example;

import java.util.Scanner;

public class mmmm{

    public static void main(String[] args) {
//h

//        double totalTemp = 0;
//        int ecoCount = 0;
//        boolean overheating = false;
//        for (int hour = 1; hour <= 8; hour++) {
//
//
//            System.out.print("Hour " + hour + " Enter temperature : ");
//            Scanner scanner = new Scanner(System.in);
//            int temp = scanner.nextInt();
//
//            totalTemp = totalTemp + temp; it
//
//            // Decide what the AC should do based on the temperature
//            if (temp > 26) {
//                System.out.println(" AC ON ");
//            } else if (temp >= 20) {
//                System.out.println("ECO MODE ");
//                ecoCount++;
//            } else {
//                System.out.println(" AC OFF");
//            }
//
//            // Check separately if we hit a dangerous temperature
//            if (temp >= 30) {
//                overheating = true;
//            }
//        }
//
//        double average = totalTemp / 8;
//
//        System.out.println("the average temperature is " + average);
//        System.out.printf("Average Temperature : %.2f C%n", average);
//        System.out.println("ECO Mode Hours      : " + ecoCount + " hour(s)");
//
//        if (overheating) {
//            System.out.println("Alert: Severe Overheating!");
//        }
//

        int e=0;
        int on=0;
        int off=0;
        for (int i = 1; i <= 8; i++) {
            System.out.println("hour"+i );

            Scanner input = new Scanner(System.in);
            int temp = input.nextInt();
            if (temp >= 20 && temp < 26) {
                System.out.println("eco");
               e+=1 ;

            }
           else if (temp >= 26 ) {
                System.out.println(" on its hot");
                on+=1;
            }
            else {
                System.out.println("off its cold ");
                off+=1;
            }

        }
        System.out.println("Ave_Of_Eco_Hours="+e);
        System.out.println("Ave_Of_on_Hours="+on);
        System.out.println("Ave_Of_off_Hours="+off);

   }
}