import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.reflect.Array;


/**
 * Created by Jared on 7/24/17.
 */
public class CarLotApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userAnswer = "";
        //new instance of/ object of CarLot class
        CarLot lot = new CarLot();
        lot.addCar("Ford", "Focus", 2001, 11000.00, "used", 10000);
        lot.addCar("Chevy", "Cavalier", 2017, 22000.00);
        lot.addCar("Cadillac", "Escalade", 2013, 14000.00, "used", 50000);
        lot.addCar("Lincoln", "Navigator", 2017, 15000.00);
        lot.addCar("Chrysler", "300", 2015, 55000, "used", 47000);
        lot.addCar("Ford", "Explorer", 2017, 17500);
//        do {
//            //allow user to input make, model, year, price of car for a new car
//            System.out.println("Add a car: ");
//            System.out.println("Make: ");
//            String mk = scan.nextLine();
//            System.out.println("Model: ");
//            String ml = scan.nextLine();
//            System.out.println("Year: ");
//            int y = scan.nextInt();
//            System.out.println("Price: ");
//            double pc = scan.nextDouble();
//            scan.nextLine();
//
//            //call method from CarLot class to add a new car
//            lot.addCar(mk, ml, y, pc);
//
//            System.out.print("Would you like to add a car? (Enter 'yes' or 'no'): ");
//            userAnswer = scan.nextLine();
//
//        } while(userAnswer.equalsIgnoreCase("yes"));
        String contin = "";
        do {
        try {
            System.out.println(lot.getCars());
        } catch (IndexOutOfBoundsException e) {
            System.out.println();
        }
        System.out.println("Select a car: ");
        int selection = scan.nextInt();
        Car b = lot.getCars(selection);
        String bee = b.toStringMoreInfo();
        System.out.println(bee);
        System.out.println("Would you like to buy this car?");
        String buy;
        scan.nextLine();
        buy = scan.nextLine();
        if (buy.contains("y") || buy.contains("Y")) {
            System.out.println("Congrats your purchase!");
            try {
            lot.removeCars(selection);
            }
            catch (IndexOutOfBoundsException e) {
                System.out.println();
            }
        } else {
            System.out.println(buy);
            System.out.println("OK");
        }

            System.out.println("Select another car? (y/n)");
            contin = scan.nextLine();
    } while (contin.contains("Y") || contin.contains("y"));
        System.out.println("Thanks for stopping by!");
}}
