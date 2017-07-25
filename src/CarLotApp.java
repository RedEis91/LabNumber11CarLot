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
        CarLot lot = new CarLot( );

        do {
            //allow user to input make, model, year, price of car for a new car
            System.out.println("Add a car: ");
            System.out.println("Make: ");
            String mk = scan.nextLine();
            System.out.println("Model: ");
            String ml = scan.nextLine();
            System.out.println("Year: ");
            int y = scan.nextInt();
            System.out.println("Price: ");
            double pc = scan.nextDouble();
            scan.nextLine();

            //call method from CarLot class to add a new car
            lot.addCar(mk, ml, y, pc);

            System.out.print("Would you like to add a car? (Enter 'yes' or 'no'): ");
            userAnswer = scan.nextLine();

        } while(userAnswer.equalsIgnoreCase("yes"));

        System.out.println(lot.getCars());

        System.out.println("Which car do you want to buy: ");
        int userInput = scan.nextInt();
        lot.removeCars(userInput);


        System.out.println("Select a car  you would you like to know more info");






    }
}
